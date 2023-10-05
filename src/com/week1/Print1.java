package com.week1;

public class Print1 {
	static int m() {return 5;}
	static void n() {}
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println("안녕");
		System.out.println(1.5);
		System.out.println(true);
		System.out.println(Print1.m()); //return타입이 있는 int 여서 출력 o
		System.out.println("========");
//		System.out.println(Print1.n()); //return타입이 없는 void 여서 출력 x
	}
}
