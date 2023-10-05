package Practice;
class D{
	int tot;
	int avg;
}
class D1{
	int hap(int n1, int n2, int n3, D c) {
		c.tot = n1 + n2 + n3;
		return c.tot;
	}
}
public class Dmain {

	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		D c = new D();
		D1 c1 = new D1();
		int sum = c1.hap(n1,n2,n3, c);
		System.out.println(sum);
		D c2 = new D();
		System.out.println(c2.tot);
	}

}
