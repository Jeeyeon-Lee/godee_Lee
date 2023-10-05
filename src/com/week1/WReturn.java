package com.week1;
//메소드 선언 문장
//(접근제한자) 리턴타입 메소드이름(파라미터자리){ }
//메소드 선언 시 리턴타입이 오는 자리에 void가 있다면 return예약어 쓸 수 x
//리턴되는 값이 없다면 다른 메소드에서 그 메소드가 가진 데이터를 재사용할 수 x
public class WReturn {
	void methodA() { 
		
	}
	//리턴 다음에 오는 코드는 반드시 타입을 맞춰야 한다.(또는 강제형변환 사용)
	//하나만 반환할 수 있음. 
	//만약 여러 개를 반환하고자 한다면 참조형 타입을 사용한다.
	int methodB() { //out이 없어서 출력x
		return (int)1.5; //1
	}
	
	public static void main(String[] args) {
		//여기에서 메소드B의 반환값을 출력할 수 있다? 없다?
		WReturn w=new WReturn();
		//리턴타입이 있는 경우, 대입연산자를 써서 반환되는 값을 담을 수 있다.
		int i = w.methodB(); //14번에 리턴이 있어서 합법, methodB에서 out이 없어서 출력x
		//여기에서 메소드A의 반환값을 출력할 수 있다? 없다? 
//		i = w.methodA(); 메소드 A는 리턴이 없어서 불법
	}

}
