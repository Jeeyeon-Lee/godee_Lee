package bclass.step1;

public class A {
	int i;            //전변, 메소드 선언하기 - 클래스 설계의 일부
	public A() {
		System.out.println("A() 호출");
		i=10;
	}
	public A(int i) {
		this(); // 디폴트 생성자 호출 가능!
	}
	public A(int i, int j) {
		this.i = 50;
	}
	public void methodA() {
		
	}
	//메소드 오버로딩(파라미터 타입 or 값 다르면 같은 이름 사용 가능)
	//파라미터 안의 값은 지변 -> stack영역 -> 자동소멸 
	//해당 메소드 안에서만 유지와 사용이 됨 
	//내부에서 처리된 결과 한정적, 인스턴스 변수에 대해 한정
	//외부에서 유지하기 위해서는 1. 전변으로 치환, 2. 리턴타입 활용
	public void methodA(int i) {
		A a = new A();
		System.out.println(a);
		a.i = 20;
		System.out.println(a.i);
	}
	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a);
		A a= new A(1);
		System.out.println(a.i);
//		a.methodA(1);           //20 methodA(int i)를 거쳐서 그 메소드 안의 지변인 i 재정의값 출력 -> 원본에 영향x
//		System.out.println(a.i); //10 생성자 재정의값 출력
		a = new A(1,1);
		System.out.println(a.i);
				}
}
