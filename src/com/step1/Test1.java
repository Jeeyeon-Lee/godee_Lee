package com.step1;

public class Test1 {
	int i = 1;//전변 - 전변은 같은 이름의 변수명을 절대로 허락하지 않는다
	//int i = 2;
	public void methodA() {
		System.out.println("methodA 호출 성공");
		int i = 2;//지변이잖아 - 같은 변수명을 사용할 수  있는 거야
		//int i = 3;
		// 메소드 내에서 선언된 변수는 모두 지역의 성격이다.
		//그래서 메소드이름이 다르며 같은 변수이름을 사용할 수 있다. 괜찮아
		Test1 t1 = new Test1();
		//왜 나는 여기에 인스턴스화를 했을 까? - > t1.j t1.i
		//인스턴스변수.전역변수
		//지역변수는 인스턴스변수.호출 할 수가 없다
		int j;//
		j = 4;
		System.out.println("j ====> " + j);
	}
	//9-11-12-5-6-7-13-14
	public static void main(String[] args) {
		//insert here
		Test1 t1 = new Test1();//인스턴스화라고 말한다. 이때 t1은 인스턴스변수라 하자
		t1.methodA();
	}//end of main 
}////end of Test
/*
	메소드 선언할때도 좌중괄호와 우중괄호를 사용해서 영역을 표시한다.
	메소드를 호출할때는 세미콜론으로 끝낸다.
*/