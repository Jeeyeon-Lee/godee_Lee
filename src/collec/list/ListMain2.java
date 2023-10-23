package collec.list;

import java.util.ArrayList;
import java.util.List;

class List2{
	/*선언부*/
	List<Integer> li = new ArrayList<>();
	List<String> names = null;
	/*생성자*/
	public List2() {
		//names를 인스턴스화 하는 문장을 작성
		names = new ArrayList<>();
		//li에 숫자 1을 담는 코드를 작성 -List의 add메소드 사용
		//1. void add(int, element) -> 리턴타입이 void여서 대입연산자로 받을 수 없음.
		//2. boolean isOk = add(E e) -> true일때 "성공", false일때 "실패" 등 결과 출력 가능 
		//API에서 제공되는 메소드 중 처리결과를 받을 수 있는 메소드가 있고 그 중 하나가 2번 add이다. 
//		li.add(1);
		boolean isOk = li.add(1);
		names.add("나신입");
		System.out.println(names);              //[나신입] 외부에서는 이전 정보를 출력할 수 없음(위치의 문제->기초x)
		Object obj = names.set(0, "나초보"); //나초보로 덮어쓰기 (add로 하면 사이즈 추가, set으로 하면 사이즈 유지)
	}
}
public class ListMain2 {
	public static void main(String[] args) {
		//[1]울 출력하는 코드
		List2 list2 = new List2();
		System.out.println(list2.li);                  // [1 ]
		System.out.println(list2.li.get(0));         //   1
		//[나신입]을 출력하는 문장
		System.out.println(list2.names);          //[나초보]
		System.out.println(list2.names.get(0)); //  나초보
	}
}