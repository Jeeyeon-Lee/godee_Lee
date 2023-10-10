package com.step5;

public class WoodDuck extends Duck {
	public WoodDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		
	}

}
