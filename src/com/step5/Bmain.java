package com.step5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class B1{
	JButton jbtnSelect = new JButton("조회");
}
class B2{
	JButton jbtnSelect = new JButton("입력");
}
public class Bmain implements ActionListener{
	//B1을 참조하기 위해 생성한 위치에 따라 활용의 범위가 달라짐, 
	//전변의 위치에 생성할 경우, 유지(쿠키-로컬/세션-서버에서 캐쉬메모리/시간지배 가능), 가치, 활용범위 넓음.
	JFrame jf = new JFrame();  //javax.swing.JFrame 패키지 : 자바최초 MVC패턴 API 적용 사례
	//생성자로 호출하는 것, 메인에서 메소드를 호출하는 것의 차이를 알아야 함.  
	//아래 B1, B2의 선언과 생성방법의 차이는 무엇일까???  
	B1 b1 = new B1();  //선언 및 생성
	B2 b2 = null;         //선언만
	public Bmain() {
		//시간이 오래걸리는 작업들도 있기에 각자의 위치 선정이 중요!
		//이벤트 소스, 이벤트 처리를 담당하는 클래스 연결하기 - 콜백메소드(시스템이 자동으로 호출-시점결정권이 개발자에게 없음) 호출 
		//주소번지를 두 번 접근해야 이벤트 처리가 가능한 경우
		//예 : 이차배열, 객체배열, 제네릭(다이아몬트연산자) 
		b1.jbtnSelect.addActionListener(this);
		b2 = new B2();  //생성하기-생성자 경유
		initDisplay();
		for(double d=0.0;d<9999.0;d++) {
			System.out.println("지연"); 
		}
	}
	public void initDisplay() {
		//지변의 위치로 생성할 경우, 활용범위가 이 메소드 안으로 제한적임. 유지 x 
//		B1 b1 = new B1();
		jf.add("North",b1.jbtnSelect);
		jf.add("South",b2.jbtnSelect);
		jf.setVisible(true);
		jf.setSize(500,400);
	}
	public static void main(String[] args) {
		Bmain bm = new Bmain();
	}
	
	//이벤트처리
	@Override
	public void actionPerformed(ActionEvent e) {
		//사용자가 누른 버튼에 대한 주소번지 얻어내기
		//어느건지 모르니 object
		Object obj = e.getSource();
		//조회 누른거니?
		if(obj == b1.jbtnSelect) {
			System.out.println(b1.jbtnSelect.getText());
		}
		//입력 누른거니?
		else if(obj == b2.jbtnSelect) {
			System.out.println(b2.jbtnSelect.getText());
		}
	}
}