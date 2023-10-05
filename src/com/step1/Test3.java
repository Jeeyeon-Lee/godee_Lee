package com.step1;

public class Test3 {
	
	public static void main(String[] args) {
		P p = new P();
		System.out.println(P.i);//1
		System.out.println(T.x);//1
	}//end of main 
}////end of Test
/*
 	static은 클래스 급이라서 인스턴스화 없이 호출이 가능하다.
 	9번에서 호출한 j는 static이 아니라서 클래스이름.j로 호출이 불가함
	해결방법은 인스턴스화를 하고 인스턴스변수.j로 호출해야 함
*/