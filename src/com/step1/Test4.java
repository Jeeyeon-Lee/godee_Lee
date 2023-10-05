package com.step1;

public class Test4 {
	//메인메소드는 콜백이라서 개발자가 호출할 수 없다.
	public static void main(String[] args) {
		//insert here
		Test2 t2 = new Test2();
		//첫번째 호출되었을 때 1에서 2가 더해진 결과가 .
		t2.methodC();
		//위 코드에서 methodC를 경유하였으므로 P클래스의 정적변수 i는
		//1에서 3으로 변경됨
		//
		t2 = new Test2();
		t2.methodC();
		//아래에서 3이 출력될 것이다 . 아니다 5가 출력되는게 맞다
		//3이라고 한 사람 - 인스턴스화 했을 때 새로 초기화가 1로 되었다.
		//5라고 한 사람 - 야 인스턴스화를 두 번했고 메소드도 두 번 호출했잖아
		
		System.out.println(P.i);//1 -> 3
		
	}//end of main 
}////end of Test
/*
 	static은 클래스 급이라서 인스턴스화 없이 호출이 가능하다.
 	9번에서 호출한 j는 static이 아니라서 클래스이름.j로 호출이 불가함
	해결방법은 인스턴스화를 하고 인스턴스변수.j로 호출해야 함
*/