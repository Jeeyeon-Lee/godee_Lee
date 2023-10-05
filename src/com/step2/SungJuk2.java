package com.step2;

public class SungJuk2 {
	public int total(int no1, int no2, int no3) {
		//두번째에서는 총합을 구해서 담는 변수를 하나더 지변으로 선언했어요
		int tot = no1 +no2+no3;
		return tot;
	}
	public double avg(int tot) {
		int result = total(75, 85, 85);//240
		return result/3.0;
	}
	public static void main(String[] args) {
		SungJuk2 sj = new SungJuk2();
		int tot = sj.total(75, 85, 95);
		double account = sj.avg(tot);
		System.out.println(account);
	}
}
