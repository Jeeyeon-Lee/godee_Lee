package com.step3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RandomGameView extends JFrame  implements ActionListener{
	//속지 담당 JPanel
	JPanel       jp_center = new JPanel();  //중앙에 다중문쓰는 JTextArea 배치
	JPanel       jp_east    = new JPanel();     //남쪽에는 한 줄로 입력받는 JTextField 배치
	JTextArea  ta_result   = new JTextArea(10, 50);
	JTextField	tf_input   = new JTextField("", 10);
	JButton     jbtnNew   = new JButton("새 게임");
	JButton     jbtnDap   = new JButton("정답");
	JButton     jbtnClear   = new JButton("지우기");
	JButton     jbtnExit   = new JButton("종료하기");
	Font f = new Font("Thoma", Font.BOLD, 18);
	
	public void initDisplay(){
		//사람은 엔터를 치고, JVM은 엔터를 느껴서 actionlistener라는 인터페이스의 약속된 메소드를 오버라이딩 하기
		tf_input.addActionListener(this);  //이벤트 소스와 처리를 담당하는 핸들러 클래스 매핑하기
		jp_center.setLayout(new FlowLayout());  //FlowLayout() 동, 서, 남, 북 중앙 버튼이나 체크박스 배치하기 가능
		jp_east.setLayout(new GridLayout(4,1,2,2));
		jp_center.setBackground(Color.pink);
		jp_east.setBackground(Color.black);
		jp_center.add("South",tf_input);
		jp_center.add("Center",ta_result);
		jp_east.add(jbtnNew);
		jp_east.add(jbtnDap);
		jp_east.add(jbtnClear);
		jp_east.add(jbtnExit);
		this.add("Center",jp_center);                 //add 붙이다
		this.add("East",jp_east);                 //add 붙이다
		this.setTitle("숫자맞추기게임");
		this.setSize(600,400);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이 코드가 x 버튼이 눌렸을 때 사용된 자원을 회수하는 코드
	}	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		RandomGameView rgv = new RandomGameView();
		rgv.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String command = e.getActionCommand();//이벤트 발동하는 버튼의 라벨
		if("1".equals(command)) {
			System.out.println(command);
			ta_result.append(command);
		}
		else if(obj == tf_input) {
			ta_result.append(tf_input.getText()+"\n");  //\n 줄바꿈
			tf_input.setText("");
		}
	}
}