package com.step2;

public class Method3 {
	public String login(String id, String pw) {
		String name = "나초보";
		return name;
	}
	public void methodD(String name) {
		//난 return 예약어를 쓰지 않아도 괜찮아
		System.out.println("methodD호출 성공 : "+name);
	}
	public static void main(String[] args) {
		Method3 m = new Method3();
		//methodD()는 리턴타입이 void라서 대입연산자를 통해서 받을 수가 없는거야
		//int i = m.methodD();
		String name = m.login("apple", "123");
		m.methodD(name);
		//main안에서 선언한  지변 name의 값을 굳이 methodD에서 쓰고 싶어요. 어떡하지?
	}

}

