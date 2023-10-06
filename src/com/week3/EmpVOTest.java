package com.week3;

public class EmpVOTest {
	public static void main(String[] args) {
		EmpVO eVOs[] = new EmpVO[3];
		EmpVO eVO = new EmpVO(7466,"가디",3000);
		System.out.println("사원번호 : "+eVO.getEmpno()+"/사원이름 : "+eVO.getEname()+"/급여 : "+eVO.getSalary()+"/주소번지 : "+eVO);
		eVOs[0] = eVO;
		eVO = new EmpVO(7599,"고디",4000);
		System.out.println("사원번호 : "+eVO.getEmpno()+"/사원이름 : "+eVO.getEname()+"/급여 : "+eVO.getSalary()+"/주소번지 : "+eVO);
		eVOs[1] = eVO;
		eVO = new EmpVO(7398,"구디",7000);
		System.out.println("사원번호 : "+eVO.getEmpno()+"/사원이름 : "+eVO.getEname()+"/급여 : "+eVO.getSalary()+"/주소번지 : "+eVO);
		eVOs[2] = eVO;
		for(int i=0;i<eVOs.length;i++) {
			System.out.println(eVOs[i]);
		}
	}
}