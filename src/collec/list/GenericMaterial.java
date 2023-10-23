package collec.list;
//사용자정의 제네릭 구현하기
//클래스명<제네릭> 사용 가능
public class GenericMaterial<T> {
	/*선언부*/
	private T material;

	/*정의메소드*/
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
}
/*제네릭 자료형 매개변수 T<type parameter> : 이 클래스를 사용되는 시점에서
 * 실제 사용할 자료형이 결정된다. (컴파일 타임에 JVM이 바꿔치기를 해준다.
 * 단, Static 변수는 사용 불가능함.
 * GenericMaterial은 제네릭의 자료형이고, T라는 대체 문자를 사용함. */