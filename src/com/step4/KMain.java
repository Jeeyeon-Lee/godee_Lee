package com.step4;
//주소번지, 같고 다름이 이해되어야 함.
class K{
	K(){
		System.out.println("파라미터 없는 K 생성자 ");         //주소x
	}
	K(KMain km){
		System.out.println("파라미터 있는 K 생성자 "+km);  //주소o
	}
}
public class KMain {

	public static void main(String[] args) {
		KMain km = new KMain();
		System.out.println("K 메인 1"+km);
		km = new KMain();
		System.out.println("K 메인 2"+km);
		km = new KMain();
		System.out.println("K 메인 3"+km);
		K k = new K(km);
		k = new K();
	}
}
