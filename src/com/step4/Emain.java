package com.step4;
//계산된 총점을 찍고 싶어요. 어떡하죠?
//2. hap메소드 리턴타입 int로 바꾸기
class E{
	int tot;
	int avg;
}
class E1{
	int hap(int n1, int n2, int n3) {
		E c = new E();
		//리턴타입이 int로 가져가는 순간, Emain에서 E를 인스턴스화할 필요 x
		//왜 굳이 인스턴스화를 하게 되었나?
		//Cmain에서는 리턴타입이 void여서 메소드의 처리결과를 유지할 방법이 없었다.
		//지금은 리턴타입이 생기며, 메소드 호출을 통해 반환받을 수 있게 되었다. 
		//단, 인스턴스화가 달라지면 그 값은 당연히 변할 것이고
		//둘, tot를 전변으로 할 이유가 사라졌다.
		c.tot = n1 + n2 + n3;  //처리
		return c.tot;                //유지
	}
}
public class Emain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		E1 c1 = new E1();
		int tot = c1.hap(n1,n2,n3);
		System.out.println(tot);       //240 출력
	}

}
