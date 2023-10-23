package collec.list;

public class ThreeDPrinterTest {
	/*선언부*/
	/*생성자*/

	/*정의메소드*/

	/*메인메소드*/
	public static void main(String[] args) {
		Powder  p = new Powder();
		ThreeDPrinter3 tp3 = new ThreeDPrinter3(); //Object임 
		tp3.setMaterial(p);
		//타입을 잘못 맞추면 ClassCastingException 발생 가능 -> 멈춤)
		Powder p1 = (Powder)tp3.getMaterial(); //제네릭을 사용하지 않아서 문제가 됨? 

	}

}
