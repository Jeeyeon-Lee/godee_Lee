package collec.basic;

import java.util.ArrayList;
import java.util.List;

//인스턴스화 -> 클래스 -> 추상, 인터페이스 -> 생성자 호출 -> 파라미터자리(변수)
class A{
	//왜 <int>는 못오나? 원시형타입은 제네릭에 오지 못 하니 int의 wrapper 클래스 integer가 옴 
	/*선언부 - 생성자가 호출할 때 생성됨 */
	List<Integer> nums = new ArrayList<>(); 
	int ival;
	String s = null;
	String s1 = new String();
	
	
	/*생성자 메소드 오버로딩 - 파라미터 타입이나 갯수가 다르다. */
	public A() {
		s = new String("나신입");
	}
	public A(int ival) {
		s = new String("나초보");
	}
	public A(String name) {
		s = new String(name);
	}
	
	/*정의메소드*/
}
/*메인메소드*/
public class AMain {
	public static void main(String[] args) {
		System.out.println("main 호출"); //A클래스의 전변은 읽혀졌을까?  -> A클래스를 인스턴스화(선언)해야 사용 가능 
		A a = new A();
		System.out.println(a.s);             //나신입
		a = new A(1);
		System.out.println(a.s);           //나초보
		String s = null;
		System.out.println(s);               //null
		s="나초보";
		System.out.println(s);               //나초보
		a = new A("나신입");
		System.out.println(a.s);           //나초보
//		System.out.println(s.length());   //null에러(Cannot invoke -> 메소드를 호출할 수 없는 상황 - 오타, 인자 불일치 등)
		//생성자의 파라미터 자리(메소드 오버로딩)를 활용하여 문제를 해결해보기
		
	}

}
