package bclass.step2;
//EMain is a E
class E{
	public E() {
		System.out.println("E()");
	}
	public void m() {
	}
}
public class EMain extends E {
	public EMain() {
		System.out.println("EMain()");
	}
	//부모 메소드 오버라이드 -> 틀을 바꿔서 사용하는 건 안 됨(약속)
	@Override //주석이 아님 
	public void m() {
	}
	//메소드 오버로딩
	public void m(int i) {
	}
	public static void main(String[] args) {
		new EMain(); // 호출하게 될 때 부모인 E의 생성자부터 거쳐서 내려옴 -> 메모리에 부하가 올 수 있음. 
	}
}
