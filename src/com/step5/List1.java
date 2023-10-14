package com.step5;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		String s3 = null;
		//ArrayList는 싱글스레드 First in last out/싱글스레드에서 안전(혼자 들어갈 때) but, 인터셉트 당할 수 있음. 
		ArrayList<String> fruits = new ArrayList<>();   
		fruits.add("🍅");  //객체 삭제
		fruits.add("🍅");
//		s1 = fruits.get(0);                         타입이 다르기 때문에 오류
		s1 = (String)fruits.get(0);             //String으로 형변환 필요
//		int x = fruits.add(1, "🍓")              add 메소드의 경우, 리턴타입이 void이기 때문에 int 붙일 수 없음.
		fruits.add(1, "🍓");
		s2 = (String)fruits.get(1);             //String으로 형변환 필요
		fruits.add(1, "🍎");                     //사과의 끼어들기 가능
		s3 = (String)fruits.get(2);             //String으로 형변환 필요
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(s1+","+s2+","+s3);
	}
}