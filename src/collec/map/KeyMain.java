package collec.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//소셜로그인, 카카오 우편번호 검색, 카카오페이 구현 시
public class KeyMain {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("나신입", 85);
		map.put("나초보", Integer.parseInt("75"));
		map.put("나일등", 65);
//		String names[] = {"나신입", "나초보", "나일등"}; 기존의 방법
//		String names[] = null; // java.lang.ClassCastException: 
		Object names[] = null;// java.lang.ClassCastException: 
//		System.out.println(names.length); //null
		Set<String> set = map.keySet();
		System.out.println(names.length); //null
		names = set.toArray();  //3 ->for문
	    //Object[] java.util.Set.toArray()
		for(int i=0;i<names.length;i++) {
			String key = (String)names[i];
			System.out.println(key);
		}
		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(new Integer(1), 85); //한시적 데플리케이티드 상태로 표시 
		map1.put(2, Integer.parseInt("75"));                                                                
		map1.put(3, 65);
		Object names2[] = null;
		Set<Integer> set2 = map1.keySet();
		names2 = set2.toArray();
		Object[] its = map.keySet().toArray();
		for(Object obj:its) {
			System.out.println(obj);
		}
		System.out.println("=====================");
		System.out.println(names.length);
		for(int i=0;i<names.length;i++) {
			System.out.println(key);
		}
	}

}
