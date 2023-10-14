package com.week3;

public class ThreeOper {

	public static void main(String[] args) {
		System.out.println(10+10);          //20
		System.out.println("10"+10);       //1010 숫자열이 문자열과 만나면 더하기x(컨켓?)
		System.out.println("10"+(10+20));//1030
		int hour = 7;
		String result1 = (hour<10 ? "참" : "거짓");
		System.out.println(result1);
		String result2= (hour<10 ? "0"+hour : ""+hour);
		System.out.println(result2);
	}
}
