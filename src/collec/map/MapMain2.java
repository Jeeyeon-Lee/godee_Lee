package collec.map;

import java.util.HashMap;
import java.util.Map;

import collec.list.CustomerVO;

class Map2{
	/*선언부*/
	//선언부, 생성부의 이름 다름 - 인터페이스 변수명 = new 구현체클래스
	Map<String, CustomerVO> map = new HashMap<>(); 

	/*생성자*/
	public Map2() {
		//insert here 아래 문제를 해결해보기
		CustomerVO cVO = new CustomerVO();
		System.out.println(cVO);
		cVO.setC_name("나신입");
		cVO.setC_id(10);
		cVO.setC_birthday("2005-09-11");
		map.put("1", cVO);    // map.size(); 1
		System.out.println(map.size());
//		System.out.println(map); //{1=1}
		//map안에 키가 1인 값은 CustomerVO타입이다.
		System.out.println(map.get("1"));
//		System.out.println(map.containsKey("1")); //true
//		System.out.println(map.containsKey("2")); //false
		//JSON 포맷에서 [{},{},{},,,,,,,label;[{},{},{},,,,]]
	}
}

public class MapMain2 {

	public static void main(String[] args) {
		Map2 m1 = new Map2();   //전변 읽혀짐 -> 디폴트 생성자가 호출됨
		CustomerVO cVO = m1.map.get("1");
		System.out.println(cVO);
		System.out.println(m1.map.get("1"));
		System.out.println(cVO.getC_name());
		System.out.println(m1.map.get("1").getC_name()); 
		/*타입비교 instance of -> 화면솔루션과 자바 연동 시,(이종간연계) 공통코드로 사용*/ 
		System.out.println(cVO instanceof CustomerVO);
		System.out.println(m1.map.get("1") instanceof CustomerVO);
		System.out.println(m1.map.get("1").getC_name());
		System.out.println(m1.map.get("1").getC_id());
		System.out.println(m1.map.get("1").getC_birthday());
//		System.out.println(m1.map.get(cVO.getC_name().equals(m1.map.get("1").getC_name()));
		
	}

}
