package collec.list;
//List<Object> -> List<Element> -> List<T> type parameter(개발자 자유도 높이기 위해 제네릭 값 변천)
public class ThreeDPrinter2 {
	/*선언부*/
//	private Powder material;
//	private Object material; //타입이 너무 포괄적 -> 직관적x -> 유지보수 어려움 
	//코드 수정양이 많아지면 오타, 사이드이펙트(부작용) 가능성 증가,  
	private Plastic material; 
	/*생성자*/

	/*정의메소드*/
	public Plastic getMaterial() {
		return material;
	}
	public void setMaterial(Plastic material) {
		this.material = material;
	}
	/*메인메소드*/
	public static void main(String[] args) {

	}

}
