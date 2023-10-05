package com.step4;
//외부의 정보(원시형, 참조형타입)를 재사용하고 싶다면?? 인스턴스화 필요!
//데이터는 가로방향, 새로방향이 존재
//가로방향(서로 관계 있음-그 사람의 나이, 키, 혈액형 등->참조형타입 설계)
//세로방향은 2500만 가입자의 이름 - 배열 
//클래스와 배열은 모두 new를 사용하여 생성
//클래스 쪼개기 연습(변수만, 메소드만!)
class A{ //변수만
	 int age = 0;         //전변 -> 사용하기 위해서는 인스턴스화 필요
}
class A1{//메소드만
	void methodA() {  //위 나이값을 가져와서 한 살씩 추가되는 메소드
		A a = new A();
		a.age = a.age + 1; //but, 변경된 값이 A1 안에서만 유지된다.
	}
}
public class Amain {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.age);
		A1 a1 = new A1();
		a1.methodA();
		//가설1, 영향이 없다 -> 0출력(o)
		//가설2, 영향이 있다 -> 1출력(x)
		System.out.println(a.age); //0출력 
	}
}