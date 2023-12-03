package jdbc.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import oracle.net.aso.s;

public class List2 {
	/*정의메소드*/
	void methodA(List<BookVO> bookList) {
		BookVO bVO = new BookVO(); //내 안에 변수는 네 가지(No, Title, Author, Price) 생기자마자 스레드가 관리함!
		System.out.println(bVO.getB_title());
//		bVO.b_title = "수학의정석"; //캡슐화되어있어서 초기화 불가 -> getter/setter를 사용하여 입력, 출력 가능 
		bVO.setB_title("수학의정석");     
		System.out.println(bVO.getB_title());
		System.out.println("===============");
		bVO.setB_author("");     
		System.out.println("author의 길이는? "+bVO.getB_author().length());
		System.out.println("author는? "+bVO.getB_author());
		bVO.setB_author(null);     
		System.out.println("author는? "+bVO.getB_author());
//		System.out.println(bVO.getB_author().length()); //null 에러
		bVO = new BookVO();             //타입은 같지만, 객체가 달라짐. 생성 - 호출 - 죽임 (메모리 회수, 캔디데이트상
		System.out.println("===============");
		System.out.println(bVO.getB_title());
		System.out.println("===============");
	}
	void methodB(List<Map<String, Object>> bookList) {
	}
	/*메인메소드*/
	public static void main(String[] args) {
		List2 l2 = new List2();
		l2.methodA(null);
	}
}
