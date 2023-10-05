package com.week1;
//세로방향 연습, 이럴 때 반복되서 작업되는 것을 반복문을 통해 줄이는 것 가능 
public class DeptSimulation {

	public static void main(String[] args) {
		Dept dept = new Dept(); // 선언
//		Dept dept = new Dept(); 이건 왜? 이건 같은변수를 또 선언하는거여서 에러
		dept = new Dept(); //재정의, 인스턴스화 할 때 마다 새로운 객체가 生
		dept.deptno = 10;
		dept.dname = "개발부";
		dept.loc = "서울";
		System.out.println(dept);
		System.out.println(dept.deptno + " ,"+ dept.dname + " ," +dept.loc);
		dept = new Dept(); //재정의
		dept.deptno = 20;
		dept.dname = "운영부";
		dept.loc = "대전";
		System.out.println(dept);
		System.out.println(dept.deptno + " ,"+ dept.dname + " ," +dept.loc);
		dept = new Dept(); //재정의
		dept.deptno = 30;
		dept.dname = "기획부";
		dept.loc = "제주";
		System.out.println(dept);
		System.out.println(dept.deptno + " ,"+ dept.dname + " ," +dept.loc);
	}
}
