package com.step4;
//클래스 원본은 유지되고, 영향이 없길 바란다면??
class B{
	int age;
}
class B1{
	void methodA(B a) {
		B a1 = new B();
		a.age = a.age +1;
	}
}
public class Bmain {

	public static void main(String[] args) {
		B a = new B();
		B1 a1 = new B1();
		System.out.println(a.age);
		
		//1이 출력되도록! 파라미터 사용
		a1.methodA(a);
	}

}
