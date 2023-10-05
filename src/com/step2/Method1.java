package com.step2;

public class Method1 {
	//메소드 리턴타입에 void가 아닌 원시형 또는 참조형이 오면
	//반드시 마지막에(맨끝에) return 예약어를 쓴다
	public String login(String id, String pw) {
		System.out.println("사용자가 입력한 id ==> " + id +", 사용자가 입력한 비번은 ===> " + pw);
		//아래 9번을 변수로 바꾸어 보시오.
		String name = "나신입";
		return name;
		//int i = 1;
	}
	public int methodA() {
		return 1;
	}
	public double methodB() {
		return 3.14;
	}
	public boolean methodC() {
		return true;
	}
	public void methodD() {
		//난 return 예약어를 쓰지 않아도 괜찮아
	}
	public static void main(String[] args) {
		Method1 m = new Method1();
		String name = m.login("kiwi","111");
		System.out.println(name);//뭐가 출력될까요?
		//파라미터의 갯수는 2개 이지만 두번째 타입이 boolean이라서 에러임
		//name = m.login("1",false);
		//파라미터의 갯수가 2개로 선언되었는데 하나만 넣어서 호출하는건 불법
		//name = m.login(1);
		//아래 코드도 메소드의 파라미터가 2개가 필요한데 아무것도 안적었으니까 에러임
		//name = m.login();
		//선언된 메소드의 파라미터가 두개 인데 파라미터 값을 3개 적는건 불법
		//name = m.login("","","");
		
	}

}
/*
메소드 선언하기
1. 리턴타입을 결정해 주세요
2. 파라미터가 필요한가요?
필요하다면 몇개가 필요하지? 
3. 나만 사용할건지 아님 공유할 건지 결정하자 - private, public
public>protected> friendly> private 

메소드를 선언하는 문장
(접근제한자) 리턴타입(void, 원시형타입,참조형타입) 메소드이름(빈상태, 한개, 두 개이상)

*/
