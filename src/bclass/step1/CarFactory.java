package bclass.step1;

public class CarFactory {
	public static int serialNum = 1000;
	public static Car getInstance() {
		Car myCar = null;
		if(myCar ==null) { //null일때만 인스턴스화 -> 싱글톤 패턴
			myCar = new Car();
		}
		return myCar;
	}
}
