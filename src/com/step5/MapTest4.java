package com.step5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		//리스트 안에 제네릭으로 맵을 쓴다?? 
		List<Map<String, Object>> deptList = new ArrayList<>();  //V Object인 이유는 여러가지 타입을 받기 위해 넣는 것임. 
		Map<String, Object> map = new HashMap<>();
		map.put("DEPTNO","10");          //대문자인 이유, 토드에서는 대문자로 사용하고 있음. 맞춰서 보내줘야함.
		map.put("DNAME", "영업부");
		deptList.add(map);
		/*부산만 출력하기*/
		map = null;
		map = new HashMap<>();//복사본
		map.put("LOC", "부산");
		deptList.add(map);
		map = new HashMap<>();
		map.put("DEPTNO", 20);
		map.put("DNAME", "개발부");
		map.put("LOC", "대구");
		deptList.add(map);
		System.out.println(deptList);
	}
}