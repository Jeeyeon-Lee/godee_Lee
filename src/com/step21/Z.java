package com.step21;

public class Z {
	int i = 1;
	void m1() {
		Z z = new Z();         //새로 생성된 객체
		System.out.println(z + "객체 2");  //13번과 주소번지 같음
		System.out.println(z.i); //1출력
		m2(z);
	}
	void m2(Z x) {
		//여기에서 6번에 생성된 주소번지를 사용하고 싶다.(6번에서 생성된 객체를 사용하고 싶다) -> 12번
 		System.out.println(x + "객체 2");  //6번에 생성된 주소번지와 같음.
		//파라미터 자리에 참조형 타입 변수를 넘기면 원본을 재사용 가능
	}
	public static void main(String[] args) {
		Z z = new Z();
		z.m1();
		System.out.println(z + "객체 1");  //생성된 객체 1개
	}

}
