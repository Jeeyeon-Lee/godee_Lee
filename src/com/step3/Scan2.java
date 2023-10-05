package com.step3;

import java.util.Scanner;

//메뉴 선택하기
public class Scan2 {

	public static void main(String[] args) {
		System.out.println("메뉴를 선택하세요.[새 게임 : 1, 정답확인 : 2, 종료 : 3]");
		Scanner sc = new Scanner(System.in);
		//사용자가 선택한 메뉴 번호를 담을 변수 선언
		int menu = 0;
		//for문 for(변수선언 및 초기화; 조건식 ;증감연산자)
		for(int i = 0; i <3; i=i+1) {
			System.out.println(i);
			//당신의 선택은 ?? 초기화
			//else가 없으면 아래의 조건도 따진다->일의 양이 늘어난다.
			//처음 조건을 수렴하면 다음 조건을 굳이 비교할 필요가 없잖아
			menu = sc.nextInt();
			//너 새 게임을 원해?  1
			if(menu == 1) {
				System.out.println("새 게임을 선택하였습니다.");
			}if (menu == 2 ){ 
				System.out.println("정답보기를 선택하였습니다.");
			}if(menu ==3) {  //너 종료하길 원해?   3
				System.out.println("종료를 선택하였습니다.");
				
			}
			System.out.println("for 문을 탈출하였습니다.");
		}
		
	}

}
/*
사용자와 개발자 사이 소통하기
화면구현을 통해 가능하나, 
아직 html을 공부하지 않고 있어서 콘솔창을 활용한 소통하기를 시도
Scanner가 그 방법 중 하나임.
화면에서 입력받아야하는 값들이 파라미터 자리를 채워야 한다.
사용자(업무담당자)가 입력한 값을 받아오기

*/