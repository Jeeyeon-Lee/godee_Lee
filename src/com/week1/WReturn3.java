package com.week1; //1-3 실습

class Sonata{
	int speed = 0; //현재 소나타 주차 중
	String carColor = "빨강";
}
public class WReturn3 {
	//메소드의 리턴타입으로 참조형 변수를 사용할 수 있다.
	//메소드 호출을 통해서도 클래스를 메모리에 로딩할 수 있다.	
	Sonata getCar() {
		//아래 12번에서 소나타 객체를 생성하여다.		
		Sonata himCar = new Sonata();  //1-3 메소드의 파라미터로 참조형 타입(클래스)을 활용하는 단계
		//그리고 리턴으로 변수를 반환할 수 있음. 
		return himCar; 

	}
	public static void main(String[] args) {
		//아래 인스턴스화는 getCar()를 호출하기 위해
		WReturn3 w = new WReturn3();  // 클래스가 두개 출력됨
		Sonata myCar = new Sonata(); // 
		System.out.println(myCar.carColor); //전역변수여서 인스턴스변수를 다트연산자로 붙여서 호출할 수 있음.
		//get메소드를 호출하고, 리턴타입으로 Sonata 객체를 참조하는
		//변수가 선언됨		
		Sonata himCar = w.getCar();
		System.out.println(myCar); //빨강
		System.out.println(himCar);
		himCar.carColor = "검정색";
		himCar.speed = 30;
		System.out.println(himCar.carColor); //빨강
		System.out.println(himCar);
	}
}

/*
리모콘(클래스)이라고 생각, 각 버튼들로 액션을 선택(변수-색, 속도 등)하게 하여 액션을 취함(속도 조정, 색 조정 등) 
제어 변수 myCar, 풍선끝, 풍선안(변수-빨강, 0/메소드 등), 
24번줄은 또다른 변수인 himCar라는 풍선(변수 - 검정)이 getCar라는 메소드로 생기는 것
*/