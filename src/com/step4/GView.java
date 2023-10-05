package com.step4;
//16-20-(12-13-5-6-7)-22-(반복)
class GLogic{
	int i = 1;
	public GLogic(GView gv) {  //null
		System.out.println("GLogic : "+gv);
		System.out.println("GLogic i : "+gv.j);
	}
}
public class GView {
	int j = 1;
	GView() {	//디폴트 생성자만 생략 가능함!
		GLogic gl = new GLogic(this);          //this는 현재 스레드가 관리하는 클래스이고 원본 나 자신
		//원본인지 확인하는 법? 전역변수로 확인 가능??
	}
	public static void main(String[] args) {
		//static 안에서는 this나 supper(부모클래스 수정자?) 사용 불가 -> 생성자에서는 가능하다
		//이 때 this는 18번 거일까? 20번 거일까?(주소번지 다름 -> 다른값 들어갈 수 있음 -> 좋지 않은 방법)
		//해결? static으로 하거나, 싱글톤으로 처리(메모리 누수 막기)
		GView gv = new GView(); //생성자를 첫번째 호출
		System.out.println("GView 1 : "+gv);
		gv = new GView();           //생성자를 두번째 호출
		gv.j = 10;
		System.out.println("GView 2 : "+gv);
	}
}
