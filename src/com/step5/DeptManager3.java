package com.step5;
/*인스턴스화 
 * A a = new A();             -> 기초
 * A a = A.getInstance();    ->복제본을 허락하지 않고 원본 하나만 관리 - > 싱글톤 패턴
 * B b = new A();             ->추상클래스 상속관계
 * C c = new A();             ->인터페이스 구현체 클래스
 * */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.google.gson.Gson;
import com.util.DBConnectionMgr;

//액션리스너를 인터페이스로 하는 클래스명으로 출력 가능(선언부, 생성부 이름이 다름)
//자바는 단일 상속만 extends 가능하다. 다중 상속은 불가하다. 다중상속의 단점을 보완하기 위해 인터페이스가 제공됨.
//단, 인터페이스는 다중으로 implements 가능함. 클래스 간 결합도가 낮은 코드를 작성하도록 가이드가 됨, 예 : Thread  
//추상클래스와 인터페이스는 설계적 관점에서 중요 -> 2~3년차 작업
public class DeptManager3 extends JFrame implements ActionListener {
	/*선언부*/
	/* ****************************************************************************************************************************************/
	//JDBC API 활용하여 오라클 서버에서 부서목록 조회하기
	Connection con                = null;   // java.sql.Connection           -> java.sql.Connection -> 특정 데이터베이스와의 연결(연결통로 확보)
	PreparedStatement pstmt   = null;   // java.sql.PreparedStatement ->java.sql.PreparedStatement -> connection이 생성되어야 아래도 메모리 로딩됨  미리 컴파일된 SQL 문
	ResultSet rs                      = null;   // java.sql.ResultSet               -> java.sql.ResultSet -> open, cursor, fecth, close 커서를 조작해서 반환받는 추상클래스
	//공통코드에서 재사용가능한 메소드를 설계함 -> DBConnectionMGR
	DBConnectionMgr dbMGR = null;  // com.util.DBConnectionMgr  ->서버연결
	/* ****************************************************************************************************************************************/
	List<Map<String, Object>> deptList = new ArrayList<>(); //왜 데이터를 전변으로 넣는가? 입력|수정|삭제|조회를 생각하면 유지되어야 하기에!
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[3][3]; //데이터는 아직x, 후처리
	DefaultTableModel  dtm_dept = new DefaultTableModel(datas,header); //폼, 양식만 만들어 DataSet 구상하기! 
	//파라미터 순(2차배열 자리, 1차배열 자리)
	//javax.swing.table.DefaultTableModel.DefaultTableModel(Object[][] data, Object[] columnNames)
	JTable jt_dept          = new JTable(dtm_dept); //위 데이터를 테이블에 넣겠음.
	JScrollPane jsp_dept = new JScrollPane(jt_dept); //속지 또한 테이블을 참조함.  	
	JPanel jp_north         = new JPanel();
	JButton jbtnSelect    = new JButton("조회");
	JButton jbtnInsert    = new JButton("입력");
	JButton jbtnDelete    = new JButton("삭제");  //이 때 새로고침
	JButton jbtnAdd       = new JButton("행추가");
	JButton jbtnDel        = new JButton("행삭제");
	JButton jbtnExit        = new JButton("종료");
	/*생성자*/
	public DeptManager3() { //디폴트 생성자
		initDisplay();
		//메소드를 통해 주입받는데 앞이 인스턴스 변수가 아닌 클래스 타입이 기입됨(static이기 때문에 class 급!)
		dbMGR = DBConnectionMgr.getInstance(); //오라클 서버의 정보를 실시간으로 가져옴. 복제본을 허락하지 않고 원본 하나만 관리
	}
	/*화면처리부*/
	public void initDisplay() {
		jbtnAdd.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnInsert.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnDelete.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnSelect.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnDel.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnExit.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT)); //패널에 들어가는 내용 왼쪽으로! 
		jp_north.add(jbtnSelect);
		jp_north.add(jbtnInsert);
		jp_north.add(jbtnDelete);
		jp_north.add(jbtnAdd);
		jp_north.add(jbtnDel);
		jp_north.add(jbtnExit);
		this.add("North", jp_north);
		this.add("Center",jsp_dept); //속지-데이터-테이블 다 연동 한꺼번에 나옴. 
		this.setSize(500,400);
		this.setVisible(true);
	}
	/*정의메소드*/
	//리스트로 더하는 메소드
	public List<Map<String, Object>> getDeptList(){
		Map<String, Object> map = new HashMap<>();//복사본
		map.put("DEPTNO",10);          //대문자인 이유, 토드에서는 대문자로 사용하고 있음. 맞춰서 보내줘야함.
		map.put("DNAME", "영업부");
		map.put("LOC", "부산");
		deptList.add(map);
		map = new HashMap<>();//복사본
		map.put("DEPTNO", 20);
		map.put("DNAME", "개발부");
		map.put("LOC", "대구");
		deptList.add(map);
		map = new HashMap<>();//복사본
		map.put("DEPTNO", 30);
		map.put("DNAME", "인사부");
		map.put("LOC", "서울");
		deptList.add(map);
		return deptList;
	}
	/* ******데이터서버연동 메소드*********************************************************************************************************/
	//select가 모든 업무 페이지의 시작 페이지, 맡은 업무의 첫 시작!
	public List<DeptDTO> getDTOList() {                   //1번쨰로 연습!
		System.out.println("제네릭타입을 getter/setter로 처리할 때");
		List<DeptDTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();    //java.lang.StringBuilder.StringBuilder() -> 문자열 작성기를 구성
		sql.append("SELECT deptno,dname,loc FROM dept");
		//DBConnectionMGR 연동필요 ->지변으로?전변으로?? -> 전변으로!! 
		try { //아래 코드에서 null오류가 발생했다면 생성자에서 객체 주입이 안되었던 것(42번에서 생성)
			  //생성되어야 getConnection() 메소드 호출 가능하고
			  //호출되어야 리턴값으로 Connection 객체를 주입받음. 
			con = dbMGR.getConnection();
			pstmt = con.prepareStatement(sql.toString()); // preparedStatement java.sql.Connection.prepareStatement(String sql) throws SQLException
			rs = pstmt.executeQuery(); // ResultSet java.sql.PreparedStatement.executeQuery() throws SQLException
			DeptDTO dto =null; 
			while (rs.next()) {
				//생성자로 초기화 or DB의 값으로 초기화 필요  -> 생성자로 사용
				dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				//아래 코드를 통해 정보가 주소번지가 생기며 저장이 된다.
				list.add(dto);
			}
			//list로 입력내용 확인
			System.out.println(list);
			/*
			브라우저(html, js 등)를 통한 출력일 때 사용하면 됨. 
			자바를 통해 DB연동한 후 후처리의 개념(자바컬렉션 프레임워크 -> JSON 포맷으로 변경함)
			Gson g = new Gson();
			String temp = g.toJson(list);
			*/
			//예외처리 추가
		} catch (SQLException se) {
			System.out.println(se.toString());// -> 부적합한 식별자  - 컬럼명이 존재하지 않을 때 - SQLException해당됨
		} catch (Exception e) {
			e.printStackTrace(); // void java.lang.Throwable.printStackTrace()  -> 이력을 라인번호와 함께 보여줌?
		}
		return list;
	}
	public List<Map<String, Object>> getMapList() {  //2번째로 연습! Map 두 개 이상 조인할 때 유용, 이것으로 많이 연습 필요!
		System.out.println("제네릭 타입을 Map으로 처리할 때");
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		return list;
	}
	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //첫 MVC패턴을 사용했던 swing에서 제공되는 창의 형태!
		DeptManager3 dm = new DeptManager3(); //상속된 JFrame도 호출이 됨.
	}
	@Override //추상메소드 구현체클래스
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출은 반드시 addactionLister가 필요");
		Object obj = e.getSource();
		//버튼이 눌렸을 때의 이벤트 입력
		/*조회하기*/
		if(obj == jbtnSelect) {     //너 조회눌렀어?
			System.out.println("조회버튼 클릭");        //"로그" 어디까지 출력되고 있는지, 이력을 확인하는 용
			/*java는 html의 데이터를 쥘 수 없기 때문에 jsp를 공부 예정임.*/
			/*여기서 dtm은 데이터셋(자바측의)을 받는 클래스임. 데이터 값이 들어가는 것이었음. */
			/*Jtable은 틀만 갖고 있어 클릭이벤트는 가능하고, 데이터를 쥐고 있지 못 함. */
			/*getRowCount는 실제 데이터의 로우 수를 반환함.*/
			//메소드를 경유하도록 생성함.(오라클 서버에서 조회한 결과를 쥐고 있음)
			//리턴타입이 쥐고 있음. 
//			List<DeptDTO> list = new ArrayList<>();  //이전에 사용했던 생성
			List<DeptDTO> list = getDTOList();
			while(dtm_dept.getRowCount()>0) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
				dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
			}
			for(int i=0;i<list.size();i++) {   //list 사이즈는 4임? 
				DeptDTO dept = list.get(i);
				Vector<Object> v = new Vector<>();        //제네릭은 int, String 섞여있으니 Object로 일단 기입    
				v.add(0,dept.getDeptno()); //벡터에 초기화
				v.add(1,dept.getDname()); //벡터에 초기화
				v.add(2,dept.getLoc()); //벡터에 초기화
				//addRow메소드 오버로딩은 Vector, Object[]-1차 배열임 -> Vector로 처리하기로 함.
				dtm_dept.addRow(v);    //row에 추가하는 코드를 4번 실행 왜? list.size가 4임. 
			}
		}
		/*삭제하기*/
		else if(obj==jbtnDelete) { //삭제를 눌렀어?
			System.out.println("삭제버튼 클릭");
			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
				JOptionPane.showMessageDialog(this, "삭제할 데이터를 선택하시오.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				return; //메소드 탈출
			}
			else {  //로우를 선택했을 때 데이터를 삭제하기
				System.out.println(index);//선택하고 누른 데이터는 몇 번째 로우인가????
				//insert here
				Map<String, Object> map = deptList.remove(index);  //리스트에서 삭제해야 하니까 다트 앞에 deptList
				System.out.println(map+", "+map.get("DEPTNO")+", "+ map.get("DNAME")+", "+map.get("LOC"));
				//삭제성공하였나요?
				if(map!=null) {
					JOptionPane.showMessageDialog(this, "삭제 성공 하셨습니다..","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
					refreshData(); //새로고침 메소드 호출
				}
				else {
					JOptionPane.showMessageDialog(this, "삭제 실패하셨습니다.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				}
			}
			}
		/*행추가 하기*/
		else if(obj==jbtnAdd) { //행추가 눌렀어? jp에 add 처리 필요! 
			System.out.println("행추가버튼 클릭");
			//행추가 방법 1. Vector 사용
			Vector<Object> addRow = new Vector<>();
			dtm_dept.addRow(addRow);
			//행추가 방법 2. 1차 배열 사용
//			Object addRow2[] = new Object[3];
//			dtm_dept.addRow(addRow2);
			
		}
		/*행삭제 하기 1번*/
//		else if(obj==jbtnDel) { //행삭제 눌렀어? 데이터가 사라지는게 아니라 UI에서 없애는 것!! jp에 delete 처리 필요! 
//			System.out.println("행삭제버튼 클릭");
//			dtm_dept.removeRow(0);
//			//한줄도 안남으면 멈춰야지 if로!! 
//			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
//			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
//				JOptionPane.showMessageDialog(this, "행을 삭제했습니다.","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
//				return;
//			}else {
//				dtm_dept.removeRow(index);
//			}
//		}
		/*행삭제 하기 2번*/
		else if(obj == jbtnDel) {
//			//한줄도 안남으면 멈춰야지 if로!! 
			int index = jt_dept.getSelectedRow(); //사용자가 선택한 로우의 인덱스값을 반환하기
			if(index<0) {  //아무것도 선택안했을 때, 삭제할 데이터 선택하라고 하기
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요","INFO",JOptionPane.INFORMATION_MESSAGE); //클래스, 메시지, 타이틀명, 아이콘
				return;
			}else {
				dtm_dept.removeRow(index);
			}
		}
		/*입력 하기*/
		else if(obj==jbtnInsert) {
			System.out.println("입력버튼 클릭");
			List<Object> addRow = new Vector<>();
			dtm_dept.addRow((Vector<?>) addRow);
		}
		//JButton jbtnExit        = new JButton("종료");
		else if(obj == jbtnExit) {
			System.out.println("종료 버튼 클릭");
		    int option = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
		    if (option == JOptionPane.YES_OPTION) {
		    	System.exit(0);
		    }
		}
	}
	//새로운 정보 저장하는 메소드 
//	public void addData() {
//		while(dtm_dept.getRowCount()) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
//			dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
//		}
//	}
	//새로고침(F5) 구현하기   -> 메소드 중심 코딩 전개
	public void refreshData() {
		while(dtm_dept.getRowCount()>0) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
			dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
		}
	}
}
			
			/* 이전에 직접 입력하던 방식
			String sample[][] = {
					{"10","영업부","부산"}	
					,{"20","개발부","대전"}	
					,{"30","운영부","인천"}	
			};
			this.getContentPane().removeAll();; //remove All
			dtm_dept = null;
			dtm_dept = new DefaultTableModel(sample,header); //0*0 빈 값 테이블에서 3*3으로 재정의
			jt_dept = null;
			jt_dept = new JTable(dtm_dept);
			jsp_dept = null;
			jsp_dept = new JScrollPane(jt_dept); 
			this.add("Center",jsp_dept); 
			this.revalidate();
			this.repaint();
		}
		*/

