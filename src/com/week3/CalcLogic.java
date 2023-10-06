package com.week3;

public class CalcLogic {

	CalcView2 calcView2 = null;   //초기화
	public CalcLogic(CalcView2 calcView2) {
		System.out.println("객체 주입(원본), 현재 메모리에 로딩중"+calcView2); //객체 주입 원본, 현재 메모리에 로딩중
		this.calcView2 = calcView2;
	}

	public static void main(String[] args) {
	}

}
