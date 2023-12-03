package collec.list;

public abstract class Car {
	int speed;
	String carName;
	String carColor;
	public Car() {}
	public abstract void display(); //추상메소드
	public void go() {
		speed = speed +1;
		System.out.println("Car의 go 메소드");
	}
	public void stop() {
		System.out.println("Car의 stop 메소드");
		speed = speed -1;
	}
}
