package com.week3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {
	//선언부
	JLabel jlbTime = null;    //초기화
	public TimeClient(JLabel jlbTime) {        /*이 부분이 학습 필요한 부분 */
		this.jlbTime = jlbTime;
//		TimeServer ts = new TimeServer();   소켓으로 연결되었으니 필요x
//		jlbTime.setText(ts.getTime());
	}
	//생성자
	public TimeClient() {} 
	//사용자정의메소드
	//메소드 오버라이드 - 콜백메소드 - ex)actionPerformed - 개발자가 직접 호출하지 못 하는 단점 - 
	@Override
	public void run() { 
		System.out.println("run호출");
		Socket socket = null;
		//다른 스트림 중 아래 선택이유? 내부적 직렬화, 다른 stream클래스보다 보안 높아서 사용
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String timeStr = null;
		try {
			socket = new Socket("172.16.2.11",5000);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				timeStr = ois.readObject().toString();
				System.out.println(timeStr);
				try {
					sleep(1000);
				} catch (Exception e) { //Exeption은 스레드 지원 클래스 
				}
			}/////////////////////////end of while/////////////////////////////
		} catch (Exception e) {
		} finally { //명시적으로 종료시키지 않으면 시점이 계속 늘어져서 종료를 시켜줘야 함. (생성의 역순으로) 
			try{
				ois.close();
				oos.close();
				socket.close();
			}catch (Exception e) {
			}
		}
		}
	///////////////////////////////end of run/////////////////////////////
	//메인메소드
	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start(); //run메소드를 호출하는 메소드!(JVM이 인터셉트)
	}
}
