package com.step4;

public class Oper3 {

	public static void main(String[] args) {
		int i=1;                               //i = 1
		int j=i++;                           //j = 1(후위 증감은 대입이 먼저), i =2
		System.out.println(i);
		System.out.println(i);
		if((i>++j)&(i++==j)) {          //2>2 & 2==2
			System.out.println("true");  //| 경우 
		}else{
			System.out.println("false");
		}                                        //i=3, j=2
		i+=j;                                  //i=5, j=2
		System.out.println(i+", "+j);
	}

}
