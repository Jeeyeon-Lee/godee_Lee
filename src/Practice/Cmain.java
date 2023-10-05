package Practice;
class C{
	int tot;
	int avg;
}
class C1{
	void hap(int n1, int n2, int n3) {
		C c = new C();
		c.tot = n1 + n2 + n3;
		System.out.println(c.tot);
	}
}
public class Cmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		C1 c1 = new C1();
		c1.hap(n1, n2, n3);
		C c = new C();
		System.out.println(c.tot);
	}

}
