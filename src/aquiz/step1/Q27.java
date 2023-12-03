package aquiz.step1;

public class Q27 {

	public static void parse(String str) {
		float f=0.0f; //지변은 초기화 생략 안됨.
		int y = 2;
//		float f; //선언만 하면 아래 예외처리에서 f를 사용 못 함(지변은 초기화 생략 안됨) 
		//try-catch 멀티로 작성가능하다. 
		//단, 더 넓은 타입이 위에 오면 더 좁은 타입의 Exception은 컴파일 에러이다. 
		try {
			f = Float.parseFloat(str); //String을 float 숫자로 뱉어냄("5" 와 같은 것이어야 함)
			int x = y/0;
		} catch (NumberFormatException nfe) {
			f = 0; // 에러 : 데이터형이 선언되지 않았다. F변수는 try절 안에서만 선언되어 있다.
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException | "+ae.toString());
		} catch (Exception e) {
//			e.getStackTrace();
			System.out.println("Exception | "+e.toString());
		} finally { //예외가 있든 없든 ?? 무조건 실행
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		Q27.parse("5");
		Q27.parse("invalid");
		Q27.parse("55555555555555555");
		Q27.parse("0");
	}
}
/*
 * What is the result? 
 * A. 0.0 
 * B. Compilation fails. 
 * C. A ParseException is thrown by the parse method at runtime. 
 * D. A NumberFormatException is thrown by the parse method at runtime.
 */
