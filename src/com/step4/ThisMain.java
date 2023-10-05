package com.step4;

import javax.swing.JFrame;

class ZipcodeApp{
	//선언부
	JFrame jf = new JFrame();
	
	//클래스마다 생성자 생성 가능(but 디폴트만 가능, 없어도 이상x)
	//괄호가 있음->실행문 올 수 있음->초기화, for, if문, 연산, 메소드 호출 등이 가능함.
	//선처리와 후처리에 대해 필수로 파악
	//생성자
	ZipcodeApp(ThisMain tm) {     //static이 없는 생성자이기 때문에 인스턴스화 없이 사용 가능
		System.out.println(tm.i);
		for(double d=0;d<99999;d++) {
			System.out.println("지연되고 있습니다.");
		}
		//메소드 호출 순서를 정할 수 있어야 한다.(대기상태, 지연, 데드락...)
		intitDisplay();
	}
	//화면그리기
	public void intitDisplay() {
		System.out.println("화면그리기");
		jf.setSize(400,600);
		jf.setVisible(true);
	}
}
public class ThisMain {
	int i = 1;
	//생성자
	ThisMain(){
		
	}
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		ZipcodeApp zc = new ZipcodeApp(tm);   //static을 사용하지 않으면서 세개의 클래스를 연결하는 곳
	}
}
