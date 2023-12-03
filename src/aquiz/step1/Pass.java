package aquiz.step1;

public class Pass {
	int x = 5;
	public static void main(String []args) {
		Pass p = new Pass();
		p.doStuff(p.x);
		System.out.println("main x = "+ p.x); //전변
		}
		//++가 앞에 있으면 출력 전 1을 먼저 증가하고 그 다음에 출력
	void doStuff(int x) {
		System.out.println("doStuff x = "+ ++x);       //지변
		System.out.println("doStuff x = "+ ++this.x);  //전변을 바
		System.out.println(x); //6
	}
}
