package com.step3;

import java.util.Random;
import java.util.Scanner;


public class RandomGame {
	//선언부
	//새로 채번된 숫자를 담는 정답을 담는 전역변수
	int dap = -1; //-1 end of file 찾아도 없다
	//사용자가 입력하는 숫자는 입력할때마다 바뀌어야하니까 지역변수로 설정
	//게임 메소드 선언
	//새 게임을 누를 때 마다 호출되는 메소드
	//여기서 채번되는 숫자가 정답이므로 노출하지 않는다. - 그래서 나는 전변으로 선언함.
	public void newGame() {
		Random r = new Random();
		//리턴타입이 없어도 전변이면 어떤 메소드에서도 재정의가 가능하다.
		dap = r.nextInt(10); //답이 결정됨, 종료가 될 때 까지 값이 유지되어야 한다.
	}
	//문자로 응답 판정을 내려주는 메소드 선언
	/***********************************************************************************************************************
	 * 판정을 내려주는 메소드 구현하기
	 * @param - user - 사용자가 숫자를 맞추기 위해서 입력하는 값을 담는 변수, 입력할 때 마다 바뀜(지변)
	 * @return - String - 힌트를 반환한다(예시 : 높여라, 낮춰라, 정답입니다. 축하합니다)
	 ***********************************************************************************************************************/
	public String account(int user) {  //user -> 매번 화면에 사용자가 입력하고 엔터를 친 값
//		System.out.println("dap : " + dap + "," + "user : " + user);   //출력해서 확인해보기
		String hint = null;
		if(dap == user) {
			hint = "정답입니다.";
		}else if(dap > user){
			hint = "높여라";
		}else if(dap < user) {
			hint = "낮춰라";
		}
		return hint;		
	}
	//메시지 출력
	//메소드 파라미터 자리에 리턴타입이 존재하는 메소드를 호출할 수 있다는 것을 보여주기 위해 추가한 메소드
	//우선 생략
//	public void messagePrint(int user) {                        //호출되면 5가 복사됨 -> call by value
//		System.out.println(account(user));                       //24 -> 5를 쥐고 간다 -> 높여라 출력
//	}
	
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();  //f6
//		rg.account(5);                                       //높여라가 출력은 이게 아니라
		rg.newGame();                                      //f5(메소드 안으로 들어감)  
		//이 메소드가 호출되어야 0~9 사이의 숫자가 채번된다.그래서 채번된 숫자는dap에 담김
		//아래 메소드 호출 시 파라미터 자리에 5를 넘겨주고, 37번에서 account() 호출될 때 user 값
		//즉 5가 파라미터로 넘어감. 
		//24번에서도 user값이 5가 된다. -> 원시형 타입이기 때문에 값이 호출됨.
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5 ; i++) {
			System.out.println("0부터 9사이의 숫자를 입력하세요.(입력 후 엔터치기)");
		    int user = sc.nextInt();  // 초기화 5번 반복됨(덮어쓰기 5회, 마지막 값만 유지됨)
		    String hint = rg.account(user);
		    if(hint.equals("정답입니다.")) {
		    	System.out.println("진행횟수 : " + (i+1) + " 축하합니다. 정답입니다.");
		    	break;		 //5회 이전에 정답을 맞추면 for문 탈출   
		    }
		    else if(hint.equals("높여라")) {
		    	System.out.println("진행횟수 : " + (i+1) + " 힌트 : 더 큰 숫자를 입력하세요.");
		    }
		    else if(hint.equals("낮춰라")) {
		    	System.out.println("진행횟수 : " + (i+1) + " 힌트 : 더 낮은 숫자를 입력하세요.");
		    }
		    //insert here (낮춰라, 높여라 케이스 추가)
		}
	}

}

/* 두 수의 합, 차이, 곱, 나누기 구하는 예제???
0~9 사이의 임의의 숫자를 채번하고
사용자로부터 숫자를 입력받아서       -> 숫자 지변으로 설정
입력받은 숫자가 더 작으면 힌트를 "높여라" 라고 출력하고
더 크면 "낮춰라" 라고 힌트를 주어서 
5번까지만 기회를 제공해서 그 숫자를 맞추는 게임을 작성해보시오

-> 스캐너, if문, for문 필요
새 게임을 선택했을 때 0~9 사이에 새로운 숫자 채번 필요
채번한 숫자는 dap이라는 변수에 저장
그리고 전역변수로 하기
그 게임을 하는 사람이 사용하는 동안에는 오직 하나의 객체만 사용하게 될 테니까
*/