package com.step3;

import java.util.Scanner;

//2. 두 개의 정수 중에서 큰 숫자를 반환하는 max메소드를 구현하세요.
//   두 개의 정수를 입력 받고 큰 숫자를 출력합니다.
//
//  출력) 정수(두 개) : 5 8
//           최대값 : 8
public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		System.out.println("첫번째 숫자를 넣어주세요");
		i = sc.nextInt();
		System.out.println("두번째 숫자를 넣어주세요");
		j = sc.nextInt();
		System.out.println("정수(두 개) : "+i +" "+ j);
		if(i<j) {
			System.out.println("최대값 : "+j);
		}else {
			System.out.println("최대값 : "+i);
		}
	}
}
