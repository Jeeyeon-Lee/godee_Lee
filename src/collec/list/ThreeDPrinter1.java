package collec.list;
//제네릭을 사용한다는 건 주소번지를 두 번 접근해야 값에 도달함. 
//데이터셋 역할을 하는 클래스 설계에 대한 이해 필요 -> Spring부트 -> DB연동 직접x, (DML사용 x) - DB연동은 됨.
//자동으로 해준다 - Hibernate -DB의 테이블관계를 클래스 설계로 처리하여 쿼리문 없이 DB연동 가능함.
//단점 : 추상적(쿼리문 안보임.)
public class ThreeDPrinter1 {
	/*선언부*/
	private Powder material;
	/*생성자*/

	/*정의메소드*/
	public Powder getMaterial() {
		return material;
	}
	public void setMaterial(Powder material) {
		this.material = material;
	}
	/*메인메소드*/
	public static void main(String[] args) {

	}

}
