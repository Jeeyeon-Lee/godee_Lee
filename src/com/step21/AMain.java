package com.step21;

class A{
	//학생 점수 담을 변수 선언(그 학생 한명에 대한 값이기 때문에 전변으로 선언)
	//전변은 A a = new A();일 때 기본값으로 기억됨. 
	//a = new A(); 가 되면 새로운 클래스가 복사되어 생기며 재정의 됨(재생성)
	//이전에 참조하던 클래스는 JVM에 의해 candidate(회수) 당함
	int n1 = 70;
	int n2 = 80;
	int n3 = 90;
	int tot = 0;
	void hap1() {                                             //처리하기, 다른 시도- 리턴타입 void에서 int로 해보거나/전변을 지변으로 처리하기(파라미터 자리)
		int tot = n1 + n2 + n3;                          //tot는 지변이며, 외부의 클래스에서는 실행 불가하고 재사용성 떨어짐.
		//원시형 타입은 한 번에 하나만 담김 - 여러번 입력되면 덮어쓰기가 됨
		this.tot = tot;                                    
	}
}

public class AMain {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.n1); //no1은 전변이기 때문에 가능
		
		a.hap1();                      //클래스의 hap 메소드를 인스턴스화
		System.out.println(a.tot); //14번의 tot는 지변이기 때문에 불가 -> 11번처럼 전변으로 올려서 사용해야 함.
	}

}
/*
세 학생의 점수를 입력 받아서(변수 3개), 타입은 뭐로 할까?전역변수로 할까?지변으로 할까?
전역변수 : 초기화 생략 가능 
*/