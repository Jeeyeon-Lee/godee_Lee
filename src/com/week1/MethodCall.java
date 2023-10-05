package com.week1;

public class MethodCall {
	void methodA() {
		System.out.println("'methodA'가 호출되었습니다.");
	}
	void methodB() {
		//메소드B 안에서 A를 호출하는 것도 합법
		System.out.println("호출하면서 올라온 값으로 methodB에서 A가 그대로 호출되었습니다.");
		methodA(); //메소드B에 A를 불러오는 것이 있어서 같이 작동
	}
	public static void main(String[] args) {
		MethodCall mc = new MethodCall();
		mc.methodB(); 
	}

}
