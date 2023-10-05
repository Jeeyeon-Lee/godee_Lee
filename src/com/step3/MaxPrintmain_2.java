package com.step3;

import java.util.Scanner;

class MaxPrint_2{
	//큰 숫자를 반환하는 함수를 구현
	int Max(int n1, int n2) {
		if(n1 > n2) {
			System.out.println("정수(두 개) : " + n1 +", "+ n2 + " / 최대값 : " + n1 );
			return n1;
		}else if(n1 < n2) {
			System.out.println("정수(두 개) : " + n1 +", "+ n2 + " / 최대값 : " + n2 );
			return n2;
		}else {
			System.out.println("정수(두 개) : " + n1 +", "+ n2 + " / 두 수는 같은 값입니다." );
			return n1;
		}
	} 
}
public class MaxPrintmain_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaxPrint_2 m = new MaxPrint_2();
		System.out.println("첫 번째 숫자를 넣어주세요");
		int i = sc.nextInt();
		System.out.println("두 번째 숫자를 넣어주세요");
		int j = sc.nextInt();
		m.Max(i, j);
	}
}




