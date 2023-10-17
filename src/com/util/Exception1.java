package com.util;
//단위테스트
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.step5.DeptManager3;

//테스트 시나리오를 작성할 수 있따.
public class Exception1 {
	/*선언부*/
	DBConnectionMgr dbMGR = null; //인스턴스화 직접x
	//전변 자리에 추가한 인스턴스화는 어제 메모리에 상주?
	//new Exception1()했을 때 비로서 상주
	DBConnectionMgr dbMGR2 = new DBConnectionMgr();
	Connection con = null; //원본사용 후 반환해야 함. 
	PreparedStatement pstmt = null;//쿼리문 스캔 ResultSet / (select, insert, update, delete) ->excuteUpdate():int 로 업데이트됨
	ResultSet rs = null;
	/*생성자*/
	public Exception1() {
		dbMGR = DBConnectionMgr.getInstance();
		System.out.println("Exception1() "+dbMGR); //같은 주소인지 확인하기
		test(20);
	}
	/*정의메소드*/	
	public void test(int deptno) {
		System.out.println("test()"+dbMGR);
		System.out.println(con);
		//예외처리
		try {
			//아래에서 커넥션을 얻게 됨. 
			con = dbMGR.getConnection();    //메모리에 상주하게 됨(인터페이스가 메소드 호출을 통해 주소번지 갖게 됨), 상주하지 못 하면 NullPointerException이 발생함)
			System.out.println(con);
			
			pstmt = con.prepareStatement("SELECT deptno, dname, loc FROM dept");
			pstmt.setInt(1, deptno); 
			//커서 조작
			rs = pstmt.executeQuery();
			//커서가 맨 앞에 있나?
			System.out.println(rs.next());   //true
			System.out.println(rs.isFirst()); //true
//			System.out.println(rs.isLast());
		} catch (Exception e) {
			//디버깅할 때 꿀인 메소드 라인번호와 원인 낱말카드 출력해주는 메소드!
			e.printStackTrace();
		}
	}	
	/*메인메소드*/
	public static void main(String2[] args) {
//		Exception1 e = new Exception1();
		//접근제한자가 없는 생성자 -> 프랜들리 상태는 패키지가 다르면 접근x
		//public>protectd(패키지가 다르더라도 상속관계면 접근 가능함)
		DeptManager3 dm = new DeptManager3(); //다른패키지로 접근하려면 접근제한자를 public 추가해야함. 
		dm.getMapList();
	}

}
