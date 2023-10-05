package com.step4;

public class Oper4 {

	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		do {
			System.out.println("나는 do문과 함께 무조건 실행된다. "+i+", "+j);
		    if( i>j )  break;
		    System.out.println("if문의 조건 만족하면 나는 못 본다."+i+", "+j);
		     j--;
		}while( ++i < 5 );
		System.out.println("i는 "+i+", j는 "+j);
	}
}
