package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//액션리스너를 인터페이스로 하는 클래스명으로 출력 가능(선언부, 생성부 이름이 다름)
//자바는 단일 상속만 extends 가능하다. 다중 상속은 불가하다. 다중상속의 단점을 보완하기 위해 인터페이스가 제공됨.
//단, 인터페이스는 다중으로 implements 가능함. 클래스 간 결합도가 낮은 코드를 작성하도록 가이드가 됨, 예 : Thread  
//추상클래스와 인터페이스는 설계적 관점에서 중요 -> 2~3년차 작업
public class DeptManager extends JFrame implements ActionListener {
	/*선언부*/
	List<DeptDTO> deptList = new ArrayList<>(); //왜 데이터를 전변으로 넣는가? 입력|수정|삭제|조회를 생각하면 유지되어야 하기에!
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
	public DeptManager() { //디폴트 생성자
		initDisplay();
		getDeptList(); //메소드 호출!! -> 전변의 값으로 배열을 받고 있었으니 초기화되어 출력됨. 
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
	public List<DeptDTO> getDeptList(){
		DeptDTO dept = new DeptDTO(10, "영업부", "부산");
		deptList.add(dept);
		dept = new DeptDTO(20,"개발부","대전");
		deptList.add(dept);
		dept = new DeptDTO(30, "운영부","인천");
		deptList.add(dept);
		return deptList;
	}
	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //첫 MVC패턴을 사용했던 swing에서 제공되는 창의 형태!
		DeptManager dm = new DeptManager(); //상속된 JFrame도 호출이 됨.
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
			while(dtm_dept.getRowCount()>0) {       //테이블의 줄이 0 이상이면(일단 출력이 된 화면이라면)
				dtm_dept.removeRow(0);                   //0번째 로우를 삭제함. 왜? 로우가 삭제될 때 마다 dtm의 로우수가 줄어든다. 
			}
			for(int i=0;i<deptList.size();i++) {   //vector 가 3번 생성됨 
				DeptDTO rdept = deptList.get(i);   //벡터를 인스턴스화하면 벡터단위에 값을 넣을 수 있음.
				Vector<Object> v = new Vector<>();        //제네릭은 int, String 섞여있으니 Object로 일단 기입    
				v.add(0,rdept.getDeptno()); //벡터에 초기화
				v.add(1,rdept.getDname()); //벡터에 초기화
				v.add(2,rdept.getLoc()); //벡터에 초기화
				dtm_dept.addRow(v);
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
				DeptDTO rdept = deptList.remove(index);  //리스트에서 삭제해야 하니까 다트 앞에 deptList
				System.out.println(rdept+", "+rdept.getDeptno()+", "+ rdept.getDname()+", "+rdept.getLoc());
				//삭제성공하였나요?
				if(rdept!=null) {
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

