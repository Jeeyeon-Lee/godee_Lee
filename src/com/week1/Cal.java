package com.week1;

public class Cal {
	void sungjukCalculator(Sungjuk sungjuk) {   //성적을 계산해주는 메소드
		System.out.println("이름 : " + (sungjuk.name) + " / 점수 합계 = " + (sungjuk.scoreH + sungjuk.scoreC + sungjuk.scoreJ) + "점" + " / 점수 평균 = " + (sungjuk.scoreH + sungjuk.scoreC + sungjuk.scoreJ)/3+ "점");  
	}
	public static void main(String[] args) {
		Sungjuk sungjuk = new Sungjuk();         //성적을 인스턴스화
		Cal cal =new Cal();                              //메소드를 인스턴스화
		sungjuk = new Sungjuk();                     //나신입을 생성, 초기화
		sungjuk.name = "나신입"; 
		sungjuk.scoreH = 75;
		sungjuk.scoreC = 80;
		sungjuk.scoreJ = 90;
		cal.sungjukCalculator(sungjuk);              //메소드 활용
		sungjuk = new Sungjuk();                     //나일등을 생성, 초기화
		sungjuk.name = "나일등"; 
		sungjuk.scoreH = 10;
		sungjuk.scoreC = 20;
		sungjuk.scoreJ = 30;
		cal.sungjukCalculator(sungjuk);              //홍길동을 생성, 초기화
		sungjuk = new Sungjuk();                     //메소드 활용
		sungjuk.name = "홍길동"; 
		sungjuk.scoreH = 20;
		sungjuk.scoreC = 10;
		sungjuk.scoreJ = 80;
		cal.sungjukCalculator(sungjuk);              //메소드 활용
	}
}
