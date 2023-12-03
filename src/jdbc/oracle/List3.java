package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.net.aso.s;

public class List3 {
	/*정의메소드*/
	void methodA(List<BookVO> bookList) {
		// 사용권 나신입 로그인 권한
		System.out.println(bookList);
		BookVO rbVO = bookList.get(0);
		System.out.println((Integer)rbVO.getB_price() instanceof Integer);   //인티저 타입인가? true
		System.out.println((Integer)rbVO.getB_price() * 5);                        //인트로 타입이 정해져있기 때문에 연산 가능하다. 
	}
	void methodB(List<Map<String, Object>> bookList) {
		System.out.println(bookList);
		Map<String, Object> rmap = bookList.get(0);
		System.out.println(rmap.get("b_price") instanceof Integer);  //인티저 타입인가? true
		System.out.println(rmap.get("b_price") instanceof Object);  //오브젝트 타입인가? true
		System.out.println(rmap.get("b_price") instanceof String);   //스트링 타입인가? false
//		System.out.println(rmap.get("b_price") * 5);                      //인트가 아닌 오브젝트타입이어서 계산 x
	}
	/*메인메소드*/
	public static void main(String[] args) {
		List3 l3 = new List3();
		BookVO bVO = new BookVO();
		//bvo는 파라미터로 넘기려고함. 
		//아래의 리스트와 맵은 나중에 메소드의 파라미터로 넘길예정이야
		//그런데 왜 null로 설정인데 넘어가면 null이 되잖아 왜 그랬어?
		//파라미터 자리는 지역변수가 들어가고, 생성이 아닌 선언만 할 수 있는 자리니까 괜찮아
//		List<BookVO> bookList = null;
//		List<Map<String, Object>> bookMap = null;
		List<BookVO> bookList = new ArrayList<>();
		System.out.println("값 넣기 전 bookList 갯수? "+bookList.size()); //0 왜? 
		bVO.setB_no(1);
		bVO.setB_title("자바의 정석");
		bVO.setB_author("남궁성");
		bVO.setB_price(30000);
		//아래에서 BookVO 주소번지 하나 담겼고 그 안에는 변수 4개(타입확인)가 있다.
		bookList.add(bVO);
		System.out.println("값 넣은 후 bookList 갯수? "+bookList.size()); //1 왜? 
		List<Map<String, Object>> bookMap = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
//		bookMap.add(bVO); //제네릭 타입이 달라서 에러
		System.out.println("값 넣기 전 bookMap 갯수? "+bookMap.size()); //0 왜? 
		bookMap.add(map); //빈깡통이 들어감. 
		System.out.println("깡통값 넣은 후 bookMap 갯수? "+bookMap.size()); //1 왜? 
		map.put("b_no",1);
		map.put("b_title","자바의 정석");
		map.put("b_author","남궁성");
		map.put("b_price",30000);
		bookMap.add(map);
		System.out.println("테이블 값 넣은 후 bookMap 갯수? "+bookMap.size()); //2 왜?
		l3.methodA(bookList);
		l3.methodB(bookMap);
		}
}
