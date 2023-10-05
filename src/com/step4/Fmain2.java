package com.step4;
class F2{
	//생성자
	F2(){}
	F2(int i){	}
//	F2(int j){	} //타입, 갯수 같음
	F2(boolean isOk){System.out.println(isOk);}
	F2(String s, int i){	}
	F2(int i, int j){System.out.println(i+","+j);}
}

public class Fmain2 {

	public static void main(String[] args) {
		F2 f = new F2(1,2);
		System.out.println(f);
		f = new F2(true);      //객체 배열, 자료구조, 웹 or 하이브리드, JSON
		System.out.println(f); //다른 주소번지를 갖는다.
	}
}
