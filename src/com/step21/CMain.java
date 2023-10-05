package com.step21;
//데이터 관리하는 클래스 선언
class C{                                                     
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
}
//C클래스에서 전달받은 데이터로 hap 계산하는 클래스
//hap1 메소드 오버로딩(파라미터 갯수나 타입이 달라야 함)
class C1{                                                   
	int hap1() {                              //C클래스 인스턴스화(main x)
		//학생 수에 따라 인스턴스화 필요 -> for, while 같은 반복문 사용 필요
		C c = new C();                      //데이터를 갖고 있는 C 클래스를 지변으로 인스턴스화 함.
		int hap = c.n1 + c.n2 + c.n3;
		return hap;
	}
	int hap1(C c ) {                         //파라미터 자리의 c 값은 메인메소드에서 호출
		int hap = c.n1 + c.n2 + c.n3;
		return hap;
	}	
}
//메인메소드
public class CMain {                                  
	public static void main(String[] args) {
		C c = new C();
		C1 a = new C1();
		int hap = a.hap1();
		System.out.println(hap);
		c.n1 = 50;                           //인스턴스화 후 전역변수의 값을 재정의
		c.n2 = 60;
		c.n3 = 50;
		hap = a.hap1(c);                  //지변으로 선언된 변수를 다른 메소드에서 사용 가능
		System.out.println(hap);
	}

}