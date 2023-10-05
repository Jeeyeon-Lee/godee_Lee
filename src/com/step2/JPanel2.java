package com.step2;

import javax.swing.JFrame;

public class JPanel2 {
	JFrame jf = new JFrame();
	//화면을 그리는 메소드 선언
	public void initDisplay(int width, int height) {//파라미터 많아지면 param 쓰기
 		jf.setSize(width, height); // int 형식
		jf.setVisible(true); //boolean 형식
	}
	
	public void initDisplay(int width, int height, boolean isView) {//파라미터 많아지면 param 쓰기
 		jf.setSize(width, height); // int 형식
		jf.setVisible(isView); //boolean 형식
	}
	public static void main(String[] args) {
		JPanel2 jp1 = new JPanel2();
		jp1.initDisplay(600, 800); //위에 두개 값을 넣어도 실행되는 메소드가 있기 때문에 두개의 갑만 넣어도 실행 가능
	}

}
