package com.step5;

class Super{
	int i;
	public Super() {
		System.out.println("Super() 호출");
	}
	public void methodA() {
		System.out.println("methodA 호출");
	}
	public void methodA(int i) {
		System.out.println("Super methodA(int i) 호출");
	}
}
class Sub extends Super{
	public Sub() {
		i=2; //상속받은 Super의 전변 재정의 가능함. 어떻게?
		System.out.println("Sub() 호출");
	}
	@Override
//	public void methodA(double i) { //부모의 메소드의 파라미터값이 변화하는 것을 JVM이 확인하고 있음. 
	public void methodA(int x) {
		System.out.println("Sub methodA(int x) 호출");
	}
}
public class Extends1 {
	public static void main(String[] args) {
		Sub sub = new Sub();       //상속으로인해 부모의 생성자 먼저 거치기 때문에 Super가 먼저 호출이 됨. 
		System.out.println(sub.i);   //재정의 된 2로 출력이 됨. 
		sub.methodA(0);              //오버라이드로 인해 부모의 메소드(shadow method)가 아닌 자손의 메소드로 출력이 됨.
		//부모를 생성해서 출력하면? 출력이 됨. 
		Super super1 = new Super();
		super1.methodA(30);
	}
}
/*
 * 부모가 가진 전변과 메소드 모두는 상속받은 클래스에서 호출이 가능함
 * 자손을 인스턴스화 하더라도 먼저 부모 생성자가 호출됨
 * 동일한 메소드가 부모, 자손 둘 다 있을 때, 부모 메소드는 shadow method(그림자, 호출x)가 된다.
 * 상속받은 클래스가 더 누릴 수 있다 vs 자손클래스가 더 누릴 수 있다. 
 * 여러 계층의 상속관계를 가진 클래스의 경우, 가급적 하위 클래스를 상속받는 것이 더 많은 변수와 메소드 누릴 수 있다. 
*/