package com.week1;

public class EmpSimulation2 {
	//main메소드에서 인스터스화 한 Emp의 주소번지(지역변수)를 setEmp 즉 다른 메소드에서 사용하려면
	//메소드의 파라미터 자리를 이용하세요
	void setEmp(Emp emp) {           //null; -> emp = new Emp();
		//insert here
		emp = new Emp();
		emp.empno = 7566;             //변수값 재정의
		emp.ename = "Smith"; 
		emp.job = "영업";
		System.out.println("============before============");
		System.out.println(emp.empno +", " + emp.ename +", " +emp.job);
	} //end of setEmp
	public static void main(String[] args) {
		EmpSimulation2 es2 = new EmpSimulation2();
		Emp emp = new Emp();        //사원집합 클래스를 인스턴스화
		es2.setEmp(emp);                 // 16번이 먼저실행 - > 10번줄이 먼저 호출 (값 : 0, null, null)
		System.out.println("============after============"); //메소드 실행 후 emp 자리에 들어있던 지역변수(값들)는 초기화 됨
		System.out.println(emp.empno +", " + emp.ename +", " +emp.job);
		}
}

//메인메소드에서 생성한 객체를 다른 메소드에서 사용하고 싶으면???
