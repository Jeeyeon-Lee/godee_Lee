package com.step21;

import javax.swing.JFrame;

//이름은 같지만 서로 다른 메소드 -> 오버로딩 실습(같은 이름의 메소드는 타입을 다르게 하거나 갯수를 다르게 하면 됨)
public class Frame1 {
	JFrame jf = new JFrame();
	void initDisplay() {       						                      //상수를 넣는 것 -> 별로 -> 파라미터 자리 이용 필요
		jf.setSize(300, 400);                                                  
		jf.setVisible(true);
	}
	//메소드의 파라미터 자리는 호출될 때 결정된다. -> Call by value
	void initDisplay(int width, int height) {  						//일부는 변수로 처리, 나머지(boolean) 하나는 상수로 처리
		jf.setSize(width, height);                                                  
		jf.setVisible(true);
	}	
	void initDisplay(int width, int height, boolean isView) {  //전체를 변수로 처리 가능
		jf.setSize(width, height);                                                  
		jf.setVisible(isView);
	}
	public static void main(String[] args) {
		Frame1 f = new Frame1();
		f.initDisplay(500, 400); //상수를 사용해서 별로
		//상수를 사용했기 때문에 앱이라면 음악을 듣는 중 전화가 들어오는 상황을 상상(365일 true)
		//기능 구현이 어렵다. 적재적소에 메소드 호출이 필수(제어권)
		f = new Frame1();
		f.initDisplay(400, 300, false);  //-> call by value 메소드가 호출될 때 지역변수가 초기화가 된다. 
	}

}
