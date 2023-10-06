package com.week3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView2 {
	//선언부
	//this 현재 메모리에 로딩되어 있는 클래스 자신을 의미
	CalcLogic cLogic  = new CalcLogic(this); //생성자의 파라미터 자리를 통해 넘김.
	CalcEvent cEvent = new CalcEvent(this); //생성자의 파라미터 자리를 통해 넘김.
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();                         //속지
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	//생성자
	public CalcView2() {	}
	
	//화면처리부
	public void initDisplay() {
		jbtnOne.addActionListener(cEvent);
		jbtnTwo.addActionListener(cEvent);
		jbtnPlus.addActionListener(cEvent);
		jbtnEqual.addActionListener(cEvent);
		jbtnBack.addActionListener(cEvent);
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		CalcView2 cv = new CalcView2();
		cv.initDisplay();    //디폴트 생성하면 선언부는 사용이 되는지? 원본을 가져오는지 확인해보기(주소 같음)
		System.out.println("원본 주소번지, 각 개체에 주입하기 "+cv);
	}



}