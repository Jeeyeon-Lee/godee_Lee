package com.step21;
//자바에서는 같은 이름의 메소드를 중복 선언할 수 있다.
//이것을 가능하게 하는 건 메소드 오버로딩과 메소드 오버라이딩 컨벤션이 있기 때문이다.
class B{
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int hap1() {                            //메소드 이름이 같은 int 리턴타입으로 작성
		int hap = n1 + n2 + n3; 
		return hap;
	}
	int hap1(int n1, int n2, int n3) { //지변 초기화 자리, 초기화 생략x 호출할 때 결정해준다. -> 22번줄
		int hap = n1 + n2 + n3;
		return hap;
	}
}
public class BMain {
	public static void main(String[] args) {
		B a = new B();
		int hap = a.hap1();
		System.out.println(hap);     //240(전변 합) -> 다른클래스에서도 동일한 값 출력할 수 있음.
		hap = a.hap1(50, 60, 70);
		System.out.println(hap);     //180(지변 합)
	}
}