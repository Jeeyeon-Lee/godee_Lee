package com.step5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcTemplate implements ActionListener{
	//선언부
	JFrame jf = new JFrame();
	JTextField jtf = new JTextField("0");   //북쪽에 들어갈 텍스트필드
	JPanel jp_center = new JPanel();             //디폴트 : FlowLayout  ->GridLayout(4,4) 설정
	JButton jbtns[] = new JButton[16];
	String labels[] = {"7","8","9","+","4","5","6","-","1","2","3","*","C","0","=","/"};
	//생성자
	MyCalcTemplate(){
		initDisplay();
	}
	//사용자메소드
	public void initDisplay() {
		jp_center.setLayout(new GridLayout(4,4));
		jp_center.setBackground(Color.pink);
		for(int i=0;i<jbtns.length;i++) {
			jbtns[i] = new JButton(labels[i]);
			jp_center.add(jbtns[i]);
			jbtns[i].addActionListener(this);
		}
		jf.add("North",jtf); //창 북쪽에  jtf 붙이기
		jf.add("Center",jp_center);
		jf.setSize(400,500);
		jf.setVisible(true);
		jf.setTitle("처음 만들어보는 전자계산기");
	}
	//메인메소드
	public static void main(String[] args) {
		new MyCalcTemplate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
