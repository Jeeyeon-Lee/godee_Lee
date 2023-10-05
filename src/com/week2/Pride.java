package com.week2;
//진행 순서 : 9-10-11-5-6-7-12
public class Pride {
	int speed = 0;
//	String carColor = "검정";
//	int wheelNum = 4;
	//생성자 - 파라미터가 없는 생성자는 JVM이 대신 주입해줌 - 그래서 나는 안했음. 
	public Pride() {
		speed = 10; //왜 인스턴스 변수 없이 접근이 가능할까?
		System.out.println("Pride()디폴트 생성자 호출 성공");
	}
	public static void main(String[] args) {
		Pride myCar = null;                    //선언만 진행 -> 타입만 결정(객체x, 주소번지x, 사용x -> 실체가 없어서 NullPointerException 발생하기 때문에)
		myCar = new Pride();                 //생성도 진행 -> 주소번지o
		System.out.println(myCar);           //클래스 및 생성자도 호출
		System.out.println(myCar.speed);  //왜 10일까? 생성자를 경유하기 때문에
		int speed = 100;                        //지변
		System.out.println(speed);           //100
		speed = 30;                              //지변 초기화
		System.out.println(speed);           //30
		myCar.speed = 20;                     //전변(인스턴스변수 뒤에 들어가는 전변)
//		speed = 30; //static 영역에서 static 없는 변수는 사용 x, 접근 x
		//가능하게 하려면 인스턴스변수.speed로 호출, 재정의, 초기화 o
		System.out.println(myCar.speed);  //왜 20일까? 0>10>20 으로 그 값이 18번에서 재정의 되었기 때문에!
	}

}
