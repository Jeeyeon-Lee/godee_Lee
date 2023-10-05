package com.step3;

import java.util.Scanner;

//연습문제
//1. 달의 중력은 지구 중력의 17%에 불과합니다. 지구에서 몸무게가 100kg인 사람은 달에 가면 17kg밖에 안됩니다.
//당신의 몸무게는 달에서 얼마입니까?
//몸무게 N은 실수이고 키보드로부터 입력받습니다.
//
//출력)  지구몸무게  : 100
//        달 몸무게 : 17kg
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 0.0;
		double g = 0.17;
		System.out.println("당신의 몸무게를 입력해주세요.");
		n = sc.nextDouble();
		System.out.println("당신의 몸무게는 달에서 "+n*g + " kg 입니다.");

	}

}
