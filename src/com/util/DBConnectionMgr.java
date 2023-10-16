package com.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//오라클은 하나만 있음 충분, 싱글톤으로 객체주입처리! like Calender
public class DBConnectionMgr {
	//null로 초기화하는 이유는 null 체크를 해서 null일 때만 새로 인스턴스화 하고
	//null이 아니면 그냥 계속 사용하기로 함. (DB연동할 때 필수로 거쳐야하는 곳이니까 매번 복제본 만들지x)
	DBConnectionMgr dbMGR = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String _URL= "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
	public static final String _USER = "scott";
	public static final String _PW = "tiger";
	/*정의메소드*/
	//Calendar 클래스 처럼 메소드를 통해 객체 주입 받기
	public DBConnectionMgr getInstance() {
		if(dbMGR ==null) dbMGR = new DBConnectionMgr();
		return dbMGR;
	}
	//리턴타입으로 연결통로를 확보한 con을 얻는다
	//Connection(물리적으로 떨어져있는 것 사이 연결통로 확보, url 계정 정보 일치) 객체로 
	//앞에 객체가 주입되지 않으면 나머지 뒤에는 모두 null인 상태에 놓인다. 
	public Connection getConnection()
	{
		/*예외처리 시 사용되는 try catch
		 *멀티블록이 가능함. 단, 하위에서 상위클래스로 처리함 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(_URL,_USER,_PW);
		}catch (ClassNotFoundException e) { //클래스 못 찾을 때 
			System.out.println("ojdbc6.jar를 설정하지 않았다. 그래서 클래스를 못 찾는다.");
		}catch (Exception e) {                     //비번이 맞지 않을 때 
			e.printStackTrace();
		}
		return con;
	}
	public static void freeConnection(ResultSet rs, PreparedStatement pstmt, Connection con){
		try {
			if(rs !=null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*위 코드에서 22번과 24번 호출 시 문제가 없다면 catch문은 사용x */
	public static void freeConnection(PreparedStatement pstmt, Connection con){
		try {
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(ResultSet rs, CallableStatement cstmt, Connection con){
		try {
			if(rs !=null) rs.close();
			if(cstmt !=null) cstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void freeConnection(CallableStatement cstmt, Connection con){
		try {
			if(cstmt !=null) cstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
