package com.step5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		//리스트 안에 제네릭으로 맵을 쓴다?? 
		List<Map<String, Object>> deptList = new ArrayList<>();  //V Object인 이유는 여러가지 타입을 받기 위해 넣는 것임. 
		Map<String, Object> map = new HashMap<>();
		map.put("DEPTNO","10");          //대문자인 이유, 토드에서는 대문자로 사용하고 있음. 맞춰서 보내줘야함.
		map.put("DNAME","영업부");
		map.put("LOC","부산");
		deptList.add(map);
		Set<String> set = map.keySet();
		Object keys[] = set.toArray();
		for(int i=0;i<keys.length;i++) {
			System.out.println(keys[i]+"==>"
					+ ""+map.get(keys[i]));
		}
		System.out.println(deptList.get(0).get("DEPTNO"));
		System.out.println(deptList.get(0).get("deptno"));   //null;
	}

}
