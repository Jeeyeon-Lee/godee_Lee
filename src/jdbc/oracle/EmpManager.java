package jdbc.oracle;
//데이터 셋 담당 디폴트 테이블 모델 API 활용하기 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpManager extends JFrame {
	/*선언부*/
	String data[][] = new String[3][3];
	String header[] = {"사원번호", "사원명","급여"};
	DefaultTableModel dtm = new DefaultTableModel(data,header);       //값(web에서 JSON의 역할이 됨)
	JTable jt = new JTable(dtm);                                                         //틀
	JScrollPane jsp = new JScrollPane(jt);                                             //속지의 일부
	/*생성자*/
	public EmpManager() {
	}
	/*정의메소드*/
	public void initDisplay() {
		System.out.println("initDisplay 호출");
		this.add("Center",jsp);  //(위치, 컴포넌트)
		this.setSize(500,300);
		this.setVisible(true);
	}
	public void test() {
		System.out.println("test 호출");
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

}
