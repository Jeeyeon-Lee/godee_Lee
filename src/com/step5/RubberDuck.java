package com.step5;

public class RubberDuck extends Duck {
	//기능에 따른 구현체 클래스 정의 필요!
	public RubberDuck() {
		//인터페이스클래스도 구현체 필요! 왜? 가 없기 때문.
		//날고 있음 FlyWithWings.java -> implements FlyBehavior
		//날고 없음 FlyNoWay -> implements FlyBehavior
		flyBehavior =null;
	}
	public void swimming() {
		System.out.println("모든 오리는 물위에 못 뜬다.");
	}
	@Override
	public void display() {
		System.out.println("나는 고무오리입니다.");
	}

}
