package com.week2;

public class AddressBook1 {
	AddressBook1 abook = null;
	//제목 : 메소드를 활용해서 나는 인스턴스화를 할 수 있다.(보통 이상)
	//메소드 안에서 조건에 따라 인스턴스화를 다르게 가져갈 수도 있다. - 다른 선택지가 생김
	public AddressBook1 getObject() {
		//이와 같이 null유무를 체크해서 생성하는 건 '하나만 관리하겠다.', '싱글톤'을 의미
		if(abook == null) { //객체를 생성하기 전에 null체크를 먼저(선처리) 해서 
			abook = new AddressBook1();
		}
		return abook;                      
	}
	public static void main(String[] args) {
		AddressBook1 abook = new AddressBook1(); //기본단계
	}
}
