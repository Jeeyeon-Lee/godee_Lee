package practice;

public class CalcLogic {
	/*선언부*/
	CalcUI cUI = null;
	public CalcLogic(CalcUI calcUI) {
		this.cUI = calcUI;
	}
	/*생성자*/
	/*정의메소드*/
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
	/*메인메소드*/
}
