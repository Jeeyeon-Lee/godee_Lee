package com.week3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcView {
	//선언부
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnClear = new JButton("C");
	MyCalcEvent mcEvent = new MyCalcEvent(this);
	MyCalcLogic mcLogic = new MyCalcLogic(this);
	
	//생성자
	public MyCalcView() {
		initDisplay();
	}
	//메소드
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		jbtnOne.addActionListener(mcEvent);
		jbtnTwo.addActionListener(mcEvent);
		jbtnPlus.addActionListener(mcEvent);
		jbtnEqual.addActionListener(mcEvent);
		jbtnBack.addActionListener(mcEvent);
		jbtnClear.addActionListener(mcEvent);
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jp.add(jbtnClear);
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		MyCalcView mcView = new MyCalcView();
	}

}
