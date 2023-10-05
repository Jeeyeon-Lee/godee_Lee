package com.step1;
 //서로 다른 패키지라 하더라도 서로 상속관계에 있으면 접근할 수 있다.
//접근할 수 없다 - friendly상태임
class P{// 접근제한자가 아무것도 없으면 friendly상태라 함
	static int i = 1;
	int j = 10;
}

public class Test2 {
	public void methodC() {
		P.i = P.i+2;//3
	}
	public static void main(String[] args) {
		//insert here
		P.i = 2;
		System.out.println(P.i);
	}//end of main 
}////end of Test
/*
	메소드 선언할때도 좌중괄호와 우중괄호를 사용해서 영역을 표시한다.
	메소드를 호출할때는 세미콜론으로 끝낸다.
*/