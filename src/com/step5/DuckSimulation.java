package com.step5;

public class DuckSimulation {
	/*
	Spring 사전학습 - 결합도는 낮추고 독립성은 높여서 구현
	추상메소드 중심 인터페이스 중심의 코딩을 전개
	 */
	public static void main(String[] args) {
//		Duck myDuck = new Duck(); //실행x, 반드시 구현체 필요 -> 이로인해 다형성 가능해짐
		/*인스턴스화 4번째 유형
		 선언부와 생성부의 타입이 다를 수 있다->다형성을 위한 전제조건
		 생성부의 이름으로 결정됨.
		 */
		Duck myDuck = new RubberDuck(); //이렇게 구현체로 생성해야 사용 가능
		myDuck.performeFly();
		myDuck.swimming();
		myDuck = new MalladDouck(); //이렇게 구현체로 생성해야 사용 가능
		myDuck.performeFly();
		RubberDuck myDuck2 = new RubberDuck();
		myDuck2.swimming();
		myDuck = new MalladDouck();
		myDuck.performeFly();
		Duck himDuck = new WoodDuck();
		himDuck.performeFly();
		himDuck.performeFly();
	}

}
