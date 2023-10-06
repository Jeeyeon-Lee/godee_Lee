package com.week3;

import javax.swing.JFrame;

public class JFrame1 {
	//선언부
	int width;
	int height;
	JFrame jf = null;            //선언과 생성 나눠서 써보기
	//생성자 -> 리턴타입x, 
	JFrame1(){
		System.out.println("디폴트 생성자");
		jf = new JFrame();
		System.out.println("지역변수 : "+width+", "+height+"/ 전역변수 : "+this.width+", "+this.height);
		jf.setTitle("입력|수정|삭제");
	}  //default 생성자
	
	JFrame1(int width){ //생성자의 파라미터값은 인스턴스화할 때 생성(선언만 아니라 생성도 포함)
		System.out.println("파라미터 한 개 있는 생성자");
		jf = new JFrame();
		System.out.println("지역변수 : "+width+", "+height+"/ 전역변수 : "+this.width+", "+this.height);
		this.width   = width;
		height = 500;
		String title = "토마토의 창";
		jf.setTitle(title);
	}

	JFrame1(int width, int height){ //생성자의 파라미터값은 인스턴스화할 때 생성(선언만 아니라 생성도 포함)
		System.out.println("파라미터 두 개 있는 생성자");
		jf = new JFrame("입력|수정|삭제");   //이대로 생성하면 타이틀 생김.
		System.out.println("지역변수 : "+width+", "+height+"/ 전역변수 : "+this.width+", "+this.height);
		this.width   = width;
		this.height = height;
	}
	
	//사용자정의 메소드
	public void initDisplay() {  //아래 주석처리처럼 전변의 값을 정해둘 수 있음. 
//		this.height = 800;
//		this.width  = 700;
		jf.setSize(width, height);  //전변이기 때문에 바로 접근 가능
		jf.setVisible(true);
	}
	//메소드
	public static void main(String[] args) {
		JFrame1 jf1 = new JFrame1(); 
		jf1.initDisplay();                    //가로 세로 기본값으로 창 생김
		jf1 = new JFrame1(500,400);  
		jf1.initDisplay();                    //JFrame 생성이 안되어있음 -> NullPointException ->  생성해서 에러 해결
		jf1 = new JFrame1(300);
		jf1.initDisplay();                    //세로값은 초기화해둠.
	}

}
