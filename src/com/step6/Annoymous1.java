package com.step6;
/*
업무에 따라(재고관리, 부서관리 등등) 바뀌는건 집합이름과 컬럼명만 바뀌고 나머지는 다 그대로임. - syntax
SELECT  empno, ename
FROM    emp
Where   empno =:x;     -- 파라미터자리
<오라클의 처리과정>
1단계 : parsing함
2단계 : DBMS에게 실행계획을 받아낸다
3단계 : 옵티마이저가 실행계획에 따라 처리하기
4단계 : open 테이블, 커서, 메모리에 fetch, close 
이 과정에서 집합이름과 컬럼명만 바뀌고 나머지는 그대로이다. 
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Annoymous1 extends JFrame {
	/*선언부*/
	JButton jbtn = new JButton("조회");
	/*생성자*/
	public Annoymous1() {
//		jbtn.addActionListener(this); //이렇게 하면 익명 클래스 만들어지지 않음. 
		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("조회");
			}
		}); 
		this.add("North",jbtn);
		this.setSize(500,400);
		this.setVisible(true);
	}
	/*정의메소드*/
	/*메인메소드*/
	public static void main(String[] args) {
		new Annoymous1();
	}

}
