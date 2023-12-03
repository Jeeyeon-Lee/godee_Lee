package collec.list;

import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
			for(int i=0;i<10;i++) {
				String menu = "-1"; //end of file
				menu = sc.nextLine();
				System.out.println("전체조회 1번을 입력하고 상세조회이면 2번을 입력하세요.");
				if("1".equals(menu)) {
					continue;
				}else if("2".equals(menu)) {
					System.out.println("상세조회로 처리");
					continue;
				}
				System.out.println("여기");
			}
	}//여기서 변수j는 지변이어서 인스턴스화를 해도 접근x
}
