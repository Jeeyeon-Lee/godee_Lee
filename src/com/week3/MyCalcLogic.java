package com.week3;
//프로세스를 담당하는 클래스는 상속이나 인터페이스를 피해야함.
//MVC의 모델계층은 재사용성, 이식성을 위해 순수하게 남겨둔다.
//어떤 추상클래스나 인터페이스도 구현하지 않는 순수하게 사용자정의 메소드나 변수로만 구현한다.
public class MyCalcLogic {
	/*////////////////////////////////////////////////////////////////////////////////////////////////////
	 * 사칙연산을 구현하기
	 * v1 - 연산자가 눌리기 전까지 입력된 숫자 묶음
	 * v2 - =이 눌렸을 때 그 전까지 입력된 숫자 묶음
	 * op - 연산자(+,-,*,/)
	 * return = JTextField에 계산된 결과를 출력해야 한다. String이다. jft_display.setText("3");
	 ///////////////////////////////////////////////////////////////////////////////////////////////////*/
	public String calcurate(String v1, String v2, String op) { //숫자 2개, 연산식 1개
		double d1 = Double.parseDouble(v1);
		double d2 = Double.parseDouble(v2);
		if("+".equals(op)) {
			return String.valueOf(d1 + d2);    //방법 1 - double이기 때문에 String으로 변경 필요
//			return ""+(d1 + d2);                   //방법 2 - double이기 때문에 String으로 변경 필요
 		}
		else if("-".equals(op)) {
			return String.valueOf(d1 - d2);   
		}
		else if("*".equals(op)) {
			return String.valueOf(d1 * d2);  
		}
		else if("/".equals(op)) {
			return String.valueOf(d1 / d2);    
		}
		else {
			return "error";
		}
	}
}
