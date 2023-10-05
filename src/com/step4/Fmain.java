package com.step4;
//계산된 총점을 찍고 싶어요. 어떡하죠?
//3. 원본, 전변을 살려서 처리하기
class F{
	int tot;
	int avg;
}
class F1{
	int hap(int n1, int n2, int n3, F c) { //call by reference(참조에 의한 호출)가 됨??
		//아래 메인에서의 인스턴스화가 그대로 올라와서 값이 유지됨.
		c.tot = n1 + n2 + n3;
		return c.tot;
	}
}
public class Fmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		F c = new F(); //같은 tot이어도 값이 달라질 수 있음. 
		F1 c1 = new F1();
		//11번 인스턴스화를 하지 않고서도 가능하다. ->참조형을 넘길 수 있기 때문
		//hap 메소드 안에서도 F클래스에 대한 인스턴스화가 필요하였고, main메소드 안에서도 
		//전변 tot를 출력하기 위해 인스턴스화가 필요하였다. 
		//그런데 메소드 호출이 c.tot 호출보다 먼저니까 c에 대한 인스턴스화 진행함. 
		//그 주소번지를 hap메소드 파라미터로 넘기면 원본을 넘기는 것이니까 c.tot가 240으로 유지된다?
		int hap = c1.hap(n1, n2, n3, c);
		System.out.println(hap); // 240
	}
}
/*
1. 전변을 활용하여 처리하는 방법
: 클래스의 구조를 변경(클래스 3개->2개)
: 메소드 호출 시 파라미터 자리에 참조에 의한 호출로 처리
2. 지변을 활용하여 처리하는 방법
: 메소드의 리턴타입을 이용(int로 변경)
 */
