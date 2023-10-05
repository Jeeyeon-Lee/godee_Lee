package com.step4;

public class Oper1 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		if((++i>j)&&(i<j--)) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		System.out.println(i+",+j");
	}
}
/*
&& 엔퍼센트 연산자(and)
true & true -> true
false & true -> false

|| 파이프 연산자(or)
true & true -> true
false & true -> true
*/