package com.week1;
//int 디폴트값이 0으로 약속된 것처럼 클래스의 디폴트값은 null로 되어있다.
public class EmpSimulation {
	public void empPrint(Emp emp) { //?자리는 지역변수 자리, 호출될 때 결정된다
		System.out.println("empPrint메소드로 나온 값은 ?? " + emp.empno +", " + emp.ename +", " +emp.job);
	}
	public static void main(String[] args) {
		Emp emp = new Emp();
		EmpSimulation  es=new EmpSimulation(); //0, null, null
		es.empPrint(emp); //파라미터 자리에 인스턴스 변수 참조
//		System.out.println(emp.empno +", " + emp.ename +", " +emp.job);  

		emp = new Emp();
		emp.empno = 7566;      //재정의, 초기화
		emp.ename = "나신입"; //재정의, 초기화
		emp.job = "마케팅";      //재정의, 초기화
		es.empPrint(emp); //파라미터 자리에 인스턴스 변수 참조
//		System.out.println(emp.empno +", " + emp.ename +", " +emp.job); 이 방법 대신 위 메소드 활용

		emp = new Emp();
		emp.empno = 7499;      //재정의, 초기화
		emp.ename = "나초보"; //재정의, 초기화
		emp.job = "매니저";      //재정의, 초기화
		es.empPrint(emp); //파라미터 자리에 인스턴스 변수 참조
//		System.out.println(emp.empno +", " + emp.ename +", " +emp.job); 이 방법 대신 위 메소드 활용
	}
}
