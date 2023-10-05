package com.step2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanel1 {
	int width = 500;
	int height = 400;
	//false이면, 메모리에는 로딩중이나, 화면에만 안 보임.
	//true로 초기화를 하면, 메모리에도 로딩중이고, 화면에도 보임.
	boolean isView = false;
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jft=new JTextField("안녕하세요");
	//화면을 그리는 메소드 선언
	
	public void initDisplay() {
		jp.setBackground(Color.pink);
		//setSize 메소드와 setVisible 메소드는 JFrame클래스가 정의하고 있는 메소드이다.
		jf.add("Center",jp); //add 메소드는 
		jf.add("South",jft);
		jf.setSize(width, height); // int 형식
		jf.setVisible(isView); //boolean 형식
	}
	public static void main(String[] args) {
		//insert here에서 initDisplay() 호출하시오.
		JPanel1 jp1 = new JPanel1();
		jp1.isView = true;
		jp1.initDisplay(); //전변으로 이 문제를 해결해 보자 -> 3개의 변수 필요
	}

}
