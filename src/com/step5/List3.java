package com.step5;

import java.util.ArrayList;

public class List3 {
	void getFruitList(ArrayList<String> fruits) {
		for(int i=0;i<fruits.size();i++) {               //자료구조에서는 length가 아닌 size로! 
			System.out.println(fruits.get(i));
		}
	}
	ArrayList<String> methodA(){     //지변을 다른 메소드에서 사용하려면 리턴타입을 활용해야함. 
		ArrayList<String> fruits = new ArrayList<>(); //생성부 제네릭 타입은 생략 가능하지만 연산자만 입력한다.   
		fruits.add("🍅");
		fruits.add(1, "🍓");
		fruits.add(1, "🍎");                            //사과의 끼어들기 가능
		return fruits;
	}
	public static void main(String[] args) {
		//ArrayList는 싱글스레드 First in last out/싱글스레드에서 안전(혼자 들어갈 때) but, 인터셉트 당할 수 있음. 
		List3 l3 = new List3();                        
		ArrayList<String> fruits = l3.methodA();
		System.out.println(fruits); // List에서는 "["","",""]"
	}
}