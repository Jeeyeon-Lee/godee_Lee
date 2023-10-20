package jdbc.oracle;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//데이터 셋 담당 디폴트 테이블 모델 API 활용하기 
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
	Container con = new Container();
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
		this.add(con);
		this.add("Center",jsp);  //(위치, 컴포넌트)
		this.setSize(500,300);
		this.setVisible(true);
	}
	public void test() {
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
	@Override //액션리스너 al = new empmanager();
	public void actionPerformed(ActionEvent e) {
		
	}
}
