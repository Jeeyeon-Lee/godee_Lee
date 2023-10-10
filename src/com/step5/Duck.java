package com.step5;
//추상클래스는 추상메소드, 일반메소드, 생성자, 변수선언 모두 가능함.
//인터페이스는 일반메소드 못 가짐, 추상클래스와의 공통점은 둘 다 반드시 구현체 클래스가 있어야 함. 
//추상클래스의 구현체일 땐, extends를 예약어로 사용
//인터페이스의 구현체일 땐, implements를 예약어로 사용
public abstract class Duck {
	FlyBehavior flyBehavior = null; //
	QuackBehavior quackBehavior = null;
	public Duck() {} //생성자는 넣어도 호출은 x 
	//추상메소드 o
	public abstract void display();
	//추상메소드 x
	public void performeFly() {
		flyBehavior.fly();
	}
	public void swimming() {
		System.out.println("모든 오리는 물위에 뜬다.");
	}
}
