package com.week3;

public class EmpVO {  //Value Object
	//선언부
	private int empno;     //사원번호
	private String ename; //사원이름
	private double salary; //급여
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//생성자 - > 초기화 가능
	public EmpVO() {	}
	public EmpVO(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public static void main(String[] args) {

	}

}
