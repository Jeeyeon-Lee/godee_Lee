package bclass.step1;

public class CarFactory {
	static CarFactory car = new CarFactory();
	public static int serialNum = 1000;
	public CarFactory() {
	}
	public static CarFactory createCarFactory() {
		return car;
	}
	public static Car getInstance() {
		Car myCar = null;
		if(myCar ==null) { //null일때만 인스턴스화 -> 싱글톤 패턴
			myCar = new Car();
		}
		return myCar;
	}
}
