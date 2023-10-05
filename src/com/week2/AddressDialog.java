package com.week2;

import javax.swing.JDialog;

public class AddressDialog {
	//선언부
	JDialog jdg_address = new JDialog();
	//생성자
	//1. 생성자에 메소드를 넣어둔 뒤 다른 메소드에서 호출없이 사용가능하도록 할 수 있음. 
	//화면처리부
	//메소드 설계를 통해 반복되는 코드와 제어권은 AddressBook에 가지면서도
	//그 변화된 부분은 AddressDialog가 처리하는 방법을 알아보자.
	//버튼이 눌리는 건 AddressBook 클래스에서 알고 있음. - actionPerformed가 있음.
	//그 버튼이 눌렸을 때, AddressDialog클래스에 title값을 변경해야함.
	//AddressBook에서 눌린 라벨값을 set 메소드의 파라미터를 통해 받아오고
	//setTitle 메소드를 호출하여 이 문제를 해결할 수 있을 것이다. 
	//조회버튼을 감지하는 if 문 안에서 set 메소드를 호출하시오.
	public void set(String title, boolean isView) {
		jdg_address.setTitle(title);  //세 개로 나오려면 메소드 설계, 파라미터 결정
		jdg_address.setVisible(isView);
		System.out.println(title + " 버튼을 클릭하였습니다.");
	}
	public void initDisplay() {
		jdg_address.setTitle("조회 | 입력 | 수정");  //세 개로 나오려면 메소드 설계, 파라미터 결정
		jdg_address.setSize(400,500);
	}
	//인스턴스화를 한다. 위치를 선택 - 전역 / 지변 선택
	//메인 메소드
/*
	public static void main(String[] args) {
		AddressDialog ad = new AddressDialog();
		ad.initDisplay();
	}
*/
}
