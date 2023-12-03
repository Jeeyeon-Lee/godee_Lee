package bclass.step1;

public class Car {
	private int carNum;
	public Car() {
		CarFactory.serialNum++; //스태틱인 serialNum을 사용할 수 있음 . 이를 재정의 및 치환하여 사용 
		carNum = CarFactory.serialNum; //치환
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}