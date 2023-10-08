package practice;

import java.util.Random;

public class RandomGame {
	int dap = -1; //찾아도 없는 값을 기본값으로 저장
	//게임시작 메소드
	public void newGame() {
		Random r = new Random();
		dap = r.nextInt(10); //10 사이의 값 채번
	}
	//응답판정 메소드(if문 필요)
	public String account(int user) {         //user가 입력하는 값으로 판정으로 hint 나오도록 -> 참조 int user
		System.out.println("dap : " + dap + ", user : " + user);
 		String hint = null;
 		for(int i = 0; i<5; i++) {	
	 		if(dap == user) {
	 			hint = "정답입니다.";
	 		}else if(dap < user) {
	 			hint = "낮춰라.";
	 		}else if(dap > user) {
	 			hint = "높여라.";
	 		}
 		}	
 		return hint;
	}
	//메시지 출력 메소드
	public void messagePring(int user) {
		System.out.println(account(user));
	}
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		rg.newGame();
		rg.messagePring(5);
	}
}
