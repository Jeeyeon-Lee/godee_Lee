package jdbc.oracle;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	/*선언부*/
	Map<String, Object> map = null;
	/*생성자*/

	/*정의메소드*/
	//전변 map 초기화 해보기 - 제목, 저자, 가격??
	void methodA() {
	    map = new HashMap<>();
//		map.put("제목", "혼공자");
//		map.put("저자", "신용권");
//		map.put("가격", 24000);
//		System.out.println(map);
	    map.put("b_title","자바의 정석");
	    map.put("b_author","남궁성");
	    map.put("b_price", 30000);
	}
	void methodAPrint() {
		if(map != null) {
		System.out.println(map.get("b_title"));
		System.out.println(map.get("b_author"));
		System.out.println(map.get("b_price"));
		}
		else {
		System.out.println("map이 널값입니다.");
		}
	}
	void methodB(Map<String, Object> pmap) {
		
	}
	
	//리턴타입이 Map(인터페이스)인 경우, 
	Map<String, Object> methodC(Map<String, Object> pmap){
		Map<String, Object> rmap = null;
		rmap = map;
		return rmap;
	}
	/*메인메소드*/
	public static void main(String[] args) {
		Map1 m = new Map1();
		m.methodAPrint();
		m.methodA();
		m.methodAPrint();
	    Map<String, Object> pmap = new HashMap<>();
	    Map<String, Object> resultMap = m.methodC(pmap);
	    System.out.println(resultMap);
		
	}

}
