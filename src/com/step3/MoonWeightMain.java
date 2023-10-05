package com.step3;

import java.util.Scanner;

class MoonWeight{
		//사용자로부터 입력받는 값을 별도의 메소드로 선언해보기
		//리턴타입 int인 이유는? nextInt 메소드(콘솔에 입력한 값 가져오는)의 소유주가 스캐너다
		//nextInt로 가져오는 값이 int이므로, 리턴타입 또한 동일하게 int로 설정해야함.
		//파라미터 값은 필요x
		//화면쪽에 리액트가 활용되고, 더해서 타입스크립트가 등장하며, 
		//this가 코드에 따라 참조하는 객체가 달라졌다. ->초보멘붕
		int getUser() {
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			return user;
		}
		double moon = 0.0;
		double account(int earth) {   //메인에서 입력된 지구의 몸무게 출력희망 -> call by value 값에 의한 호출, 파라미터 안에 기입
			moon = (earth*17)/100.0;
			return moon;
		}
}
public class MoonWeightMain {

	public static void main(String[] args) {
		MoonWeight mw = new MoonWeight();
		System.out.println("당신의 몸무게를 입력해주세요.");
		//메소드 호출 결과를 리턴타입으로 받아서 처리하는 방법과 
		//바로 직접 메소드를 호출하는 것은 차이가 있다|없다??
		//문제점 = 인스턴스 변수 하나에 대해 입력받은 지구의 값도 하나여야 하는데
		//만일 변수로 치환하지 않고, 매번 메소드를 새로 호출하면 입력받는 값이 그때마다 변경되어서
		//이런 상황일 때는 리턴타입으로 받아서 그 변수를 사용해야한다. 
		int user = mw.getUser();
		System.out.println("당신의 몸무게는 " + user + "kg 입니다");
		System.out.println("당신의 몸무게는 달에서 "+ mw.account(user) + " kg 입니다.");
	}
}
