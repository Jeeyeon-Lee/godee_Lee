package com.step5;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		//ArrayList는 싱글스레드 First in last out/싱글스레드에서 안전(혼자 들어갈 때) but, 인터셉트 당할 수 있음. 
		ArrayList fruits = new ArrayList();   
		fruits.add("🍅");
		fruits.add(1, "🍓");
		fruits.add(1, "🍎");                            //사과의 끼어들기 가능
		String r1 = (String)fruits.remove(1);       //사과지우기
		System.out.println(fruits);                   //[  ]
		System.out.println(r1);
	}
}