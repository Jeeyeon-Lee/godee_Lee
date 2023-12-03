package achat.step1;

public class A {
	/*선언부*/
	int i = 1;
	/*생성자*/

	/*정의메소드*/
	void methodA() {
		//여기의 this는 이 클래스와 주소번지가 같음.
		System.out.println(this);
		System.out.println(this.i); //이 클래스의 전변 i 출력 but, 14번에서 생성이 되었을 때, 
	}
	/*메인메소드*/
	public static void main(String[] args) {
		A a = new A(); //원본 자체를 쓰겠다고 선언한거
		System.out.println(a);
		System.out.println(a.i);
		a.i = 2;
		System.out.println(a.i);
		a.methodA();
		System.out.println("main");
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1);
	}
}