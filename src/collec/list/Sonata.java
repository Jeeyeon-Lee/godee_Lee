package collec.list;

public class Sonata extends Car {

	@Override
	public void display() {
		// TODO Auto-generated method stub
	}
	public void other() {
		System.out.println("Sonata other 메소드 호출");
	}
	public void stop() {
		System.out.println("Sonata의 stop 메소드 호출");
		speed = speed -2;
	}
	public static void main(String[] args) {
		Car myCar = new Sonata();
		//부모클래스(Car)로 자식클래스(Sonata) 변수,메소드를 사용할 수 있나?? Nope
		//메소드 오버라이딩 된 두 클래스 모두에 있는 메소드 사용가능 -> 부모|자식 중 누구의 메소드로 실행? 자식(부모거는 쉐도우 메소드로)
//		myCar.other();  //사용 x
		myCar.stop();
		
		Sonata himCar = new Sonata();
		//누가 더 많은 변수, 메소드를 누릴까?? Sonata클래스임..
		himCar.other(); //사용 o
		himCar.stop();
	}
}
