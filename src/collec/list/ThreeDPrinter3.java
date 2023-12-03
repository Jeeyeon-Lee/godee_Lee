package collec.list;
//가장 포괄적인 대신, 직관적이지 않음. 타입을 맞춰야 함.  ClassCastingException(런타임오류) 발동 가능
//서버 다운되기도 한다?.  
//포괄적인 타입은 위험하다!! 
public class ThreeDPrinter3 {
	/*선언부*/
	private Object material; //타입이 너무 포괄적 -> 직관적x -> 유지보수 어려움 
	/*생성자*/

	/*정의메소드*/
	public Object getMaterial() {
		return material;
	}
	public void setMaterial(Object material) {
		this.material = material;
	}
	/*메인메소드*/
	public static void main(String[] args) {
	}
}
