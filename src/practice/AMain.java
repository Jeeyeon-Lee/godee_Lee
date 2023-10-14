package practice;
class A1{
	int i;
	public A1(AMain a) {
		System.out.println(a);
	}
	public void methodA1() {
		System.out.println("methodA1 호출");
	}
}
class A2{
	public A2() {
	}
	public A2(AMain a) {
		System.out.println(a);
	}
	public void methodA() {
		System.out.println("methodA 호출");
	}
}
public class AMain {
	int j = 10;
	A1 a1 = new A1(this);
	A2 a2 = new A2(this);
	public AMain() {
		a1.methodA1();
		a2.methodA();
	}
	public static void main(String[] args) {
		AMain a = new AMain();
		System.out.println(a);

	}

}
