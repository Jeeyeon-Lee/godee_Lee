package com.week1;
class Dept1{ //이 클래스의 구성에대한 설명 & 한 번에 관계있는 이 내용을 참조형으로 불러오기 & 다른 클래스 생성시 틀로 사용
	int deptno = 10;
	String dname="개발부";
	String loc="부산";
}
class Dept{ //이 클래스의 설명이라고 생각 & 다른 생성을 할 때는 틀이라고 생각
	int deptno = 10;
	String dname="개발부";
	String loc="부산";
}
public class WReturn4 {
//	int getDeptno() {   // 이렇게 하면 부서번호만 돌려받을 수 있음. 서로 관계가 있는 3~5번을 한번에 불러오려면???, 참조형타입으로
//		int deptno = 10;
//		return deptno;
//	}
//	void getDept(int deptno, String dname, String loc) {
//		
//	}
//	void getDept(Dept dept) {
//		
//	}
//	void getDept(int deptno, String dname, String loc) {
//		return getDept(null);
//	}
//	public static void main(String[] args) {
//		
//	}

}
