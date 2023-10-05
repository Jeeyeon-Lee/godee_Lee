package com.week1;
//Account 클래스는 사용자에게 두 수(int)를 입력받아서 
//두 수의 합을 구하는 메소드를 구현하기 위해 설계 + 파라미터를 보여주기 위해 지역변수를 사용
class Account{ 
	int first; //이것은 전변이라서 초기화를 하지 않아도 0을 가지고 있다.
	int second;
//	int first, second; //이 값도 합법
	//파라미터를 사용하지 않고 계산하기 위해서는 전역변수를 사용해야 함.
	public void hap1() {
		System.out.println("Account 객체, hap1 함수를 호출하여 나온 값은 = "+(first + second)); // 출력문장이 있어도 hap1 메소드를 호출하지 않으면 작동하지  x
	}
	//두 수를 파라미터로 받아서 계산하므로, 지역변수로 가능함.
	//파라미터 자리에서는 초기화를 할 수 없음. 지역변수를 선언만 하는 자리이기 때문에!!
	//지역변수는 반드시 초기화를 해야 함 
	//그럼 언제? 어디에서 가능할까요?
	//파라미터 자리의 변수값은 호출될 때 결정되지만
	//호출되는 메소드 안에서 다른 값으로 변경될 수 있다.(Call by value)
	public void hap2(int first, int second) { //선언!!    , 메인에서 first는 1, second는 3으로 올라왔지만, 15번에서 바꿔치기 함.
//     int first로 못 쓰는 이유는? 위에서 이미 선언되었기에, 아래에선 초기화만 해야함. 두 번 선언x
		System.out.println("Account 객체, hap2를 인스턴스화하고,여 아래에서 올라온 온전한 값은 = "+(first+second)); //4
		first = 0;    //재정의 되었다.
		second = 1;
		System.out.println("hap2 메소드 안에서 재정의 되어 바꿔치기 되어 나온 값은 = "+(first + second)); //런타임 에러
	}
	public void hap3() {
	}

}//end of Account
public class AccountSimulation {

	public static void main(String[] args) {
		Account as = new Account();
		as.hap2(0, 0); //4가 출력될까?? 놉
//		as.hap2(); 오류 生, 메소드 호출할 때 반드시 파라미터 갯수나 타입 맞춰줘야 함. 
//		as.hap2(1, false); 오류 生, 메소드 호출할 때 반드시 파라미터 갯수나 타입 맞춰줘야 함. 
		as.hap1();
	}
}
