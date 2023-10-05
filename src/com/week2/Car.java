package com.week2;
//모든 클래스는 Object클래스를 상속받고 있어서 부모가 가진 메소드를
//호출할 수 있고, 재정의(메소드 오버라이딩)할 수 있다.
//자바는 같은 이름의 메소들르 중복 정의 가능하다.
//메소드 오버로딩
//메소드 오버라이딩(단, 상속관계인지 따진다)
class Sonata{
	
}
public class Car extends Object {
	int speed = 0;
	String carColor = "검정색";
	int wheelNum = 4;
	//부모가 가진 메소드는 쉐도우 메소드이다. 
	//부모가 가진 메소드(그 중 toString)을 그대로 사용할 수도 있고, 
	//재정의하여 기능에 변화를 줄 수 있다.
	//이럴 경우, 부모가 정의한 메소드는 가려진다.
	@Override // annotation
	public String toString() {
		return "당신의 자동차는 현재"+speed +"속도로 달리고 있고, 바퀴수는 " +wheelNum+"이고 색상은 "+ carColor +"입니다.";
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		Sonata car2 = new Sonata();
		System.out.println(car2);
		System.out.println(myCar.toString());
		//Car 클래스에는 toString 메소드를 정의하지 않았지만, 
		//모두의 부모인 Object의 메소드를 상속받아 사용 가능

	}

}
