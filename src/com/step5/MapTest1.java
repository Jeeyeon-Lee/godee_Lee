package com.step5;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		//선언부와 생성부의 타입을 다르게 인스턴스화하기 - "다형성"을 기대, 활용할 수 있음.
		//선언부(추상클래스 or 인터페이스 or 구현체클래스), 생성부(
		//Hashtable(멀티스레드 안전), HashMap(싱글 안전)
		//List보다 속도 빠름
		Map<String, String> map = new HashMap<>();
		map.put("deptno","10");
		map.put("dname","영업부");
		map.put("loc","부산");
		System.out.println(map.get(10));              // 어찌하노?
		System.out.println(map.containsKey(10));  //키값으로 10이 있는지 주어진 값이 있는지 여부 확인! 
		System.out.println(map.containsKey("deptno"));             //true
		System.out.println(map.containsKey("Deptno"));             //false 자바는 대소문자 구분함
		System.out.println(map.containsKey("deptno11111"));     //fasle
		if(map.containsKey("10")) {
			System.out.println("키가 있어요");
		}
		else {
			System.out.println("키가 없어요");
		}
	}

}
