package com.step6;
//컬렉션 프레임워크란? 자료구조를 API로 구현한것
//읽기, 쓰기, 검색기능 가능
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;

import com.google.gson.Gson;
//상속받거나, 구현체 클래스를 선언할 때 하위클래스를 상속받는게 더 많은 변수와 메소드를 사용할 수 있다. 
/*
 * 업무요청에 대한 결과가 조인이 불가피할 때 하나의 클래스로 제네릭을 사용할 수 없다. 
 * Map인터페이스 활용이 효과적(키와 값으로 관리함)
 * 키를 컬럼명으로 통일하면 일관성있는 변수명으로 접근 가능함 - 속도 빠름
 */
class Emp1{
	private int empno;
	private String ename;
}
class Dept1{
	private String dname;
}
public class AddList {
	public static void main(String[] args) {
		JButton jbtnSelect = new JButton();
		//선언부, 생성부 다르면 다형성을 누림.
		//인터페이스, 추상클래스 변수명 = new 구현체클래스();
		//재사용성, 이식성, 유연성 - 객체지향 언어가 추구하는 방향성
		//기존의 코드를 변경, 사이드 이펙트 발생(부수효과)
		//전역변수 - 클래스 중심 코딩 전개 - 사이드 이펙트가 발생 o - 람다식과 같은 함수형에서 사용x, 
		//지역변수 - 처리 시 메소드 안에서만 유지됨->사이드 이펙트가 발생 x - 안전 - 람다식 함수형 프로그래밍 지원 가능한 이유!
		List<JButton> li = new ArrayList<>();
		//List 인터페이스의 구현체 클래스 ArrayList이다. new 뒤에 List 사용 x, 인터페이스는 단독으로 인스턴스화 x 
		//선언부 : 인터페이스/생성부 : 구현체 클래스
		List<Map<String, Object>> list = new ArrayList<>(); //리스트는 []형식 -> Json, lib 데이터 수집, 형전환, 변환 
		Map<String, Object> map = new HashMap<>();
		map.put("empno", 7782);
		map.put("ename", "CLARK");
		map.put("dname", "ACCOUNTING");
		list.add(map); //List에 누적을 시켜줘야  n번째로 계속 생성됨 
		System.out.println(list);         //list 형식
		Gson g = new Gson();   // Gson import하기 위한 과정 거치는 것 필요(노션 참고) 
		String temp = g.toJson(list);
		System.out.println(temp);     //json 형식으로 변환 완료 -> 브라우저 출력시 연동됨?! 아름답게 출력? 
	}
}
/*- List는 row를 관리
제네릭 타입은 컬럼에 해당하는 값을 관리하고, 멀티타입을 적을 수 없어서 2개 이상의 집합을 조인했을 경우, 
VO 타입 보다는 Map을 사용하는 것이 복잡도를 줄일 수 있음.
VO패턴과 Map타입을 사용할 수 있는데 VO타입에는 타입이 정확해서 형전환이 필요없지만, 
Map은 객체타입으로 받기 때문에 그 값을 가지고 연산(회계, 재고관리 등)을 할 때는 형전환을 해야한다. 
여기서 casting exception이 다수 발생함.
 * 
 */
