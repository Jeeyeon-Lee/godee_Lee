package com.week2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//클래스 선언
//ActionListener는 인터페이스여서 추상메소드를 갖고 있다. -> 개발자가 구현하는 것에 따라 구성되도록! 추상으로 더함.
//추상메소드란, 선언만 되어있고, 좌중괄호와 우중괄호가 없는 메소드를 말함.
public class AddressBook implements ActionListener{  //버튼이 눌러진 이벤트를 감지하여 의도대로 코드를 삽입할 수있음. 
	JFrame jf = new JFrame();                          //창 구상
	AddressDialog  aDialog = new  AddressDialog();
	JPanel jp_north = new JPanel();                  //버튼 4개 배치로 사용, 모양 없음. 화면을 그리는 클래스(컴포넌트)
	JButton btnSelct = new JButton("조회");       //버튼 생성
	JButton btnInsert = new JButton("입력");
	JButton btnUpdate = new JButton("수정");
	JButton btnDelete = new JButton("삭제");
	//선언부
	
	//생성자
	public AddressBook() {}
		
	//화면처리
	public void initDisplay() {
		
		//이벤트 처리 3단계 -  버튼의 이벤트를 지원하는 인터페이스를 implements한다. - ActionListener
		//해당 인터페이스가 선언하고 있는 메소드를 오버라이딩 해야한다. - actionPerformed(ActionEvent e)
		//이벤트소스와 이벤트 처리를 담당하는 클래스를 매칭해줌
		//ActionPerformed메소드는 마치 main메소드 처럼 버튼이 눌려지고, 눌려졌다는 것을 JVM이 감지하면
		//그 때 자동으로 호출되는 메소드입니다. - 콜백메소드(callback)
		btnSelct.addActionListener(this);          
		btnInsert.addActionListener(this);           //this는 ActionListener 구현하고 있는 클래스 - AdressBook이다.
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		jp_north.add(btnSelct);                        //jp_north에 버튼 추가
		jp_north.add(btnInsert);                       //jp_north에 버튼 추가
		jp_north.add(btnUpdate);                    //jp_north에 버튼 추가
		jp_north.add(btnDelete);                     //jp_north에 버튼 추가
		jf.add("North",jp_north);                      //추가, 위치 구성
		jf.setTitle("주소록 Ver1.0");
		jf.setSize(800, 500);
		jf.setVisible(true);                                //부모가 열리는 자리!!
		aDialog.initDisplay();
		aDialog.set("",false);
	}
	//메인메소드
	public static void main(String[] args) {
		AddressBook abook = new AddressBook(); //기본단계
		abook.initDisplay();
	}
	//아래 메소드는 ActionListener인터페이스에 이름이 정해져 있다.(자바에서 제공되는 메소드)
	//구현체 클래스인 너가 재정의하여 구현해라.
	@Override //annotation
	public void actionPerformed(ActionEvent e) {  
		//눌려진 버튼의 문자열을 읽어온다. - 버튼이 눌렸을 때, 버튼을 누르는 건 사용자
		//눌렸다는 건 JVM만 알 수 있다. 파라미터 자리에 e를 가지고 getActionCommand를 호출하면
		//String 타입의 라벨을 출력함. 
		String command = e.getActionCommand();   //위에 입력된 조회, 입력, 수정, 삭제의 문자열을 가져옴.
		System.out.println(command);
		//너 조회를 원해?  -> 조건식 -> else if문(단순 if보다 일의 양 감소)
		if("조회".equals(command)) {
			aDialog.set("조회",true);
		//너 입력하려고?
		}else if("입력".equals(command)) {
			aDialog.set("입력",true);
		//너 수정하려고?
		}else if("수정".equals(command)) {
			aDialog.set("수정",true);
		//너 삭제할거니?
		}else if("삭제".equals(command)) {
		}
	}
}