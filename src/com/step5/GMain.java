package com.step5;

public class GMain {

	public static void main(String[] args) {
		String s = null; 
		//선언만 할 경우, Null에러
//		System.out.println(s.length());
		//생성까지 했기 때문에 출력 가능
		s = "Hello";
		System.out.println(s.length());            //5
		System.out.println(new int[3].length); //3
	}

}
