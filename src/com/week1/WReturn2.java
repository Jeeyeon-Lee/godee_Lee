package com.week1;

public class WReturn2 {
	int i;  // 전역변수 i 
	void methodA() { //리턴타입이 못오는 리턴타입 void를 사용
		int i = 2; //지역변수
		System.out.println("지역변수 i " + i);
	}
	int methodB() { 
		int i = 1; //지역변수 i
		return i;  //i=1
	}
	
	public static void main(String[] args) {
		WReturn2 w=new WReturn2();
		System.out.println("메인에서 methodB 호출 w.methodB()"+ w.methodB()); //메소드B는 리턴타입이 오는 리턴타입 int를 사용해서 메인에서 출력 가능
		w.methodA(); //메소드A는 리턴타입이 못오는 리턴타입 void여서 해당 함수에서 출력을 남겨야 지역변수 출력 가능
		System.out.println("클래스의 전역변수 호출 w.i "+w.i); // 전역변수 호출 
	}
}
