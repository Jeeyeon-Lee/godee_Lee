package com.step2;
//클래스 안에 여러가지의 변수를 담을 수 있다. 
public class Dept {  //private을 실행할 수 있는 방법 실습
  private int deptno = 0;//부서번호, 전변
  private String dname = null;//부서명 
  private String loc = null;//근무지역 

  //wirte, save
  public void setDeptno(int deptno){
    this.deptno = deptno; //this -> 이 클래스일 때 사용, 전역변수에 파라미터에 들어간 숫자가 담아질 수 있음.
  }
  public void setDname(String dname){
    this.dname = dname; //this -> 이 클래스일 때 사용, 전역변수에 파라미터에 들어간 숫자가 담아질 수 있음.
  }  
  public void setLoc(String loc){
    this.loc = loc; //this -> 이 클래스일 때 사용, 전역변수에 파라미터에 들어간 숫자가 담아질 수 있음.
  } 
  
  //read
  public int getDeptno(){
    return deptno;//전역변수
  }
  public String getDname(){
    return dname;//전역변수
  }
  public String getLoc(){
  return loc;//전역변수
  }
}
