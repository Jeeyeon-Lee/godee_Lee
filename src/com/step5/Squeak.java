package com.step5;

public class Squeak implements QuackBehavior {
	//추상메소드 재정의
	@Override
	public void quack() {
		System.out.println("삑삐이익~~");
	}

}
