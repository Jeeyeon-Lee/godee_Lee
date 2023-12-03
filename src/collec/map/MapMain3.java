package collec.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import collec.list.CustomerVO;

class Map3{
	Map<String, List<Map<String, CustomerVO>>> map = new HashMap<>();
	public Map3() {
		List<Map<String, CustomerVO>> list = new ArrayList<>();
		Map<String, CustomerVO> imap = new HashMap<>();
		CustomerVO cvo = new CustomerVO();
		cvo.setC_id(12);
		cvo.setC_name("토마토");
		cvo.setC_birthday("2000-05-11");
		imap.put("1", cvo);
		list.add(imap);
		map.put("outer", list);
	}
}
public class MapMain3 {
	public static void main(String[] args) {
		Map3 m3 = new Map3();
		System.out.println(m3.map.size());
		System.out.println(m3.map.get("1"));  //왜 null 일까? 
		System.out.println(m3.map.get("outer"));
		//m3.map.get("outer")무슨 타입일까? List 타입임. 
		System.out.println(m3.map.get("outer") instanceof List);             //true
		System.out.println(m3.map.get("outer") instanceof Map); 			 //false
		//m3.map.get("outer").get(0)은 무슨 타입인가요? 맵() , VO는 주소번지 
		System.out.println(m3.map.get("outer").get(0) instanceof Map);   //map
		//VO타입이야?
		System.out.println(m3.map.get("outer").get(0).get("1") instanceof CustomerVO);   //VO
		System.out.println(m3.map.get("outer").get(0).get("1").getC_id());           //VO
		System.out.println(m3.map.get("outer").get(0).get("1").getC_name());       //VO
		System.out.println(m3.map.get("outer").get(0).get("1").getC_birthday());   //VO
	}
}
