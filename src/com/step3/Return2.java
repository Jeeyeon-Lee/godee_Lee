package com.step3;

public class Return2 {
	void m(int i) {  //12번에 호출될 때 파라미터 자리에 -1 있다.
		if(i == -1) { //-1과 같니? 네
			return;    //if문 안에 return을 사용하면 메소드를 탈출하여 메인메소드로 이동함
		}
		System.out.println("요기");            //출력x
	}
	public static void main(String[] args) {
		Return2 r2 = new Return2();
		r2.m(-1);
		System.out.println("여기");
	}
}
