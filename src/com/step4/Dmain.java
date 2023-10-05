package com.step4;
//계산된 총점을 찍고 싶어요. 어떡하죠?
//1. 클래스 설계 바꾸기 -> 3개를 2개로(변수, 메소드 하나로!)
class D{
	int tot;
	int avg;
	void hap(int n1, int n2, int n3) {
		//c.tot = n1 + n2 + n3;  이전 소스에서는 다른 클래스여서 인스턴스화 하였으나, 
		//이제는 같은 클래스여서(전변이 내 안에 있기 때문) 인스턴스화 필요x 변수로 초기화 가능
		//이러한 이유로 복사본이 아닌 원본 하나가 '유지(웹:쿠키와 세션), 관리'되고 있음을 인지해야함. 
		tot = n1 + n2 + n3; //바로 초기화 가능
	}
}
public class Dmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		D c = new D(); //같은 tot이어도 값이 달라질 수 있음. 
		c.hap(n1,n2,n3);
		System.out.println(c.tot); //0 -> 240 어떻게 가능해졌나? 설명해보기! 
	}
}
