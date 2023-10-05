package com.step4;
class M{ //변수
	int tot;        
	double avg;
}
class M1{//메소드
	void hap() {
		System.out.println("hap()");
	}
	void hap(int n1) {
		int n2 = 2;            
		System.out.println("hap(int n1)");
		System.out.println("hap(int n2)" + n2); //지변은 초기화 생략x
	}
	void hap(M1 m1) {   //목적지!
		System.out.println("hap(M1 m1)" + m1);
	}
}
public class MMain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		M1 m1 = null;    
		System.out.println(m1);  //주소x, NullPointerException 발생
		//나누는 순간 공백, 시점의 문제 발생
		m1 = new M1();
		System.out.println(m1); //주소o
		m1.hap(m1);               //선언은 클래가 들어가지만, 호출하는 자리에는 변수가 들어감 
		//지변이더라도 파라미터를 통해 원본을 넘기면 다른 메소드에서도 사용이 가능함.
	}
}