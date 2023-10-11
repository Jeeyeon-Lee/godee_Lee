package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class M {
	//JFrame은 
	JFrame jf = new JFrame();
	JButton jbtn = new JButton("조회22");
	JButton jbtn2 = jbtn;
//	JButton jbtn2 = new JButton("입력");

	public void initDisplay() {
		System.out.println(jbtn == jbtn2); //true 
		jf.setVisible(true);
		jf.setSize(300,400);
		jf.add("North",jbtn);
		jf.add("Center",jbtn2);
	}
	public static void main(String[] args) {
		M m = new M();
		m.initDisplay();
	}
}
