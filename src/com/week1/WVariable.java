package com.week1;

//코딩연습할 때 가능하다면 두 개 클래스를 준비해주세요.(등장인물 두 개 등장 -> 전변에 대해 깊게 이해하게 됨)

class Dog{
	int leg = 4; //클래스 선언뒤 바로 입력 -> 전역변수
	public void running() {
		int leg = 6; //메소드 안에서 입력 -> 지역변수
		System.out.println("running메소드를 인스턴스화하여 호출 = "+leg + "개"); //왜 출력이 안될까? 메인메소드에 running 함수를 불러오도록 인스턴스화 하여 실행!! 
	}
}

public class WVariable {
	//16-17(인스턴스화 : 메모리에 로딩 중)-6-19
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		//6을출력할 수 있다 -> 전역변수가 호출되었다!!
		System.out.println("Dog 클래스를 인스턴스화하여 호출 = " + myDog.leg + "개");
		//6을 출력할 수 있나요?
		System.out.println("상수를 사용한 의미없는 호출 = "+6 + "개"); //상수를 출력하는 것은 의미x, 다른 방법 시도
		//running 메소드는 어느 클래스에 선언되어 있는가? 
		//그렇다면 러닝메소드를 호출하여 실행하면 됨
		myDog.running(); //6 출력 가능
	}
}
