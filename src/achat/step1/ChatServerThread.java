package achat.step1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ChatServerThread extends Thread {
	/*선언부*/
	ChatServer cs =null;
	Socket client  = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois     = null;
	String chatName = null;  //현재 서버 입장한 클라이언트 닉네임 저장
	/*생성자*/
//	public ChatServerThread(List<ChatServer> globalList())) {	}
	public ChatServerThread(ChatServer cs) {
		this.cs = cs;  //초기화 -> 부모의 List를 사용할 수 있는가?
		this.client = cs.socket;
		//내가 입장하기 전 입장한 클라이언트에게도 메시지 전달해야함 
		for(ChatServerThread cst : cs.globalList) {
			System.out.println(cst.chatName);
			System.out.println(this.chatName);
			this.send(100+"|"+cst.chatName);
		}
		//현재 서버 입장한 클라이언트 스레드 추가하기
		cs.globalList.add(this); //this가 cst?cs?클라이언트?
		//입장한 사람 말하기
		this.broadCasting("100|apple");
//		cs.globalList.size();       //서버에 접속한 사람의 수
//		cs.jta_log.append("");   //로그에 붙이기? 
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
		for(ChatServerThread cst : cs.globalList){  //개선된 for문이 아래보다 더 직관적
//		for(int i=0;i<cs.globalList.size();i++) { 
			try {
				cst.send(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//globalList는 챗서버에 접속한 사용자의 정보
			//ct에게 서버가 들은 메시지를 보낸다.
			//oos를 하려면 소켓이 필요함!
//			ObjectOutputStream oos = new ObjectOutputStream(cs.socket.getOutputStream());
//			oos.writeObject(message);
		}
	}
	public void send(String message) {
		try {
			oos.writeObject(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
