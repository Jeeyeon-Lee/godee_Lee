package com.step3;
//1부터 10까지의 합을 구하는 프로그램 -> 같은 행동을 반복 -> for문
//변수는 몇개가 필요? 
//지변으로 할까 아님 전변으로 할까 아님 둘 다 다 된다.
//타입은 뭐로 하지? int


public class For3 {
	public static void main(String[] args) {
			//1부터 10까지 세면서 3의 배수의 합을 구하시오. 
//			int i = 0;
//			int hap = 0;
//			for(i=1; i<=10; i = i * 3) {
//				hap = hap + i;
//				System.out.println(i + ", "+ hap);        
//				}
			int i = 0;
			int hap = 0;
			for(i=1; i<=10; i = i++) {
				if(i%3 == 0) {
					hap = hap + i;
				}
			}
			System.out.println("1부터 10까지의 수 중 3의 배수의 합은 "+ hap);        
	}
}