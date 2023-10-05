package com.step3;

import java.util.Scanner;

class MaxPrint{
	//큰 숫자를 반환하는 함수를 구현
	int Max(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}else if(n1 < n2) {
			return n2;
		}else {
			return -1;  //-1은 end of file의 의미
		}
	} 
}
public class MaxPrintmain {

	public static void main(String[] args) {
		MaxPrint mp = new MaxPrint();
		Scanner sc = new Scanner(System.in);
		int user1 = 0;
		int user2 = 0;
		for(int i = 0; i<2; i++) {
			if(i==0) {        //첫 번째 실행 시 코드
				System.out.println("첫 번째 수를 넣어 주세요.");
				user1 = sc.nextInt();   //이렇게 넣게 될 경우, user1 변수에만 값이 두 번 담기며 덮어쓰기 됨.
			}
			else if(i==1) { //두 번째 실행 시 코드
				System.out.println("두 번째 수를 넣어 주세요.");
				user2 = sc.nextInt();   //이렇게 넣게 될 경우, user1 변수에만 값이 두 번 담기며 덮어쓰기 됨.
			}
			System.out.println("user1 : " + user1 + ", " + "user2 : " + user2);  //user2는 계속 0밖에 안 찍힘. 
		}
			System.out.println(user1 +", "+ user2);
			int big = mp.Max(user1, user2);
			System.out.println("두 수 중 최대값은 "+big+ " 입니다.");
	}
}




