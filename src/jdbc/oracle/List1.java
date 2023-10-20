package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class List1 {
	/*선언부*/

	/*생성자*/

	/*정의메소드*/

	/*메인메소드*/
	public static void main(String[] args) {
//		List li2 = new List(); //인터페이스는 생성자 자리에 올 수 없음
		Map<String, Object> map = new HashMap<>();
		System.out.println(map);        // {}
		List li = new ArrayList();      // 
		System.out.println(li);         // []
		System.out.println(li.size());  //
		li.add(map);                    //
		System.out.println(li.size());  //
		System.out.println(li);         //
		//칼럼이 4개여도 2개만 put 하는 것도 가능, 나머지는 null이 될 것임. 
		map.put("b_no", 1);             //
		map.put("b_title", "혼자공부하는 자바");          //
		System.out.println("======================");
		System.out.println(li instanceof List);
		System.out.println(li instanceof ArrayList);
		System.out.println("======================");
		System.out.println(map.get("b_no"));
		System.out.println(map.get("b_title"));
		System.out.println(map.get("b_author"));
		/*
		 * 제네릭을 사용하지 않으면, 타입을 체크하여 형전환을 개발자가 직접 해야한다.
		 * 따라서 제네릭을 사용해야 한다. */
//		int b_price = map.get("b_price"); // 타입이 맞지 않음. 이게 VO와 Map을 제네릭으로 선택했을 때의 차이점??
		int b_price = (int) map.get("b_price"); //이게 VO와 Map을 제네릭으로 선택했을 때의 차이점??
		b_price = (int) map.get("b_price"); //이게 VO와 Map을 제네릭으로 선택했을 때의 차이점??
		System.out.println(b_price); //리턴값이 "java.util.Map.get(Object)" is null 
		System.out.println(map);        // {b_no=1, b_title=2}
		li = new Vector();              //
		li = new LinkedList();          //
		List<Map<String, Object>> li2 = new ArrayList<>();
		System.out.println(li2);
	}
}
