package aquiz.step1;

//오버라이딩은 선언부를 건드리지 않음. 
class A {
	public byte getNumber() {
		return 1;
	}
}
class B extends A {
	@Override
	public byte getNumber() {
		return 2;
	}
	public static void main(String args[]) {
		A b = new B();  //부모가 호출될까? 자식이 호출될까? 타입이 부모가 출력?(자식 - 부모거는 쉐도우 메소드가 됨)
		System.out.println(b.getNumber());
	}
}
