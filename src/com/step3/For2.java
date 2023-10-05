package com.step3;
//1부터 10까지의 합을 구하는 프로그램 -> 같은 행동을 반복 -> for문
//변수는 몇개가 필요? 
//지변으로 할까 아님 전변으로 할까 아님 둘 다 다 된다.
//타입은 뭐로 하지? int


public class For2 {
	public static void main(String[] args) {
			//1부터 10까지 합 더해보자
//			int i = 1;
//			int hap = 0; //초기화
//			for(i=1; i<=10; i++) {   //(초기화; 조건식; 증감연산자)
//				hap = hap + i;   //for문 안에 기입
//				System.out.println(i + ", " + hap);
				
			//1부터 10까지를 세면서(for문) 홀수(if문)의 합과 짝수의 합을 구하는 프로그램 작성  
			int i = 1;
			int hap1 = 0;   //홀수 함
			int hap2 = 0;   //짝수 합
			for(i=1; i<=10; i++) {
				if(i%2 == 1) {
					System.out.println("홀 수 일 때");
					hap1 = hap1 + i;
					System.out.println(i + ", "+ hap1);              //5번 출력
				}else if(i%2 == 0) {
					hap2 = hap2 + i;
				}
			}
			System.out.println("홀수의 합 = "+ hap1);         
			System.out.println("짝수의 합 = "+ hap2);         
	}
}