package aquiz.step1;

public class Q27_1 {
	//throws 예외처리 미루기, 호출한 곳에서 예외처리하기(후처리)
	//언제?? 클래스에 대한 제어권이 개발자인 나에게 없음. 스프링과 같은 FW가 대신 주입해줌 
	static void m() throws Exception{ //호출 전엔 안터짐
		System.out.println(5/0);
	}
	public static void main(String[] args)  {
		System.out.println("main");
		try {
			Q27_1.m(); //static이 있으면 인스턴스화 생략 가능
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}	
}
