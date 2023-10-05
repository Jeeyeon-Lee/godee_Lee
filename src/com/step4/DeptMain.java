package com.step4;
class Dept{
	//전변은 초기화를 생략할 수 있다. 생성자가 대신 해준다.
	public Dept() {}
	private int deptno;     //부서번호
	private String dname; //부서명
	private String loc;      //지역
	public Dept(int deptno, String dname, String loc) {
		//지역변수와 전역변수의 동기화! (생성자의 파라미터값으로 재정의, 초기화)
		this.deptno  = deptno; 
		this.dname  = dname;
		this.loc       = loc;
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
}
public class DeptMain {

	public static void main(String[] args) {
		//인스턴스화를 해도 안된다. -> 캡슐레이션(캡슐화) 그 사물을 정의하는 중요한 고유명사 만들기 private
		Dept dept   = new Dept();                                //기본값
		Dept dept1 = new Dept(10, "개발1팀", "부산");    //10 새로운 객체 생성 
		System.out.println(dept.getDeptno());                 //0
		dept1.setDeptno(100);                                     //10->100 초기화 by 생성자의 인터셉트
		System.out.println(dept1.getDeptno());               //10
		dept1 = null;                                                 //캔디데이트 상태 -> 너는 앞으로 쓰레기 값이 됨 
						                                                   //- > dept1 = new dept1();  실행되면 앞의 38번에서 생성된 객체는 사라짐 
//		dept1.setDeptno(100);                                     //NullPointerException 발생
		dept1 = new Dept();
		dept1.setDeptno(100);                                     //10->100 초기화 by 생성자의 인터셉트
		dept1.setDname("운영1팀");
		dept1.setLoc("제주");
		System.out.println(dept1.getDeptno()+", "+dept1.getDname()+", "+dept1.getLoc());
		System.out.println(dept.getDeptno()+", "+dept.getDname()+", "+dept.getLoc());
	}
}
/*
Dept 클래스에 Getter Setter를 두는 것은 결국 전역변수를 사용하기 위함이다. 
web서비스 - 동기화 가능
150명 사용 -> 인스턴스를 갖는다 ->하나임 ->싱글톤
*/