package bclass.step2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HMain extends JFrame implements ActionListener{
	/*선언부*/
	JButton jbtn = null; //선언만
	String title = null;
	/*생성자 - 여기서 화면을 호출하는 것은 인스턴스화 발생 시 두 개의 화면이 열릴 수 있음.*/
	public HMain() {
		jbtn = new JButton("조회"); //여기서 생성
	}
	public HMain(String title) {
		this.title = title;               //여기서 전변 초기화
	}
	public void initDisplay() {
//		jbtn.addActionListener(this); 
		this.add("North",new JButton("입력")); //이벤트 발동할 때 마다 새로운 버튼이 생겨버림
		this.setVisible(true);
		this.setSize(400,400);
		this.setLocation(850,  300);
		this.setTitle(title);
	}
	public static void main(String[] args) {
		HMain hm = new HMain("타이틀");
		hm.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
/* 인스턴스화 하는 방법
1. A a = new A();
2. A a = null;                ->게으른 인스턴스화      
   	  a = new A();    
3. A a = B.getInstance();  -> 싱글톤 패턴(하나다, static 대신 사용)
4. Super s = new Sub();  -> 선언부 != 생성부(다형성) 
 	인터페이스 s = new 구현체클래스();
 	추상클래스 s = new 구현체클래스();
 
 * 폭포수모델
 분석-설계-개발-테스트-배포 : 폭포수모델
 
 * 애자일 방법론
 설계, 프로세스 무시되고 담당자의 요구사항을 즉시 반영할 수 있는 방법론
 */
 