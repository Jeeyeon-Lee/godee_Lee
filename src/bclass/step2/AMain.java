package bclass.step2;
class A{}
//싱글톤패턴 - static(빈도 높지 않음) -> 인스턴스화 필요 없음 
public class AMain {
	
	public static void main(String[] args) {
		A as[] = new A[3]; //as[0], as[1], as[2] null 상태
		A a = new A();
		for(A a1: as) {
			System.out.println(a1);
		}
		as[0] = a; //null -> @abcd1234 참조형 치환하기
		for(A a1: as) {
			System.out.println(a1);
		}
	}

}
