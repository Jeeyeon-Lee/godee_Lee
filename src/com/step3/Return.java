package com.step3;

import java.util.Random;

public class Return {
	void m() {              
		System.out.println("void 리턴타입의 경우, 반환값을 받을 수 없다");
	}
	int m2() {              //
		System.out.println("int 리턴타입의 경우, 반환값을 받을 수 있다");
		return 0;
	}
	String m3() {
		System.out.println("String 리턴타입의 경우, 반환값을 받을 수 있다");
		return "높여라";
	}
	Random m4() {
		System.out.println("클래스 리턴타입의 경우, 반환값을 받을 수 있다");
		return new Random();   //변수선언 없이 직접 객체 생성 -> 이전 : Random r = new Random(); 후 r 로 기입
	}
	Random m5() {
		System.out.println("클래스 리턴타입의 경우, 반환값을 받을 수 있다");
		return new Random();   //변수선언 없이 직접 객체 생성 -> 이전 : Random r = new Random(); 후 r 로 기입
	}
	public static void main(String[] args) {
		Return r = new Return();
//		int i = r.m();                       //반환값이 갈 수 없는 메소드이기 때문에 반환값 넣을 수 x
//		System.out.println(r.m());      //반환값이 갈 수 없는 메소드이기 때문에 반환값 넣을 수 x
		int i = r.m2();                     //반환값이 갈 수 있는 메소드이기 때문에 반환값 넣을 수 ㅇ
		System.out.println(r.m2());    //반환값이 갈 수 있는 메소드이기 때문에 반환값 넣을 수 ㅇ
		System.out.println(r.m3());    //반환값이 갈 수 있는 메소드이기 때문에 반환값 넣을 수 ㅇ
		//m4와 m5 메소드의 리턴타입은 오브젝트이다.
		//그러므로 뒤에 메소드를 호출할 수 있다.
		System.out.println(r.m4().nextInt(10));    //반환값이 갈 수 있는 메소드이기 때문에 반환값 넣을 수 ㅇ
		System.out.println(r.m5().nextInt(5));    //반환값이 갈 수 있는 메소드이기 때문에 반환값 넣을 수 ㅇ
} 

}
