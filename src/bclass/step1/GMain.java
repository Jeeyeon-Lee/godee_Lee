package bclass.step1;
class G{
	int i = 1;
	static int j = 10;
}
public class GMain {
	public static void main(String[] args) {
		//여러개의 인스턴스가 하나의 전변을 공유하고 싶다면 static으로 한다. 
		G g = new G();
		System.out.println(g.i); //1
		System.out.println(G.j); //10
		g.i++;
		G.j++;
		g = new G();
		System.out.println(g.i); //1
		System.out.println(G.j); //11
		g.i++;
		G.j++;
		g = new G();
		System.out.println(g.i); //1
		System.out.println(G.j); //12
	}
}
