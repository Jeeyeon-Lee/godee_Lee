package com.step5;

import java.util.ArrayList;

public class EmpManager {
	/*선언부*/
	ArrayList<EmpDTO> empList = new ArrayList<>(); //array에 emp추가해야함.
	/*생성자*/   //
	/*정의메소드*/
	void getEmpList() {   //EmpList에 저장된 배열 불러오는 메소드 / DTO의 생성자를 이용하여 유의미하게 정보를 가져와보기
		System.out.println(empList.size()); //0 
		EmpDTO emp = new EmpDTO(7566,"나신입", "개발",7500,"2023-10-10",3500,500,10); //너무 빡센..작업.. 몇만명일 경우 .. 따라서 DB 언어 사용
		empList.add(0,emp);
		System.out.println(empList.size()); //1
		emp = new EmpDTO();  //변수명은 갖지만 주소번지 다름
		empList.add(1,emp);
		System.out.println(empList.size()); //2
		for(int i=0;i<empList.size();i++) {
			EmpDTO remp = empList.get(i);
			System.out.println(remp.getEmpno()+", "+remp.getEname()+", "+remp.getHiredate());
		}
	}
	/*메인메소드*/
	public static void main(String[] args) {
		EmpManager em = new EmpManager();       //자기 자신을 인스턴스화해야 전변의 인식이 가능함. 
		em.getEmpList();
	}

}
