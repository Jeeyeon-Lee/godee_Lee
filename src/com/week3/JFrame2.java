package com.week3;
class A{
	JFrame2 jf = null;
	public A(JFrame2 jf) {
		System.out.println("A this 호출");
		System.out.println(jf.i);         //1을 쥐고 있다.
		System.out.println(jf);
//		System.out.println(this.jf.i);   //null로 초기화된 상태여서 에러
		this.jf = jf;
		System.out.println(this.jf.i);   //1을 쥐고 있다.
		System.out.println(this.jf);
	}
}
class B{
	
}
public class JFrame2 {
	int i = 1;
	//전변위치
	//A a = new A(this);
	JFrame2(){
		A a = new A(this);
	}
	//main스레드이다- entry point
	//메인메소드(스레드 - > 엔트리포인트, 이클립스 가장 먼저 실행되는 부분)
	public static void main(String[] args) {
		System.out.println("메인 호출");
		JFrame2 jf = new JFrame2();     //JFrame2 생성자 호출, java는 선언부가 아닌 생성부에서 생성이 됨. 
		System.out.println(jf);
	}

}
