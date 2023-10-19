package achat.step1;
//왜 Thread를 상속받나요? 
//메인메소드(entry porint)도 스레드라고 했는데? -> 시작점, exe 파일 생성, 경합 벌어짐 -> 끼어듬이 발생
//따라서 Thread를 따로 상속받아서 화면을 처리하는 메인메소드와 통신채널을 설정하는 코드를 분리한다. 
//스레드를 나누는 혜택은? 안전한 서비스 제공 가능

import java.awt.Color;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import javax.swing.JTextArea;

import atalk.step1.TalkServerThread;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class ChatServer extends Thread {
	/*선언부*/
	//List의 구현체 클래스 중 Vector를 사용한다. 왜?? 
	//array - 스레드에서 불안전
	//vector -멀티 스레드에서 안전(안전장치 있음) but, 읽기 쓰기 속도 느림(if문과 같은 로직이 더 들어가기 때문)
	//챗서버에 접속한 사용자의 정보를 담는 벡터선언 
	//다수의 클라이언트 요청을 처리하는 서버를 개발할 때 사용
	List<ChatServerThread> globalList = new Vector<>(); 
	JFrame jf = new JFrame();
	ServerSocket 			server 		= null;
	//서버는 들은 내용을 말하는 것
	//실제로 듣고 말하기는 ChatServerThread에서 처리(개발자가 설계) 
	//run메소드에서 서버소켓에 들어온 클라이언트 정보를 받게 됨. 
	//메소드 내부에서 사용하려면 전변으로 하기
	Socket 					socket 		= null;
	JTextArea jta_log = new JTextArea(10,60);
	//로그창에 대한 설정 -> 수평 사용x, vertical 필요시 사용o
	JScrollPane jsp_log = new JScrollPane(jta_log
			,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	@Override
	public void run() {
		//서버에 접속해온 클라이언트 스레드 정보를 관리할 공정한 벡터 생성하기 
//		System.out.println("ChatServer의 run 호출");
		globalList = new Vector<>();
		boolean isStop = false;
		//예외처리 : 만약 3002 포트를 오라클서버에서 점유하고 있다면!
		try {
			server = new ServerSocket(3002); //서버가 열림 
			jta_log.append("Server Ready.........\n"); //대기 중 -> 손님오길 기다림 -> 다음코드 실행기회x(흐름방해) ->장애처리
			while(!isStop) {
				//서버소켓에 접속해온 사용자의 소켓 정보를 담음
//				Socket s= new Socket("172.16.2.11",3002); //ct 입장
				socket = server.accept(); //ct 맞이
				jta_log.append("client info:"+socket+"\n"); 	//여기 소켓은 ct 소켓 쥐고 있음. 
				//아래에서 this는 ChatServer를 나타냄. 
				ChatServerThread tst = new ChatServerThread(this); //원본넘김, 협업
				//아래 start에서 ChatServer의 run이 호출됨. 
				tst.start();
				break; //반복문 탈출 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//말하기 처리는 메소드로 분리, 왜? 서버에 접속한 사람들에게(for문) 동일하게 메시지를 전달해야하기 때문 

	/*생성자*/
	/*정의메소드*/
	public void initDisplay() {
		jta_log.setLineWrap(true);//자동 줄바꿈
		jf.setBackground(Color.orange);
		jf.add("Center",jsp_log);
		jf.setTitle("Server Log Print");
		jf.setSize(800,600);
		jf.setVisible(true);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		//start와 run의 start의 위치 선정 중요 -> run-start는 지연이 발생할 수 있어서 후순위로 넣어야 함.
		//메소드들의 처리되는 시간(time-line) 다르다. 이 때문에 각자의 코드흐름을 생성하는 스레드가 필요하다. 
		cs.initDisplay();
		cs.start();  //Thread 상속받았기에 바로 start메소드 사용 가능 
	}
}
