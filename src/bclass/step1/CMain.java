package bclass.step1;
class C1{
	int i;
}
class C2{
}
public class CMain{
	C1 c1 = null; //선언만 하기 -> 타입이 결정된것도 아님. 
	public static void main(String[] args) {
		CMain cm = new CMain();
		System.out.println("main");
		System.out.println(cm.c1);                   //null <- C1은 선언만 하고 생성되진 않았기 때문 
		System.out.println(cm.c1 instanceof C1); //false 왜??? c1은 null로 아직 타입이 없음 
//		System.out.println(cm.c1.i); //null에러 <-c1 때문임 
		cm.c1 = new C1();                            //선언없이 생성하기 -> C1 타입 결정됨  
		System.out.println(cm.c1);                   //주소번지 생김  
		System.out.println(cm.c1 instanceof C1); //true 타입이 C1 타입임(인스턴스화를 통해 생김)  
		System.out.println(cm.c1.i);                 //0 출력(전변 활용가능)
		System.out.println(cm.c1.i+3);              //3
	}
}
