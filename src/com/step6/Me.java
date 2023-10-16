package com.step6;

public class Me extends Super1 {
	int c = 3;
	public void methodC() {
		System.out.println("methodC 호출");
	}
	public static void main(String[] args) {
		//아래 두 생성의 차이는?
		Me me = new Me();
		//선언부 / 생성부(Me를 생성함)
		Super1 sup1 = new Me(); //다형성을 위해 앞쪽에 상위클래스 or 인터페이스 올 수 있음. 
		Super1 sup11 = new Super1(); //다형성을 위해 앞쪽에 상위클래스 or 인터페이스 올 수 있음. 
		Super1 sup111 = new  Super2(); //다형성을 위해 앞쪽에 상위클래스 or 인터페이스 올 수 있음. 
		//다형성? 같은 메소드를 호출했는데 그 결과가 다름! 
		System.out.println(me.a);
		System.out.println(sup1.a);
		me.methodA();
		sup1.methodA();
		sup111.methodA();
		me.methodC();
/*		//상위클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드 호출 불가
		sup1.methodC();  부모클래스로는 자손 메소드 호출x*/
	}
}
