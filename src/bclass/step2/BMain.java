package bclass.step2;
//싱글톤 객체주입(메소드 리턴타입으로 객체를 주입받는 경우
//전변도 static으로 해야하나?? 
import bclass.step1.CarFactory;

class B{
	int i=1;
	//이른 인스턴스화
	static B b = new B(); //외부에서 호출x, 내부에서 호출 가능(전변의 자리-인스턴스화하여 접근 가능)
	private B() {} //생성자 묶기
	//인스턴스 변수 사용할수 없으니 묶인 객체의 생성을 위해
	//메소드 선언시 static을 붙인다. 
	//전변의 이른 인스턴스화 앞에도 static을 붙여서 b를 리턴할 수 있게 됨.
	public static B createB() {
		return b;
	}
}

public class BMain {
	int i = 1; //전변 i 스캔시점은 BMain이 생성되었을 때
	public static void main(String[] args) {
		B bs[] = new B[3];
		B b = B.createB();
		System.out.println(b.i++);
		bs[0] = b;
		b= B.createB();
		System.out.println(b.i++);
		bs[1] = b;
		b= B.createB();
		System.out.println(b.i++);
		bs[2] = b;
		b= B.createB();
		System.out.println(b.i++);
		for(B b1:bs) {
			System.out.println(b1);
		}
	}

}
