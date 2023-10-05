package Practice;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		System.out.println("메뉴를 입력하세요. [새 게임 : 1, 정답확인 : 2, 종료 : 3]");
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
			menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("새 게임을 시작합니다.");
			}else if(menu == 2) {
				System.out.println("정답을 확인하겠습니다.");
			}else if(menu == 3) {
				System.out.println("종료하겠습니다");
			}
		}System.out.println("for문 종료");   // 3번 한 뒤 종료
	}
}
