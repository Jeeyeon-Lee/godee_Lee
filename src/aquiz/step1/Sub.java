package aquiz.step1;
//파라미터가 있는 생성자가 있는경우, 디폴트 생성자를 생성해주지 않음. 
//디폴트를 생성하는 것이 아니어도 에러가 발생함. 
//부모  생성자를 호출하지만 부모의 디폴트 생성자로 호출함 왜??이래야 전변을 스캔할 수 있음. 
class Super {
	public int i = 0;
	public Super() {
		System.out.println("super");
	}
	public Super(String text) {
		i = 1;
	}
}

public class Sub extends Super {
	public Sub(String text) {
		System.out.println("sub");
		i = 2;
	}
	public static void main(String args[]) {
		Sub sub = new Sub("Hello");
		System.out.println(sub.i);
		Super sub2 = new Sub("Hi");
		System.out.println(sub.i);
	}
}