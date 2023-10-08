package practice;

import java.util.Random;

public class Return1 {
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
		Return1 r1 = new Return1();
//		System.out.println(r1.m());        /void x
		System.out.println(r1.m2());
		System.out.println(r1.m3());
		System.out.println(r1.m4().nextInt(10));
		System.out.println(r1.m5().nextInt(5));
	}

}
