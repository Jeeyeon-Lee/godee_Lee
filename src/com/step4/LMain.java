package com.step4;
//인스턴스화
//인스턴스화 전변 호출, 사용자정의 메소드 호출
class L{
	int i = 1;                      //전변-인스턴스화 후 외부클래스 접근가능
}
public class LMain {
	void methodA(L l) {       //파라미터로 객체를 참조받는 주소번지 기입
		System.out.println("호출성공 : "+l);
		int j = l.i;                 // 치환, 재정의, 지변 (l이 지변이기 때문에 바로 사용x 파라미터에 객체참조)
		System.out.println(j); // i값 호출 성공
	}
	
	public static void main(String[] args) {
		/*LMain에서 L에 정의된 전변 i를 사용하고 싶다면? - LMain 안에서 L클래스 인스턴스화
		(제어권을 spring이 갖는 것 <- spring 대신 인스턴스화 해 줌. 객체 라이프 사이클 관리해줌
		인스턴스화의 여러방법 꼭 체크! 새로운 시야를 갖게 됨.
		어떤 클래스명으로 인스턴스화 할 것인가?*/
		L l = new L();  //지변의 성격
		System.out.println(l.i);
		LMain lm = new LMain();
		lm.methodA(l);
	}
}
