package com.step3;

import java.util.Random;
import java.util.Scanner;

//3자리 숫자를 맞추는 게임 구현하기 - 도전
//야구 숫자 게임
//정답 257일 때
//dap 이라는 변수 3개?? 배열??
//숫자, 자리 모두 일치일 때 strike 
//strike -> 전변으로 할까 지변으로 할까?
//ball 이라는 변수 필요
//1, 329 (0스1볼)
//2. 529 (0스2볼)
//3. 259 (2스0볼)
//변수의 갯수 결정할 수 있다|없다   -> dap, strike, ball
//변수의 타입 결정할 수 있다|없다   -> 전변, 지변, 지변 ?? (int)
//화면제공받았을 때 코드의 재사용성 누릴 수 있도록 메소드 설계가 되었는가?
//메소드 - 게임시작&답랜덤설정/답계산/결과값출력
//파라미터타입, 리턴타입도 결정하고 활용할 수 있다|없다

public class Practice3 {
	public void newGame() {
		System.out.println("게임을 시작하겠습니다.");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int dap1 = r.nextInt(10);
		int dap2 = r.nextInt(10);
		int dap3 = r.nextInt(10);
		int[] com = {dap1, dap2, dap3};
	}
	public int rule() {
		int strike = 0;
		int ball = 0;
		return strike + ball;
	}
	
	public String account() {
		String hint = "";
		return hint;
	}
	public void messagePring() {
		
	}
		
	public static void main(String[] args) {
		Practice3 p = new Practice3();
		p.newGame();
	}

}
