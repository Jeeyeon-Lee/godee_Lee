package achat.step1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.StringTokenizer;

public class ChatServerThread extends Thread {
	/*선언부*/
	ChatServer cs =null;
	Socket client  = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois     = null;
	String chatName = null;//현재 서버에 입장한 클라이언트 스레드 닉네임 저장
	/*생성자*/
//	public ChatServerThread(List<ChatServer> globalList())) {	}
	public ChatServerThread(ChatServer cs) {
		cs.jta_log.append("ChatServerThread 호출"+"\n"); //챗서버스레드
		this.cs = cs;  //초기화 -> 부모의 List를 사용할 수 있는가?
		this.client = cs.socket;
		cs.jta_log.append("client "+client+"\n");		
		try {
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			//100|kiwi
			String msg = (String)ois.readObject();//누가 보낸걸 듣나요? ChatClient
			cs.jta_log.append(msg+"\n");//로그를 남긴다(출력) - 추적하다
			StringTokenizer  st = new StringTokenizer(msg,"|");
			st.nextToken();//100
			chatName = st.nextToken();//kiwi
			cs.jta_log.append(chatName+"님이 입장하였습니다.\n");
			
			//내가 입장하기 전에 이미 입장해 있는 친구들 에게도 메시지를 전달해야 한다.
			//kiwi가 입장했을땐 cs.globalList.size()가 0이라서 안탄다
			for(ChatServerThread  cst: cs.globalList) {//cs.globalList.size()=0
				System.out.println(cst.chatName);
				System.out.println(this.chatName);
				this.send(100+"|"+cst.chatName);//나 입장했어요
			}
			//현재 서버에 입장한 클라이언트 스레드 추가하기
			cs.globalList.add(this);//3명이 채워짐 - ChatServerThread -> globalList(ChatServer) -> this(kiwi or tomato or  apple)
			this.broadCasting(msg);
			// apple이 입장했을때 이미 kiwi, tomato입장해 있다
			//cs.globalList.add(this);//this는 kiwi, tomato, apple, 아님 이걸 어떻게 서버가 구분할 수 있나요?
			//cs.globalList.add(this);//this는 ChatServerThread이다. - List<ChatServerThread> globalList
			//cs.globalList.size();//3명
			//cs.jta_log.append("");
			//System.out.println(this.cs.globalList.size());//0			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

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
		for(ChatServerThread cst:cs.globalList) {	
			cst.send(message);
			//클라이언트 들에게 서버가 들은 메시지를 보낸다.- OutputStream
			//ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			//oos.writeObject(message);
		}
	}
	public void send(String message) {
		try {
			oos.writeObject(message);
		} catch (Exception e) {
			e.printStackTrace();//stack에 쌓여 있는 로그 히스토리를 출력함
		}
	}

}