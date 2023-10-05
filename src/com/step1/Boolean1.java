package com.step1;
//불리언은 true 혹은 false를 갖는다.
//조건문이나 반복문에 사용됨 - 중요함
public class Boolean1 {
	//int이면 정수만 담음
	//double선언하면 실수도 담음
	//boolean이면 int안돼, double안돼, false or true
	public static void main(String[] args) {
		boolean isOk = false;
		isOk = true;
		double d = 3.5;
		int i = 3;
		//isOk = (boolean)i;
		//isOk = 3.5;
		if(isOk) {
			System.out.println("괄호안에 조건식이 true일 때 실행됨");
		}else {
			System.out.println("거짓이면 여기로");
			
		}

	}

}
