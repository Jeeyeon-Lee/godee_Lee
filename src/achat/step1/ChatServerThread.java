package achat.step1;

import java.net.Socket;

public class ChatServerThread extends Thread {
	/*선언부*/
	ChatServer cs =null;
	/*생성자*/
	public ChatServerThread(ChatServer cs) {
		this.cs = cs;  //초기화 -> 부모의 List를 사용할 수 있는가? 
		System.out.println(cs.globalList.size());
	}
	/*정의메소드*/

	//run 메소드는 콜백메소드, 개발자가 직접 호출x, 시스템에서 대신 호출
	@Override //어노테이션
	public void run() {
		System.out.println("ChatServerThread의 run 호출");
	}
	//서버가 ct에게 들은 것을 방송(여러사람, for문-Thread)하는 메소드 -> ChatServer에 스레드 붙인 이유임.
	//왜 파라미터 자리인가? 매번 입력되는 메시지가 달라지기 떄문(지변으로 설정) 
	public void broadCasting(String message) { 
		for(int i=0;i<cs.globalList.size();i++) { //globalList는 챗서버에 접속한 사용자의 정보
			//ct에게 서버가 들은 메시지를 보낸다.
		}
	}	
}
