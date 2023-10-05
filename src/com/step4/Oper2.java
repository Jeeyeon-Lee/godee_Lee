package com.step4;

public class Oper2 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		//이거나 일 때는 첫번째 조건이 참이면 두번째 조건은 따질 필요 없음. 어차피 실행
		//첫번째 조건만 따지고도 실행문이 결정됨. (예 : 아이디 중복검사)
		if((++i)>j || (i<j--)) {
			System.out.println("둘 중 하나라도 참");
		}else {
			System.out.println("거짓");
		}
		System.out.println(i+","+j);
	}	
				
	}

