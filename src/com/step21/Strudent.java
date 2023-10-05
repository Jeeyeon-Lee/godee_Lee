package com.step21;

public class Strudent {
	int html = 0;
	int css = 0;
	int java = 0;
	public static void main(String[] args) {
//		for문 사용
//		for(1-초기화; 2-조건식; 3-증감연산자){}
//		조건식이 true일 때, for문 안의 실행문이 차례대로 실행됨(밖에서 실행 x or 밖에서 실행하여 접근)
//		int i;
//		for(i = 0; i < 3; i = i+1) {  //0 > 1 > 2 
//			Strudent s = new Strudent();
//			System.out.println(s);  //파라미터 안의 s는 참조형타입이기 때문에 주소번지가 출력
//		} //end of for, i가 3이될 때 탈출 
//		System.out.println(i); // 3으로 출력
		
//		for문 사용x         ->같은 타입 클래스 인스턴스화하여 복제하고, 각기 다른 전역변수의 값을 관리할 수 있음. 
		Strudent s = new Strudent();
		s.html = 70;
		s.css = 80;
		s.java = 90;
		System.out.println(s);
		s = new Strudent();
		s.html = 60;
		s.css = 70;
		s.java = 80;		
		System.out.println(s);
		s = new Strudent();
		s.html = 50;
		s.css = 60;
		s.java = 70;		
		System.out.println(s);
	}

}
