package achat.step1;

import java.util.List;
import java.util.Vector;
class Customer3 extends Thread{
}
public class List2 {
	/*선언부*/
	List<Customer3> list = new Vector<>();
	/*정의메소드*/
	public void methodA() {
		Customer3 cs = new Customer3();
		list.add(cs);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		List2 l2 = new List2();
		l2.methodA();
	}
}
