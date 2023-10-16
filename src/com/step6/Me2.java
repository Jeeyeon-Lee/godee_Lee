package com.step6;
public class Me2 extends Super2 {
	int c = 3;
	//Super2클래스를 상속받는 클래스에서는 methodB와 methodC를 오버라이딩 할 수 있음. 
	@Override
	public void methodC() {
		System.out.println("Me2 : methodC 호출");
	}
	public static void main(String[] args) {
		//아래 두 생성의 차이는?
		Me2 me = new Me2();
		//Me2 타입은  Super2를 상속받았지만, 2가 1을 상속받았기에 Super1의 메소드 호출 가능! 
		//선언부 / 생성부(Me를 생성함)
		Super2 sup1 = new Me2(); //다형성을 위해 앞쪽에 상위클래스 or 인터페이스 올 수 있음. 
		Super2 sup11 = new Super2(); //다형성을 위해 앞쪽에 상위클래스 or 인터페이스 올 수 있음. 
		Super2 sup111 = new  Super2(); //다형성을 위해 앞쪽에 상위클래스 or 인터페이스 올 수 있음. 
		//다형성? 같은 메소드를 호출했는데 그 결과가 다름! 
		System.out.println(me.a);
		System.out.println(sup1.a);
		me.methodA();
		sup1.methodA();
		sup111.methodA();
		me.methodB();
		sup1.methodB();
		sup111.methodB();
		me.methodC();     //Me2
		//아래 사용도 위 메소드 오버라이드를 통해 사용 가능해짐 
		sup1.methodC();  //Me2
		sup11.methodC(); 
		sup111.methodC(); 
/*		상위클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드 호출 불가
		sup1.methodC();  부모클래스로는 자손 메소드 호출x
		sup111.methodC();
		만일 오버라이드의 관계에 있어도 불가능한 것인가? */
	}
}
