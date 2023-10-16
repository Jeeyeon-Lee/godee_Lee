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
	//왜 static? 이 부분을 싱글톤 패턴(공유, 하나이다, 복제본을 만들지 않겠다.)으로 흉내를 내기 위해서! 
	static DBConnectionMgr dbMGR = null;
	Connection con              = null;  // java.sql.Connection -> 특정 데이터베이스와의 연결
	PreparedStatement pstmt = null;  //java.sql.PreparedStatement -> 미리 컴파일된 SQL 문
	ResultSet rs                    = null;  //java.sql.ResultSet
	public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String _URL= "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
	public static final String _USER = "scott";
	public static final String _PW = "tiger";
	/*정의메소드*/
	//Calendar 클래스 처럼 메소드를 통해 객체 주입 받기
	//메소드를 통해 객체생성을 하므로 if문 사용해서 조건별 객체 생성이 가능해짐. 
	public static DBConnectionMgr getInstance() {
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
			//각 제조사의 드라이버 클래스를 로딩하기 = ojdbc6.jar 문자열로서 객체 주입 받아냄. - 둘을 연결하기 위해 인터페이스 필요
			//인터페이스는 제조사가 제공해야 한다. 노출 시 핵심기술 유출됨. 
			Class.forName("oracle.jdbc.driver.OracleDriver");  //java.lang.Class<T> -> java reflection API 공부, F/W만들 수 있음. (https://jeongkyun-it.tistory.com/225)
			con = DriverManager.getConnection(_URL,_USER,_PW); //.getConnection(String url, String user, String password)
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
