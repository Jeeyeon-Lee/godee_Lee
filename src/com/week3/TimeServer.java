package com.week3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class TimeServer extends Thread {
	//생성자
	//아래 소켓은 서버소켓에 접속해온 클라이언트의 소켓정보를 쥐고 있다. 
	Socket client = null;
	 /*이 부분이 학습 필요한 부분 */
	public TimeServer(Socket client) { //getTime에서 나온 정보를 소켓을 통해 보냄. 
		this.client = client; 
	}
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		return hour +":"+min+":"+sec;
	}
	//오버라이드 - 콜백메소드-run 함수의 오버라이드
	@Override
	public void run() {  //1초에 한번씩 보내야하는 스레드 필요!
		try {
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream()); //소켓을통해 객체를 받아야함. 마이크와 스피커
			while(true) { //무한루프
				//서버소켓에 접속한 클라이언트 소켓을 가지고 OutputStream을 생성하면 writeObject메소드를 통해 Object 단위로 메세지를 쓸 수 있다.
				System.out.println("server run 호출");
				oos.writeObject(getTime()); 
				try {                          //인터셉트 일어날 수 있으니 예외처리 반드시 필요!!
					sleep(1000);  //1초
				} catch (Exception e) { //예외가 있으면 잡아줘
					System.out.println(e.toString());
				} finally {                  //무슨일이 있어도 이건 해줘
					try {
						client.close();
					} catch (Exception e) {
					}
				}
			}////////////////////////////////////while end//////////////////////////////////////////////
		} catch (Exception e) {
		}
	}
	/*
	서버측에서 CalendarAPI를 이용해 현재 시간 정보를 반환하는 메소드를 설계한다
	반환타입과 리턴타입 결정 -> 파라미터는 필요x(국제 표준시니까), 리턴타입은 string으로 해서 JLabel에 찍자
	Calendar(TimeZone zone, Locale aLocale)
	Constructs a calendar with the specified time zone and locale.
	field - static int
	*/ 
	public static void main(String[] args) {
		int port = 5000;
		ServerSocket server = null;  //존재만 함. 일x, ServerSocket은 예외처리를 반드시 하게 되어있는 클래스임. 
		Socket client = null;           //일을 하는 소켓
		try{
			server = new ServerSocket(port);
		} catch (IOException ie) {
			System.out.println("해당 포트는 이미 사용중입니다.");
			try {
				server.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			} 
		}
		System.out.println("TimeServer started successfully");
		while(true) { //서버 24시간 작동 무한루프앞에선 예약만 받고, 서버가 자리로 안내하는...?!
			try {
				client = server.accept();
				if(client != null) {
					System.out.println(client);					
				}
				System.out.println("New client connected..."+client.getInetAddress());
				//메소드 안에서 선언된 클라이언트소켓을 런메소드에서 사용하고 싶어서 파라미터값에 넣어서 초기화시켜 사용
				TimeServer ts = new TimeServer(client); 
				ts.start();
				System.out.println("New TimeServer Thread started...");
			} catch (Exception e) {
				System.out.println("Can't start server thread!!");
				e.printStackTrace(); //에러에 대한 정보를 확인할 수 있음. 디버깅할 때 많이 사용함.
				try {
					client.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}