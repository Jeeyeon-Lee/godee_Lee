package achat.step1;

import java.util.StringTokenizer;

public class ProtocolTest {
	public static void main(String[] args) {
		String msg           = "200|kiwi|tomato|메시지 내용"; // |를 기준으로 토큰
		StringTokenizer st = new StringTokenizer(msg,"|");
		String protocol     = st.nextToken();
		String from          = st.nextToken();
		String to              = st.nextToken();
		String msg1          = st.nextToken();
		System.out.println(protocol+", "+from+", "+to+", "+msg1);
		//for/while문의 파라미터 안에는 boolean을 타입으로 들어감), not 원시형 타입
		while (st.hasMoreElements()) {
			//아래는 출력이 안됨 왜?이미 4개의 토큰의 순서를 돌고 왔으면 다른 입력x(이런 류의 클래스도 존재함)
			String s = (String)st.nextElement();
			System.out.println(s);     
		}
	}
}
