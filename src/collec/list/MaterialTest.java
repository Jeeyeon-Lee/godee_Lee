package collec.list;

public class MaterialTest {

	public static void main(String[] args) {
		Plastic p = new Plastic();
		//(오버라이딩 전)원래는 주소번지를 출력하던 toStirn()메소드
		//플라스틱 클래스에서 메소드 오버라이딩으로 재정의되어서 그곳에서 정해진 출력값이 나오는 메소드가 됨. 
		//UI 솔루션을 사용하여 자바 연동시 인터페이스 되는 부분을 toString()재정의하여 사용할 수 있음. 
		System.out.println(p);                   
		System.out.println(p.toString());             //정해진 값 "나는 플라스특입니다."로 출력
		MaterialTest mt = new MaterialTest();
		System.out.println(mt);                         //주소번지로 출력
	}
}
