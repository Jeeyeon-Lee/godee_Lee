package bclass.step1;
class H{
	int i;
	private static H h = new H(); //이른 인스턴스화?!
	private H() {
		System.out.println("H()");
	}
	static H getInstance() {
		return h;
	}
}
public class HMain {

	public static void main(String[] args) {
		H h = H.getInstance();    //static 있을 때는 인스턴스화 없이 사용 가능
		H h2 = H.getInstance();
		System.out.println(h+", "+h2); //주소번지 같음. 
	}

}
