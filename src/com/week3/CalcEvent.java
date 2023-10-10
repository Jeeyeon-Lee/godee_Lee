package com.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalcEvent implements ActionListener{
	CalcView2 calcView2 = null;
	JTextField jtf_display = new JTextField("0");
	public CalcEvent(CalcView2 calcView2) {
		System.out.println("객체 주입(원본), 현재 메모리에 로딩중"+calcView2); //객체 주입 원본, 현재 메모리에 로딩중
		this.calcView2 = calcView2;
	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			calcView2.jtf_display.setText(calcView2.jtf_display.getText()+"1");
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			calcView2.jtf_display.setText(calcView2.jtf_display.getText()+"2");			
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
		else if("C".equals(command)) { //너 C 버튼 누른거야?
			jtf_display.setText("");
		}
	}
}