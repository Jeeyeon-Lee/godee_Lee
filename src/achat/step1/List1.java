package achat.step1;

import java.util.List;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {
		List<String> list = new Vector<>(); //멀티스레드에 안전한 Vector
		list.add(0, "사과");
		list.add(1, "키위");
		list.add(2, "토마토");
		String apple = list.get(0);
		String kiwi = list.get(1);
		String tomato = list.get(2);
		System.out.println(apple);
		System.out.println(kiwi);
		System.out.println(tomato);
		System.out.println(list);
	}

}
