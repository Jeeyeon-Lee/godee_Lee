package com.week2;

public class String2 {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = null;
		System.out.println(s1); //""
		System.out.println(s2); //null
		System.out.println(s1.equals(s2));  //false(다르다) 
		System.out.println("".toString());   //o
//		System.out.println(null.toString()); //에러
//		System.out.println(s2.equals(s1));  //에러
	}

}
