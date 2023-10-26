package bclass.step2;

class C{
	CMain cm = null;
	public C(CMain cMain) {//setter의 꼴처럼 재정의 통해 원본을 유지함. 
		System.out.println(cm); //null
		this.cm = cMain;         //null -> CMain으로 치환
		System.out.println(cm); //@372f7a8d / @2f92e0f4
		System.out.println(cm == cMain); //true
	}
	
}
public class CMain {
	C c = new C(this);
	public static void main(String[] args) {
		CMain cm = new CMain();
		System.out.println("before "+cm);//@372f7a8d
		cm = new CMain();
		System.out.println("after "+cm);//@2f92e0f4
	}

}
