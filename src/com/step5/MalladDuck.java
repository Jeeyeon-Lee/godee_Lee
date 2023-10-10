package com.step5;

public class MalladDuck extends Duck {
	public MalladDuck() {
		flyBehavior = new FlyWithWings(); //인스턴스화를 통해 경유함. 
	}
	
@Override
	public void display() {
	System.out.println("나는 청둥오리입니다.");

	}

}
