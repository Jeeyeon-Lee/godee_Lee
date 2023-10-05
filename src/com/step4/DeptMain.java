package com.step4;
class Dept{
	//전변은 초기화를 생략할 수 있다. 생성자가 대신 해준다.
	private int deptno;     //부서번호
	private String dname; //부서명
	private String loc;      //지역
	public Dept() {}
	public Dept(int deptno, String dname, String loc) {
		//지역변수와 전역변수의 동기화! (생성자의 파라미터값으로 재정의, 초기화)
		this.deptno  = deptno; 
		this.dname  = dname;
		this.loc       = loc;
	}
}
public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
