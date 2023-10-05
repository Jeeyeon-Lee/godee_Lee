package com.step2;

public class DeptSimulation {
  //Dept 클래스를 설계하고 그 안에 부서집합에 필요한 변수 3개를 선언(부서번호, 이름, 지역)
  //단 접근제한자를 private으로 하여 직접 접근x
  //왜냐하면 외부에서 인스턴스 변수를 가지고 위변조를 막고 싶어서 -> 전변으로 만들어 캡슐화!! 

  public static void main(String[] args) {
    Dept dept = new Dept(); //0, 인스턴스화
    // dept.deptno = 10; //private에 써있기 때문 -> 해결 : 메소드(함수)
    dept.setDeptno(10); //정수만 올 수 있는 자리 -> 전역변수에 저장됨 //10
    int deptno = 30; //30
    dept.setDeptno(deptno);
    System.out.println(dept.getDeptno());
    // dept.dname = "개발부" //private이라서 직접 접근  x, set 메소드 사용
    dept.setDname("개발부");
    String dname = "운영팀";
    dept.setDname(dname);
    System.out.println(dept.getDname());
  }
}
