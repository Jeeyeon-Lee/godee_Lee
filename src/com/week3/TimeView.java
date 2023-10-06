package com.week3;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeView {
	//선언부
	JFrame jf = new JFrame();                                    //이것도 생성자
	Font font = new Font("돋움체", Font.BOLD, 30);      //이 것도 생성자
	JLabel jlbTime = new JLabel("현재시간정보", JLabel.CENTER);       //이것도 생성자
	TimeClient tc = new TimeClient(jlbTime);
	/*
	JLabel(String text, int horizontalAlignment)
	Creates a JLabel instance with the specified text and horizontal alignment.
	 */
	//생성자
	
	//사용자정의 메소드
	public void initDisplay() {
		jlbTime.setFont(font);
		jf.add("North",jlbTime);
		jf.setSize(700,400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		TimeView tv = new TimeView();
		tv.initDisplay();
	}

}
