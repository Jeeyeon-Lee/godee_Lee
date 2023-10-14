package com.step5;

public class Array3 {

	public static void main(String[] args) {
		int is[] = new int[3];       //3개의 방
		for(int i=0;i<is.length;i++) {
			System.out.println(is[i]);
		}
		System.out.println("");
		System.out.println(is[0]); 
		System.out.println(is[1]); 
		System.out.println(is[2]); 
		System.out.println(is[3]); //4개의 방 조회 출력 -> 인덱스범위 초과 에러
	}

}
