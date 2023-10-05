package com.step2;

class Param{
	int ival;
}
public class TestParam {
	void effectParam(Param p) {//p = null;
		p = new Param();
		p.ival = 100;//사용할 수  없다. NullPointerException이 발동됨
		System.out.println("sub ival ==> " + p.ival);		
	}
	public static void main(String[] args) {
		Param p = new Param();
		p.ival = 500;
		TestParam tp = new TestParam();
		tp.effectParam(p);
		System.out.println("main ival ==> " + p.ival);
	}
}
/*
TestParam.java 하나의 문서 안에 두 개의 클래스가 존재 합니다.
TestParam.class와 Param.class 존재함
Param.class에는 오직 ival변수 하나만 있다 - 디폴트값은 0이다
그런데 main메소드는 TestParam에 있다.- 모든 클래스가 다 메인메소드를 가질 필요없다.
단 실행할 수 있는 클래스는 오직 TestParam뿐이다.
14번에서는 TestParam클래스 선언되지 않은 ival변수를 사용하였다.
그러기 위해서는 반드시 인스턴스화를 해야만 했다. 
그런데 effectParam은 호출되지 않았다.
 */

