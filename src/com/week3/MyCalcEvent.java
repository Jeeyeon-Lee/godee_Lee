package com.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalcEvent implements ActionListener {
	//선언부
	//+ 연산자 누르기 전 입력된 값 담기-전변
	String v1 = "";
	//= 연산자 누르고 난 뒤 입력된 값 담기-전변
	String v2 = "";
	//연산자 담기(+,-,*,/)-전변
	String op = "";
	MyCalcView myCalcView = null; //초기화
	//생성자
	public MyCalcEvent(MyCalcView myCalcView) {
		this.myCalcView = myCalcView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("1".equals(command)) {//너 숫자 1 버튼 누른거야?
			//전처리하기 - 맨 앞이 0인 경우 전철함.
			if("0".equals(myCalcView.jtf_display.getText())) {
				myCalcView.jtf_display.setText("");
			}
			myCalcView.jtf_display.setText(myCalcView.jtf_display.getText()+"1");
		}
		else if("2".equals(command)) {//너 숫자 2 버튼 누른거야?
			if("0".equals(myCalcView.jtf_display.getText())) {
				myCalcView.jtf_display.setText("");
			}
			myCalcView.jtf_display.setText(myCalcView.jtf_display.getText()+"2");			
		}
		else if("+".equals(command)) {//너 + 버튼 누른거야?
			System.out.println("더하기 버튼");
			//v1 담기
			v1 = myCalcView.jtf_display.getText();
			System.out.println("v1 : "+v1);
			//op담기
			op = "+";
			myCalcView.jtf_display.setText("");
		}
		else if("=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("계산 결과는 얼마");		
			//v2담기
			v2 = myCalcView.jtf_display.getText();
			String result = myCalcView.mcLogic.calcurate(v1, v2, op);
			myCalcView.jtf_display.setText(result);
		}		
		else if("<=".equals(command)) {//너 = 버튼 누른거야?
			System.out.println("한글자씩 지우기 구현");		
		}		
		else if("C".equals(command)) { //너 C 버튼 누른거야?
			myCalcView.jtf_display.setText("");
	}
	}

}
