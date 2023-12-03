package jdbc.oracle;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//데이터 셋 담당 디폴트 테이블 모델 API 활용하기 
//ActionListener al = new EmpManager();
//ActionPerformed 구현체 클래스 
public class EmpManager extends JFrame implements ActionListener {
	/*선언부*/
	JPanel jp_north = new JPanel();
	JButton jbtn_select   = new JButton("조회");
	JButton jbtn_insert   = new JButton("입력");
	JButton jbtn_update = new JButton("수정");
	JButton jbtn_delete  = new JButton("삭제");
	String data[][] = new String[0][3]; //헤더만 
	String header[] = {"사원번호", "사원명","급여"};
	DefaultTableModel dtm = new DefaultTableModel(data,header);       //데이터 값(web에서 JSON의 역할이 됨)
	JTable jt = new JTable(dtm);                                                         //틀, 양식, 표
	JScrollPane jsp = new JScrollPane(jt);                                             //속지의 일부
	/*생성자*/
	public EmpManager() {
		init();
	}
	/*정의메소드*/
	//데이터 초기화 메소드
	public void init() { //선언과 생성을 나눌 때는 아래처럼 작성해야함 
		data = new String[][] {
				{"7566","나신입","3000"},
				{"7499","나초보","4000"},
				{"7748","나일등","4500"}
		};
		/*
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("data["+i+"]["+j+"] "+data[i][j]+"/ ");
			}
			System.out.println("data["+i+"]의 주소값 "+data[i]+"/ ");
		}
		*/
	}
	//화면구현
	public void initDisplay() {
		System.out.println("initDisplay 호출");
		jbtn_select.addActionListener(this); //this는 나 자신 EmpManager 
		jbtn_insert.addActionListener(this); //this는 나 자신 EmpManager 
		jbtn_update.addActionListener(this); //this는 나 자신 EmpManager 
		jbtn_delete.addActionListener(this); //this는 나 자신 EmpManager 
		jp_north.setLayout(new GridLayout(1,4)); //GridLayout은 창을 n으로 나누어서 가득 사용-1*4 레이아웃을 새로 구성(default는 왼쪽에서부터 오른쪽으로 생성되며 공간이 남음)
		jp_north.add(jbtn_select);
		jp_north.add(jbtn_insert);
		jp_north.add(jbtn_update);
		jp_north.add(jbtn_delete);
		Container con = this.getContentPane();
		dtm = null;
		dtm = new DefaultTableModel(data, header);
		jt = null;
		jt = new JTable(dtm);
		jsp = null;
		jsp = new JScrollPane(jt);
		this.add("Center",jsp);  //(위치, 컴포넌트)
		this.setSize(500,300);
		this.setVisible(true);
		this.add("North",jp_north);
	}
	/*메인메소드*/
	public static void main(String[] args) {
//		//선언부가 없으면 재사용 x,딱 한번만 사용할 때 (창만 띄울 거)
//		new EmpManager(); 
//		new EmpManager().initDisplay();
//		//test 메소드만 호출하고 싶은데 창이열릴 경우, 사이드 이펙트(부작용)임. 생성자에 써두었기 때문에
//		new EmpManager().test(); 
//		//사이드이펙트(창이뜨는 부작용) 없애려면?
		EmpManager em = new EmpManager();
		em.initDisplay();
	}
	@Override 
	public void actionPerformed(ActionEvent e) { //여기 파라미터값은 JVM이 넣어줌 
		Object obj = e.getSource();
		//수정버튼 눌렀을 때
		if(obj==jbtn_update) {//저장된 배열위치 확인 필요->초기화 진행		
			System.out.println("수정 버튼 클릭");
			System.out.println(dtm.getRowCount());
			for(int i=0;i<dtm.getRowCount();i++) {   //테이블은 로우와 컬럼으로 구성되어 테이블 구조 
				//is가 붙는 메소드는 boolean을 리턴타입으로 가져서 if문, while문에서 사용한다 . 
				if(jt.isRowSelected(i)) { //너가 선택한 로우값은? 
				//나초보랑 같은 row값이라면? String name = dtm.getValueAt("나초보",1,1)
				//나초보에 해당하는 row값이면 ? setValueAt
					String cname = (String)dtm.getValueAt(i, 1);
					System.out.println(cname);
					if("나초보".equals(cname)) { 
						dtm.setValueAt(5000, i, 2);  
					}
					else if("나신입".equals(cname)) { 
						dtm.setValueAt(3500, i, 2);  
					}
					else if("나일등".equals(cname)) { 
						dtm.setValueAt(5500, i, 2);  
					}
				}
			}
		}
	}
}
