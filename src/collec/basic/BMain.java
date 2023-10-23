package collec.basic;

import java.util.ArrayList;
import java.util.List;

//인스턴스화 -> 클래스 -> 추상, 인터페이스 -> 생성자 호출 -> 파라미터자리(변수)
class B{
	//왜 <int>는 못오나? 원시형타입은 제네릭에 오지 못 하니 int의 wrapper 클래스 integer가 옴 
	/*선언부 - 생성자가 호출할 때 생성됨 */
	List<Integer> nums = new ArrayList<>(); 
	int ival;
	String s = null;
	String s1 = new String();
	
	
	/*생성자 메소드 오버로딩 - 파라미터 타입이나 갯수가 다르다. */
	public B() {
	}
	public B(int ival) {
		s = new String("나초보");
	}
}
/*메인메소드*/
public class BMain {
	public static void main(String[] args) {
		System.out.println("main 호출"); //A클래스의 전변은 읽혀졌을까?  -> A클래스를 인스턴스화(선언)해야 사용 가능 
		B b = new B();
		try {
			System.out.println(b.s.length()); //null에러
		} catch (Exception e) {
			System.out.println("NullPointerException 발생, 디폴트 생성자에서 s값을 초기화해주지 않아서 값이 없음 ");
		}
		b = new B(1);
		System.out.println(b.s.length()); //3
	}

}
