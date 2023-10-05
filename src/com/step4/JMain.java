package com.step4;
class J{
	//선언부
	int a;
	JMain jm = new JMain(this); //왜 에러? 파라미터를 갖는 생성자는 JVM이 추측 불가능 -> JMain에 생성자 생성(파라미터값 있는)
	//생성자
	J(){}  //디폴트 생성자는 파라미터가 없어서 생략해도 JVM이 제공해줌.
}
public class JMain {
	int b;            //b 전변은 이해됨.
	J j = null;
	//생성자 -> 두 번 호출하나, 파라미터 갯수나 타입이 달라서 다른 생성자로 인식함.
	JMain(){}; 
	JMain(J j){      //생성자도 파라미터자리를 가질 수 있고, 참조형을 넘길 수 있음.
		this.j = j;    //여기서 j도 전변임. 인스턴스변수.변수의 형태
		b = 10;      //또 생성자에서 전변 재정의 가능
	}
	void methodA() {
		//파라미터로 넘어온 j원본을 쓰고 싶다면???
		//원본은 무엇을 의미하나? J가 heap 영역에 활성화 되었을 때 그 주소번지
		System.out.println(j);
	}
	public static void main(String[] args) {
		J j = new J();
		JMain jm = new JMain(j);  //파라미터값 있는 생성자 호출, 재정의
		System.out.println(jm.b);    //10 전변은 인스턴스변수.변수
		jm.methodA();                 //주소번지 有
		
		jm = new JMain();            //디폴트 생성자 호출, 재정의x
		System.out.println(jm.b);   //0
		jm.methodA();                 //주소번지 無
		
	}

}
