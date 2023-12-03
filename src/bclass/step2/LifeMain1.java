package bclass.step2;

import java.util.StringTokenizer;

class Life1{
	/*선언부*/
	String s = null; //게으른 인스턴스화
	/*메소드-초기화*/
	public void init() {
		//여기서 게으른 인스턴스화의 주체는 개발자 -> 내가 직접 new 를 했음. 
		s = new String("300|kiwi"); //여기서 생성 -> 객체에 대한 라이프 사이클을 개발자가 관리! 
	}
	/*메소드-자원활용*/
	public void service() {
		StringTokenizer st = new StringTokenizer(s,"|");
		st.nextToken(); //300
		String who = st.nextToken(); //kiwi
		System.out.println(who);      //kiwi 
	}
	/*메소드-자원반납(소멸)*/
	
	//사용자원 반납하지 않으면 gc가 스레드 스케쥴에 따라 수거한다.(묵시적으로 우선순위에 따라 처리)
	public void destroy() {
		if(s != null) {
			s = null;
			//gc도 명시적으로 호출할 수 있음 메모리 점유와 관련 있음. 따라서 static의 남용은 안된다. 
			//2년차 미만 static 제약
			System.gc();
		}
	}
}
public class LifeMain1 {

	/* 메소드 요청 순서에 따라 예외 상황들이 발생할 수 있음. 
	 * 트러블 슈팅을 해야한다면 요청순서와 위치 또한 고려할 필요가 있음.*/
	public static void main(String[] args) {
		Life1 life = new Life1();
//		life.service(); //s null인 상태 -> 터짐 , 초기화가 먼저임.
		life.init();
//		life.destroy(); //canidate 상태 - gc에게 찜 -> 아래에서 값을 사용할 수 없음. 
		life.service(); //kiwi
		life.destroy(); //종료
	}
}