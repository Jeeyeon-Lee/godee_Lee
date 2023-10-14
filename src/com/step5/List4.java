package com.step5;

import java.util.ArrayList;
import java.util.List;

public class List4 {
	/*선언부*/
	//선언부 생성자 이름 다르게 -> 확장성, 유지보수 시 코드 수정 양 감소
	List<DeptDTO> li = new ArrayList<>(); // 앞은 클래스 뒤 구현체 클래스 -> 다형성
	/*메인메소드*/
	//스프링에서 JPA로 DB연동할 땐
	//List<Map<String.Object>>로 한다(특히 조인하는 업무 내용일 때 사용함)
	//조인(둘 이상의 테이블 연결해서 조회-업무가 복잡할수록)하는 업무 내용일 때 사용함. 
	//쿠키(only String)와 세션(자료구조 섞어씀)은 
	public static void main(String[] args) {
		List4 l4 = new List4();
		DeptDTO dept = new DeptDTO();
		dept.setDeptno(10);
		dept.setDname("영업부");
		dept.setLoc("부산");
		l4.li.add(dept);                 //주소번지 두번으로 접근 가능

		dept = new DeptDTO();
		dept.setDeptno(20);
		dept.setDname("개발부");
		dept.setLoc("대전");
		l4.li.add(dept);                 //주소번지 두번으로 접근 가능

		System.out.println(l4.li);
		DeptDTO rd = l4.li.get(0);
		System.out.println(rd.getDeptno()+", "+rd.getDname()+", "+rd.getLoc());
		rd = l4.li.get(1);
		System.out.println(rd.getDeptno()+", "+rd.getDname()+", "+rd.getLoc());
	}
}
