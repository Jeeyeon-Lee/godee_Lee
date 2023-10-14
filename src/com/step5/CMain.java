package com.step5;
class C{
	int i;
	//메소드로 객체를 주입받는 방법
	//다양한 방법을 알고 있는게 여러 상황에서의 해결능력을 높여줌. 
	C getInstance() { //Calendar cal = Calendar.getInstance();//싱글톤패턴
		return new C();
	}
}
public class CMain {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.i);                     /*0*/
		System.out.println(c.getInstance().i);   /*0*/
		c.i = 10; //재정의로 원본, 복사본 확인해보기
		//전변의 값을 초기화하여 출력한다.
		System.out.println(c.i);                    /*10*/
		//16번의 c와 getInstance로 받는 c는 서로 다른걸 가리킨다. 
		System.out.println(c.getInstance().i);  /*0*/
	}

}
