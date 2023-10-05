package com.step2;

public class SungJuk {
	/*******************************************************************************
	 * 총점을 구하는 메소드를 구현하기
	 * @param no1 - 첫번째 학생의 점수입니다.
	 * @param no2 - 두번째 학생의 점수입니다.
	 * @param no3 - 세번째 학생의 점수 입니다.
	 * @return - 세 점수의 총합을 구해서 반환합니다.
	 *******************************************************************************/
	//총점을 구하는 메소드를 선언해 보시오.
	public int total(int no1, int no2, int no3) {
		int x;//지변
		return no1+no2+no3;
	}
	//평균을 구하는 메소드를 구현하시오.
	//단 total메소드의 반환값으로 총점을 가져와서 처리해 볼 것.
	//왜냐면 그래야 전역변수, 지역변수, 정적변수에 대해서 뭔가 뚜렷해 질 수 있습니다.
	public double avg() {
		int result = total(75, 85, 85);//240
		System.out.println("avg메소드 호출 성공");
		return result/3.0;
	}
	//위 총점을 구 하는메소드의 리턴타입으로 총점을 받아서 
	//평균을 구하는 메소드를 선언해 보시오.
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		int tot = sj.total(75,80,85);
		System.out.println(tot);
		//insert here - 18번 avg메소드 호출해 볼까?
		double result = sj.avg();
		System.out.println(result);
	}

}
