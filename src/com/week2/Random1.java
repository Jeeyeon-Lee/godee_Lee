package com.week2;

import java.util.Random;

//사용자 클래스와 자바제공 클래스 - 2개를 가지고 연습하시오.
//사용자 클래스와 사용자 클래스도 해당 - 2개를 선언해서 훈련하기
//인스턴스화 -> 클래스와 클래스 관계
//업무를 나누어 준다. 나신입, 나초보 -> 업무를 분장 -> 형상관리(버전관리) -> git 도구 활용
//단위테스트(테스트시나리오) -> 통합테스트 -> 업무와 업무 사이의 관계를 확인
public class Random1 {

	public static void main(String[] args) {
		Random r = new Random(); //내가 정의한 클래스 x -> 인스턴스화
		//메소드 호출 시 리턴타입이 있는 메소드라면 왼쪽에 대입연산자를 사용할 수 있다.
		for(int i=0; i<10; i++) {
			int s = r.nextInt(10); // 0.0~10.0
			System.out.println(s);
		}
	}

}
