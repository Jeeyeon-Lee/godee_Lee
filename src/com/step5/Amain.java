package com.step5;
class A1{
	int i;
	/*
	생성자
	전처리, 거쳐감, 실행문을 경유→초기화, 재정의, if문 등
	생성자로 인해 코드의 흐름, 처리가 달라질 수 있음
	*/
	public A1() {
	}
	public A1(Amain a) {
		System.out.println("A1에서 출력한 Amain의 원본 주소 : "+a);
	}

}
class A2{
	public A2() {
	}
	public A2(Amain a) {
		System.out.println("A2에서 출력한 Amain의 원본 주소 : "+a);
	}
	public void methodA() {
		System.out.println("methodA 호출");
	}
}
public class Amain {
	//선언부
	int j=10;
	//생성자 안의 this
	A1 a1 = new A1(this); //인스턴스화는 이미 생성자를 포함하고 있다. but, 파라미터있는 생성자는 따로 선언 필요
	A2 a2 = new A2(this); //파라미터값 있는 생성자가 하나라도 존재하면, 디폴트 생성자는 제공되지 않는다.

	public static void main(String[] args) {
		//static 안에서는 this, super와 같은 예약어는 사용할 수 없음. 
		A1 a1 = new A1();
		A2 a2 = new A2();
		Amain a = new Amain();
		System.out.println(a1.i);
		a2.methodA();
		a1 = new A1(a);
		a2 = new A2(a);
		System.out.println("Amain에서 출력한 Amain의 원본 주소 : "+a);
	}
}