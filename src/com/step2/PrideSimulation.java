package com.step2;
class Pride{
	private int speed; //전변
	private String carColor; //전변
	private int wheelNum; //전변
	//getter 메소드는 전역변수에 담긴 값을 꺼낼 때 사용하자
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCarColor() {
		return carColor;
	}
	//setter 메소드는 전역변수가 private이라서 직접 접근 불가
	//메소드의 파라미터 자리를 활용하여 유저나 담당자가 결정된 값을 전변에 초기화해주는 코드(this가 붙은 코드 : 전변에서 넘겨받은 정보를 전역변수에 담는 카드)
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
public class PrideSimulation {
	
	public static void main(String[] args) {
		Pride myCar	=	new Pride(); //30
		myCar.setSpeed(30); //인스턴스변수.전역변수 = 값;
		Pride yourCar	=	new Pride(); //50
		yourCar.setSpeed(50);
		Pride himCar	=	new Pride(); //100
		himCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		System.out.println(yourCar.getSpeed());
		System.out.println(himCar.getSpeed()); //모든 객체들을 다 선언하긴 어려워서 반복문을 사용
	}

	}	
}