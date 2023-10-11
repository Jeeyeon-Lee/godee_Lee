package com.step5;
class DeptVO{
	/*선언부*/  
	//private 이 안에서만 접근할 수 있음. 
	//데이터 처리하기 - 클래스 설계(VO패턴, DTO 패턴) 
	private int deptno;
	private String dname;
	private String loc;
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
	/*생성자*/
	public DeptVO() {
	}
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	/*정의메소드*/
}
public class DeptTest {
	/*선언부*/
	/*생성자*/
	/*정의메소드*/
	/*메인메소드*/
	public static void main(String[] args) {
		//참조형 1차배열
		/*다른 주소로 값들이 생성되는 형태임*/
		DeptVO dVOs[] = new DeptVO[3];
		System.out.println(dVOs[0]+", "+dVOs[1]+", "+dVOs[2]); //null, null, null
		System.out.println("");
		DeptVO dVO1 = new DeptVO(10, "영어부", "대전");
		dVOs[0]=dVO1;
		System.out.println(dVOs[0]);
		DeptVO dVO2 = new DeptVO(20, "개발부", "서울");
		dVOs[1]=dVO2;
		System.out.println(dVOs[1]);
		DeptVO dVO3 = new DeptVO(30, "마케팅부", "대구");
		dVOs[2]=dVO3;
		System.out.println(dVOs[2]);
		System.out.println("");
		for(int i=0;i<dVOs.length;i++) {
			//파라미터값이 있는 생성자를 호출하였음.
			System.out.println((i+1)+"회 : "+dVOs[i].getDeptno()+", "+dVOs[i].getDname()+", "+dVOs[i].getLoc()+"/ 주소 : "+dVOs);
		}
		System.out.println("");
		/*같은 주소로 값들이 생성되는 형태임*/
		for(int i=0;i<dVOs.length;i++) {
			//디폴트 생성자를 호출하였음. 
			dVOs[i] = new DeptVO();
			System.out.println((i+1)+"회 : "+dVOs[i].getDeptno()+", "+dVOs[i].getDname()+", "+dVOs[i].getLoc()+"/ 주소 : "+dVOs);
		}
		System.out.println("");
		for(int i=0;i<dVOs.length;i++) {
			//파라미터값이 있는 생성자를 호출하였음.
			dVOs[i] = new DeptVO(10,"영업부","대전");
			System.out.println((i+1)+"회 : "+dVOs[i].getDeptno()+", "+dVOs[i].getDname()+", "+dVOs[i].getLoc()+"/ 주소 : "+dVOs);
		}
	}
}