package com.step5;

public class Array21 {

	public static void main(String[] args) {
		/*면이 존재하는 것처럼 코드 전개*/
		int is[][] = new int [2][3];       //3*3 테이블임. 가로는 0부터 시작!
		is =new int[][] {{1,2,3},{4,5,6}}; //선언, 생성(초기화) 동시에
//		is ={{1,2,3},{4,5,6}}; //문법 오류
		System.out.println(is.length);     //가로 row갯수
		System.out.println(is[0].length); //세로 colum갯수 - 컬럼명과 변수명 통일(for 연속성)
		for(int x=0;x<is.length;x++) {   //x는 로우값(0,1) -> 배열의 주소번지와 첫번째 주소번지의 값은 같음
			for(int y=0;y<is[x].length;y++) {
				System.out.println("is["+x+"]"+"is["+y+"] : "+is[x][y]);
			}
		}
	}
}
