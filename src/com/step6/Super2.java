package com.step6;

public class Super2 extends Super1{
	int b = 2;
	public Super2() {
		methodB();
	}
	public void methodC() {
		System.out.println("methodC 호출");
	}
	public void methodB() {
		//내가 선언한 변수가 아니어도 부모의 변수, 메소드를 호출할 수 있음.
		methodA();
		System.out.println("Super1의 변수 a 호출 : "+a);
		System.out.println("methodB 호출");
	}
	public static void main(String[] args) {
	}

}
