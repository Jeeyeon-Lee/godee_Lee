package com.step4;
class GLogic{
	int i = 1;
	public GLogic(GView gv) {  //null
		System.out.println(gv);
	}
}
public class GView {
	//디폴트 생성자만 생략 가능함!
	GView() {
		GLogic gl = new GLogic(this);          //this는 현재 스레드가 관리하는 클래스이고 원본 나 자신
		//원본인지 확인하는 법? 전역변수로 확인 가능??
	}
	public static void main(String[] args) {
		//static 안에서는 this나 supper(부모클래스 수정자?) 사용 불가 -> 생성자에서는 가능하다
		GView gv = new GView();
		System.out.println(gv);
	}

}
