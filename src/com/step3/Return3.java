package com.step3;

public class Return3 {
	String m(int i) {   //조건의 기준이 되는 임의의 i 변수를 받음
		String hint = null;
		//조건에 따라 return을 사용하게 되므로, 못 만날 수도 있다.
		//그래서 else문을 추가해서 디폴트 값이라도 넣어야 한다. (웹 응답페이지 등에서 사용)
		if(i<0) {    //너 음수니?
			hint = "너 음수야.";
			return hint;
		}else if(i>0) { //너 양수니?
			hint = "너 양수야.";
			return hint;
		}else {                         
			return "";
		}
	}
	public static void main(String[] args) {
		Return3 r3 = new Return3();
		String hint = r3.m(10);
		System.out.println(hint);
	}
}
