package collec.map;

import java.util.HashMap;
import java.util.Map;

class Map1{
	/*선언부*/
	//선언부, 생성부의 이름 다름 - 인터페이스 변수명 = new 구현체클래스
	Map<String, Object> map = new HashMap<>(); 

	/*생성자*/
	public Map1() {
		map.put("1", 1);    //map.size는 1임 -> JSON {"1":1, "c_name":"나신입",} -Map구조 ->JavaScript 꺼낸다.
		System.out.println(map); //{1=1}
		System.out.println(map.containsKey("1")); //true
		System.out.println(map.containsKey("2")); //false
		//JSON 포맷에서 [{},{},{},,,,,,,label;[{},{},{},,,,]]
	}
	public Map1(int i) {
		map = new HashMap<>();//새로운 객체를 생성 - 복제본 (아직은 값을 넣지 않아 map.size는 0)
		System.out.println(map.size()); //(아직은 값을 넣지 않아 map.size는 0)
	}
	/*정의메소드*/

}

public class MapMain1 {

	public static void main(String[] args) {
		Map1 m1 = new Map1();   //전변 읽혀짐 -> 디폴트 생성자가 호출됨
		//키값이 1인 값을 출력하시오
		System.out.println(m1.map.get("1"));
		Map1 m2 = new Map1(3); //새로운 객체가 생성되는 생성자가 호출됨, 파라미터값은 사용안되므로 아무거나 넣어도 됨(의미가 없음)
	}

}
