package collec.map;
//VO의 경우, Spring에서는 Lombok이라는 라이브러리로 대체됨
//Spring으로 JPA로 DB연동을 하면 쿼리문 대신  클래스 설계가 필요함. 
//접근제한자를 private으로 하는 이유는 웹서비스 시 싱글톤으로 처리하기 위함
//인스턴스변수 직접 접근이 아닌 사용자마다 인스턴스화를 통해 지역적으로 사용하고 소멸시킴(로그아웃)
public class DeptVO {                    //VO : 이종 간 연결을 위해 필요한 클래스(데이터 전달)
	private int deptno = 0;              //int -> (Oracle) number(5)
	private String dname = null;        //String -> (Oracle) varchar2(4000)-가변형타입 <-> char-고정형타입
	private String loc = null;
	
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
