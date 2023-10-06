package com.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView implements ActionListener{
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	
	//이벤트 처리를 담당하는 핸들러 클래스의 인스턴스 변수를 준다.
	public void initDisplay() {
		jbtnOne.addActionListener(this);
		jbtnTwo.addActionListener(this);
		jbtnPlus.addActionListener(this);
		jbtnEqual.addActionListener(this);
		jbtnBack.addActionListener(this);
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
	public static void main(String[] args) {
		CalcView cv = new CalcView();
		cv.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			jtf_display.setText(jtf_display.getText()+"1");
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			jtf_display.setText(jtf_display.getText()+"2");			
		}
		else if("+".equals(command)) {//너 + 버튼 누른거야?
			System.out.println("더하기 버튼");
		}
		else if("=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("계산 결과는 얼마");			
		}		
		else if("<=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("한글자씩 지우기 구현");		
		}		
	}

}