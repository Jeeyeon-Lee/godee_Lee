package aquiz.step1;

import java.util.Scanner;

//throw 예외를 강제로 일으킬 때 사용
//왜?? 
public class Q27_2 {
	static void m(int month){ //호출 전엔 안터짐
		try {
			
		} catch (Exception e) {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args)  {
		System.out.println("원하는 달을 입력하시오(0~11사이)");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		Q27_2.m(month);
	}	
}
