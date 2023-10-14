package com.step5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonArray implements ActionListener{
	//선언부
	JFrame jf = new JFrame();
	JButton jbtns[] = new JButton[4];
	String jbtnsLabels[] = {"one", "two", "three", "four"};
	//생성자
	public JButtonArray() {
		//객체배열 초기화하기, 생성자 첫번째 역할은 전역변수의 초기화를 담당
		for(int i=0;i<jbtns.length;i++) {
			jbtns[i] = new JButton(jbtnsLabels[i]);
			jbtns[i].addActionListener(this);          //이 클래스를 참조
		}
	}
	//사용자메소드
	public void initDisplay() {
		jf.setTitle("객체배열 연습");
		jf.setVisible(true);
		jf.setSize(500,300);
		jf.setLayout(new GridLayout(1,4)); // 1/4로 균등분할하여 레이아웃됨
		//for문 사용하여 각 버튼을 레이아웃으로 생상하여 배치함. 
		for(int i=0;i<jbtns.length;i++) {
			jf.add(jbtns[i]);
		}
	}
	//메인메소드
	public static void main(String[] args) {
		JButtonArray ja = new JButtonArray();
		ja.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
