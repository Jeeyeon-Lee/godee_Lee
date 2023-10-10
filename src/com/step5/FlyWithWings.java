package com.step5;
//동일한 메소드를 호출했다고 하더라도 구현체 클래스에 따라서 
//어쩔 땐 날고, 어떤 클래스일 땐 날지 못 하는 것 -> 다형성(폴리모피즈) 
//다형성의 전제조건, 인스턴스화할 때 선언부의 타입, 생성부의 타입이 무조건 다를 때!
//예) 
//list = new ArrayList();
//list = new Vector();
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("나는 날고 있어요.");
	}

}
