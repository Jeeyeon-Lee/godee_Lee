 
package com.step5;
//인스턴스화 4. 인터페이스 변수명 = new 구현체클래스();
//인스턴스화 5. 추상클래스 변수명 = new 구현체클래스();
public class QuackSimulation {
	/*****************************************************/
	void methodA(Squeak squeak) {
		System.out.println("methodA : "+squeak);
	}
	void methodB(QuackBehavior quackBehavior) {
		System.out.println("methodB : "+quackBehavior);
	}

	/*****************************************************/
	public static void main(String[] args) {
		QuackSimulation qs = new QuackSimulation();
		//선언부와 생성부의 타입이 다르다!(권장사항)
		//왜?범위가 더 넓은 걸 사용하면 범위가 더 좁은 구현체의 클래스를 담을 수 있음. 
		//유지 보수 시, 코드의 수정을 최소화할 수 있음. 
		QuackBehavior quackBehavior = new Squeak();
		MuteQuack quackBehavior1 = new MuteQuack();
		Quack quackBehavior2 = new Quack();
		Squeak quackBehavior3 = new Squeak();
		quackBehavior.quack();
//		qs.methodA(quackBehavior); //문법적 오류
		if(quackBehavior instanceof Squeak) {
			System.out.println("나는 squeak 타입니다.");
		}
		if(quackBehavior instanceof Quack) {
			System.out.println("나는 Quack 타입니다.");
		}
		if(quackBehavior instanceof Squeak) {
			System.out.println("나는 squeak 타입니다.");
		}
		qs.methodA(quackBehavior3);
		qs.methodB(quackBehavior);
		qs.methodB(quackBehavior1);
		qs.methodB(quackBehavior2);
	}

}
