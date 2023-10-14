package com.step5;

public class Array22 {

	public static void main(String[] args) {
		String datas[][] = {
				{"나신입","70","80","90"}      //과목에 따라 늘었다, 줄었다
				,{"나초보","80","80","90"}      //과목에 따라 늘었다, 줄었다
				,{"나일등","90","100","100"}      //과목에 따라 늘었다, 줄었다
		};
		for(int x=0;x<datas.length;x++) {              //배열명.length는 로우의 갯수임
 			for(int y=0;y<datas[x].length;y++) {       //배열명[로우].length는 컬럼의 갯수임
				System.out.println("datas["+x+"]"+"datas["+y+"]"+datas[x][y]);
			}
		}
	}

}
