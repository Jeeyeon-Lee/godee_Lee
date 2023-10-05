package com.week2;
//A메소드 없을 때 순서 : 메인(선언) - 생성자 - 메인(메소드실행) - initDisplay() 메소드 실행 - 메인마무리
//A메소드 있을 때 순서 : 메인(선언) - 생성자 - 메인(메소드실행) - initDisplay() 메소드 실행 - 메인(메소드실행) - methodA 실행
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	//파라미터가 없으니 JVM에서 대신 만들어줄 수 있음. 
	//파라미터가 있으면 JVM에서 만들어 줄 수 없음(JVM이 임의로 정하면 안되니까)
	public JFrameTest1() {   //파라미터가 없는 생성자 - 디폴트 생성자 호출(선언)
		System.out.println("디폴트 생성자 호출");
		//생성자 안에서는 static이 없어서 인스턴스 변수 없이 사용가능함.
		initDisplay();
		//아래 메소드는 이름은 같지만 파라미터의 갯수가 달라서 다른 메소드로 인지함.(메소드 오버로딩)
		methodA(); //25번의 메소드임.
	}
	//사용자 정의 메소드 - 화면출력 메소드 선언해보기
	public void initDisplay() {
		System.out.println("initDisplay() 호출");
		//내 안에 선언된 메소드가 아니다. 그럼 어디에? JFrame에 있음. 
		//this는 자바가 제공하는 수정자이고, 보통 자기 자신을 가리킬 때 사용함.
		//주로 전변과 지변의 이름이 같은 경우, 구분하기 위해 개발자가 명시적으로 붙여준다.(생략x, 직관적)
		this.setSize(500,400);     //메소드 호출
		this.setVisible(true);
	}
	public void methodA() {
		System.out.println("methodA() 호출");
	}
	public void methodA(JFrameTest1 jft) {  //이렇게 참조형으로 넣는 것을 늘려야 함. 
		//27번과 32번이 같은 것을 참조하고 있는것인지? 
		//지변이지만 메소드 호출시 파라미터를 통해서 원본을 넘길 수 있다.
		System.out.println("methodA(JFrameTest1 jft) 호출");
		System.out.println(jft);
	}
	public static void main(String[] args) {
		//메인 메소드 내부에서 인스턴스화를 하게 되면 지변의 성격을 갖게 됨.
		JFrameTest1 jft = new JFrameTest1();
		System.out.println(jft); //지변이지만 메소드 호출시 파라미터를 통해서 원본을 넘길 수 있다.
		//메소드 파라미터 자리가 원시형 타입인 경우, 갯수 판단하고 결정
		//메소드 파라미터 자리가 참조형 타입인 경우, 동일
		jft.methodA(jft); //참조형 타입
	}
}