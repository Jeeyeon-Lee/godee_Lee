package collec.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//소셜로그인 구현,  카카오 우편번호 검색,  카카오페이 도전
public class KeyMain1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("나신입", 85);
		map.put("나초보", 75);
		map.put("나일등", 65);
		Object names[] = null;
		//names.length
		//System.out.println(names.length);
		Set<String> set = map.keySet();
		names = set.toArray();
		System.out.println(names.length);
		for(int i=0;i<names.length;i++) {
			String key = (String)names[i];
			System.out.println(key);
		}
	}

}
