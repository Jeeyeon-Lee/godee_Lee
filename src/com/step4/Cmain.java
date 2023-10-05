package com.step4;
class C{
	//총점을 담는 변수 선언
	int tot;
	//평균을 담는 변수 선언
	int avg;
}
class C1{
	//총점 구하는 메소드
	//파라미터 자리는 초기화 필요!  -> 언제? -> 메소드 호출될 때, call by value
	void hap(int n1, int n2, int n3) {
		C c = new C();
		c.tot = n1 + n2 + n3;
	}
}
public class Cmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		C c = new C(); //같은 tot이어도 값이 달라질 수 있음. 
		C1 c1 = new C1();
		c1.hap(n1,n2,n3);
		//계산된 총점을 찍고 싶어요. 어떡하죠?
		//1. 클래스 설계 바꾸기 -> 3개를 2개로
		//2. hap메소드 리턴타입 int로 바꾸기
		//3. 원본, 전변을 살려서 처리하기
		System.out.println(c.tot); // 0 
	}
}