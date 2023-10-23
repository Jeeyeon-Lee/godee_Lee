package collec.list;
/*
 * 제네릭을 VO나 Map으로 선택하는 건 JSON형식에 사전 준비 작업이다.
 * 공공포털이나 회사들이 자신들의 서버를 공개하지 않는대신 요청에 대한 검색 결과를 JSON으로 제공한다.
 * List<VO> -> JSON,  JSON -> List<VO> , List<Map>바꾸어 쓸 수 있다.
입력 - add(element):boolean -> 응답처리시 선택, add(int, element):void -> 응답처리시 부적합
리턴타입이 boolean이라서 처리 결과에 대한 응답을 받아 볼 수 있다(보이지 않는걸 확인해줌)
메소드 선택시 기준이 될 수 있다. - 리턴타입이 있고 없고가 기준에 영향이 있다.
:사용자 정의 메소드를 설계할 때 리턴타입을 반드시 고려 하시오. - 안전한 코드를 작성하기위해
제네릭을 반드시 정한다. - 직관적이다. - 담는 사람도 꺼내는 사람도 기억할 수 없다.
그런데 서비스는 기억(알림설정, 메시지 푸쉬- 서비스)해준다.
수정 - set(int, element):Element(=Object) : 내가 추가한 것을 그대로 반환해준다.
상세보기
전체보기
삭제
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class List6{
	//원시형타입에서 참조형(XXXVO, Map)으로 제네릭을 바꾸었다.
	List<String> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
	}
	boolean rankDelete(String delValue) {
		boolean isOk = false;
		//insert here
		isOk = rank.remove(delValue);
		return isOk;
	}
} 
public class ListMain6 {

	public static void main(String[] args) {
		System.out.println("삭제하고자 하는 이름을 입력하시오.");
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
		String value = sc.nextLine();
		List6 l4 = new List6();
		l4.init();
		boolean isOk = l4.rankDelete(value);
		if(isOk) {
			System.out.println("삭제 처리되었습니다.");
			System.out.println(l4.rank);//[1,2,3] ->  1|3 -> [1,3,3]
		}
		else System.out.println("삭제 실패하였습니다.");
	}

}