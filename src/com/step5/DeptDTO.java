package com.step5;

public class DeptDTO {
	/*선언부*/
	private int deptno;
	private String dname;
	private String loc;
	/*생성자*/
	public DeptDTO() {}
	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	private EmpDTO empDTO;  //이렇게 입력해서 EmpDTO와 연결
	/*정의메소드*/
	public EmpDTO getEmpDTO() {
		return empDTO;
	}
	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	/*메인메소드*/
	public static void main(String[] args) {
	}
}