package com.step5;

public class DuckSimulation {

	public static void main(String[] args) {
		Duck myDuck = new RubberDuck();
		myDuck.performeFly();
		myDuck.swimming();
		myDuck = new MalladDuck();
		myDuck.performeFly();
		myDuck.swimming();
		myDuck = new WoodDuck();
		myDuck.performeFly();
		myDuck.performQuack();
		myDuck.swimming();
		
	}

}