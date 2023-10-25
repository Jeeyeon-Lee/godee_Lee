package bclass.step1;

import javax.swing.JButton;

class E{
	
}
public class EMain {

	public static void main(String[] args) {
		EMain em = new EMain();
		JButton jbtn = new JButton("조회");
		/* **************주소번지 출력o 경우*****************/
		System.out.println(em);            
		System.out.println(em.toString());
		/* **************주소번지 출력x 경우*****************/
		//JButton은 toString을 구성 요소와 해당 값의 문자열 표현을 반환하는것으로 재정의함 
		System.out.println(jbtn);
		System.out.println(jbtn.toString()); 
	}

}
