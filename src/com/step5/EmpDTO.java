package com.step5;

public class EmpDTO {  //Emp데이터서버 관련 접미어
	/*선언부*/
	private int empno;
	private String ename;
	private String job;
	private int deptno; 
	//위 변수의 경우, DeptDTO와 연결되어야 하는데 여기서 새로 선언하면 '반정규화, 역정규화'라고 함. but, 가져와서 사용!
	//private DeptDTO deptDTO; //How? 타입에 클래스를 넣어서 연결하여 사용! 그런데 여기서 부모는 DeptDTO이기 때문에 거기서 작업!! 
	/*생성자*/
	/*정의메소드*/
	/*메인메소드*/
	public static void main(String[] args) {

	}

}
