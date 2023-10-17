package com.util;
//String 원본바뀌지 않음
//같은 이름의 두 개의 객체를 생성해서 처리함 - 문제제기
public class String2 {

	public static void main(java.lang.String[] args) {
		String sql = "SELECT deptno,";
		System.out.println(sql);
		sql += "dname, loc FROM dept";
		sql += "Where deptno=30";
		System.out.println(sql);
		String s = "Hello";
		System.out.println(s.replace("e", "o")); //e를 o로 바꾸는 것 성공, but 원본 바뀌지 않음. 
		System.out.println(s);                   //다시 hello로 출력 
		s = s.replace('e', 'o');
		System.out.println(s);                   //다시 hello로 출력 
		//바꾸고 싶으면 치환을 하면 되지만, 계속해서 새로 생성이 됨. 
	}

}
