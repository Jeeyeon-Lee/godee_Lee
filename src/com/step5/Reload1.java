package com.step5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Reload1 extends JFrame implements ActionListener{
	/*선언부*/
	JPanel jp = new JPanel();
	JButton jbtnNew = new JButton("새로고침");
	JButton jbtn = new JButton("조회");
	/*생성자*/
	Reload1(){
		initDisplay();
		
	}
	/*정의메소드*/
	public void initDisplay() {
		jbtnNew.addActionListener(this); 
		this.add("North",jbtnNew);
		jp.setBackground(Color.pink);
		this.add("Center",jp);
		this.setSize(500,400);
		this.setVisible(true);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		Reload1 r1 = new Reload1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnNew) { //새로고침 누르면, 창 끄고 조회버튼을 가운데에 띄워줘.
			Container cp = this.getContentPane();
			cp.remove(jp);
			JPanel jpCopy = null;    //candidate 찜하기
			jp = null;
			jp = new JPanel();         //새로 생성되는 여기서 가비지 캘릭터가 위 값을 회수해가서 candidate 상태에 빠짐. 
			jpCopy = jp;                //치환하기(이 부분 연습 필요)
			jpCopy.setBackground(Color.gray);
			this.add("Center",jpCopy);
			this.revalidate();
			this.repaint();
		}
	}
}
/*이벤트 구현 3단계
 *버튼이름 연결 		jbtnNew.addActionListener(this); 
 *콜백메소드 정의 	public void actionPerformed(ActionEvent e) {
 *이벤트소스와 클래스를 매칭하기 		if(obj == jbtnNew) { //새로고침 누르면, 창 끄고 조회버튼을 가운데에 띄워줘.
 */
 