package com.step21;

import java.util.Random;
import java.util.Scanner;

class E{
	//JAVM은 java.lang 폴더의 클래스만 알고 있음
	//그 외는 import 문을 추가해야 함.
	//인스턴스화를 할 때도 메소드와 동일하게 파라미터 갯수나 타입을 맞춰야 함.
	Scanner sc = new Scanner(System.in); //사용자가 입력한 값을 불러오는 파라미터 값으로 입력
	//get first 메소드 사용하여, 사용자로부터 숫자를 입력받는 메소드를 구현해보시오. 
	//here
//	public int random() {
//		Random r = new Random(); 
//		int dap = r.nextInt(10);
//		return dap;
//	}
	public int getFirst() {
		int num = 0;
		//전역변수의 자리에서 sc를 생성하였기에, getFirst메소드 안에서도 sc 변수를 사용할 수 있다. 
		num =  sc.nextInt();   
 		return num;             //전변 or 지변? (잠시만 기억하면 되는 수, 변해야하는 수 -> 지변으로 선언 필요)
	}
	public int getSecond() {
		int num = 10;
		num =  sc.nextInt();   //사용자가 결정하는 값
		return num;             //전변 or 지변? (잠시만 기억하면 되는 수, 변해야하는 수 -> 지변으로 선언 필요)
	}
	public int add(int first, int second) {
		return first + second;
	}
	public int minus(int first, int second) {
		return first - second;
	}
	public int multi(int first, int second) {
		return first * second;
	}
	public double divid(int first, int second) {
		return first / (double)second;
	}
}
public class Emain {
	//	Random r = new Random(); 
	//	int dap = r.nextInt(10); //0.0~10.0 0.0은 포함하고, 10.0은 포함하지 않는 그 사이의 정수값 채번됨
	public static void main(String[] args) {
		//insert here
		E e = new E();  //E클래스 인스턴스화
		System.out.println("첫 번째 숫자를 입력하세요");
		int first = e.getFirst();               //메소드 호출
		System.out.println("첫 번째 숫자는 " + first + " 입니다.");
		System.out.println("두 번째 숫자를 입력하세요");
		int second = e.getSecond();     //메소드 호출
		System.out.println("두 번째 숫자는 " + second + " 입니다.");
		System.out.println("두 수의 합은 " + e.add(first, second) + " 입니다.");
		System.out.println("두 수의 차는 " + e.minus(first, second) + " 입니다.");
		System.out.println("두 수의 곱은 " + e.multi(first, second) + " 입니다.");
		System.out.println("두 수의 나누기는 " + e.divid(first, second) + " 입니다.");
	}

}
/* 두 수의 합, 곱, 나누기 구하는 예제???
0~9 사이의 임의의 숫자를 채번하고
사용자로부터 숫자를 입력받아서       -> 숫자 지변으로 설정
입력받은 숫자가 더 작으면 힌트를 "높여라" 라고 출력하고
더 크면 "낮춰라" 라고 힌트를 주어서 
5번까지만 기회를 제공해서 그 숫자를 맞추는 게임을 작성해보시오

-> 스캐너, if문, for문 필요
*/