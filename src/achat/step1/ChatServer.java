package achat.step1;

import java.awt.Color;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//왜 스레드를 굳이 상속받는 건가요? - 화면처리하는 메인메소드와 통신채널 설정하는 코드 분리
//혜택 - 화면처리와 네트워크 처리 분리한다 - 안전한 서비스 제공하기 위해서
public class ChatServer extends Thread {
	//List의 구현체 클래스는 ArrayList(스레드불안전-조치가 없다, 배려가 없다.추가로직이 포함안됨), Vector(동시접속자를 배려하여 0.1초라도 먼저 들어오면 관리를 해준다.읽기 쓰기 속도가 느리다.)
	//챗서버에 접속해온 사용자에 대한 정보를 담는 벡터 선언임
	//다수의 클라이언트 요청을 처리하는 서버를 개발할때 사용함
	List<ChatServerThread> globalList = null;
	ServerSocket server = null;//run 메소드 사용함 - 39번라인에서 인스턴스화함- 가게문을 열었음
	//서버는 들은내용을 말하는 것이다.
	//실제로 듣고 말하기는 ChatServerThread에서 처리한다.(내가 그렇게 설계했다.)
	//run메소드에서 서버소켓에 접속해온 클라이언트측의 소켓정보를 받게 되니까 - 메소드 내부에서 사용하려면 전변으로 하자
	Socket socket = null;
	JFrame jf = new JFrame();
	JTextArea jta_log = new JTextArea(10,60);
	JScrollPane jsp_log = new JScrollPane(jta_log
			 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			 , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public ChatServer() {}

	
	@Override
	public void run() {//통신에 대한 처리 -  지연, 끊김, 노이즈, 대기
		//서버에 접속해온 클라이언트 스레드 정보를 관리할 벡터 생성하기 
		globalList = new Vector<>();//ChatServerThread담기 -동시에 3명이 들어온다면
		boolean isStop = false;
		try {
			//만일 3002번 포트를 오라클 서버에서 점유하고 있다면 예외가 발생할 것이다.
			server = new ServerSocket(3002);
			jta_log.append("Server Ready.........\n");//대기 중 - 손이 오기를 기다린다. - 다음코드가 실행기회를 못갖는다. - 흐름을 방해함 - 장애처리
			while(!isStop) {
				//서버소켓에 접속해온 사용자의 소켓정보를 담는다. - 멍때림
				//Socket s = new Socket("172.16.2.3", 3002);-  ChatClient - 입장하기
			    //socket은 ChatServer에서 선언한 전변인데 어떻게 클라이언트 소켓을 주소번지를 쥐고 있는걸까?
				socket = server.accept();
				jta_log.append("client info:"+socket+"\n");//여기 소켓은 클라이언트소켓을 쥐고 있다.			
				//아래에서 this는 ChatServer가리킨다
				System.out.println(this);//왜 파라미터로 넘기지? - socket필요하니까-> oos, ois
				//다형성
				Thread tst = new ChatServerThread(this);//this- ChatServer -why?: 협업 - 서버에 접속한 소켓정보를 ChatServerThread에서 사용해야 하니까 this로 넘긴다.
				//생성자 호출이 끝나고 나면 즉시 start()호출된다.-> run()호출한다.
				//100|kiwi
				tst.start();//ChatServerThread의 run호출된다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void initDisplay() {
		jta_log.setLineWrap(true);
		jf.setBackground(Color.orange);
		jf.add("Center", jsp_log);
		jf.setTitle("서버측 로그 출력화면 제공...");
		jf.setSize(800, 600);
		jf.setVisible(true);
	}
	//메인메소드도 스레드라 했잖아요?
	//entry point - 시작점 - exe 생성가능함 - 경합벌어진다. - 끼어든다
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		System.out.println(cs);
		//두 메소드가 호출되었을 때 지연이 발생되는 메소드는 start()이다.
		//같은 메소드라도 처리되는 시간이 다르다- 스케쥴링이 필요함
		//this.sleep(10000), this.wait(); this.notify();
		//대기상태에 있는 손님이 있다.
		cs.start();//여기서 대기탄다 - this.wait(); -> this.notify();잠자는 스레드를 깨운다
		cs.initDisplay();
	}

}
