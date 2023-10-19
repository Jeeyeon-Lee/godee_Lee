package achat.step1;
//자바는 상속은 하나만 되기 떄문에 스레드도 상속을 받아야 할 상황이라면, implements로 runnable을 사용
//run의 메소드를 재정의하여 사용 가능 
//스레드를 인스턴스화 하여 사용하면 상속받아서 사용하는 것처럼 사용 가능
import javax.swing.JFrame;

public class Customer extends JFrame implements Runnable{
	public static void main(String[] args) {
		Customer ct = new Customer();
		ct.run();
		Thread th = new Thread(ct);
		th.start(); //run의 경우, 스타트 호출시 시스템이 적당한 시기에 대신 호출 함
	}
	@Override
	public void run() {
		//빵주세용
		System.out.println("run 호출");
	}
}
