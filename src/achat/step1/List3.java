package achat.step1;

import java.util.ArrayList;
import java.util.List;

class Kiwi{
	String name = null;
}
class Tomato{
	
}
public class List3 {
	/*선언부*/
	List<String> bread = new ArrayList<>();
	List<Kiwi> kiwis = new ArrayList<>();
	List<Tomato> tomatos = new ArrayList<>();
	/*생성자*/
	/*정의메소드*/
	void methodA() {
		//리스트에 추가할 때 제네릭을 확인하는 것 필요
		//제네릭이 생성이 되었는지도 확인 필요
		//리스트명.add(더할내용);
		bread.add("소보로");
		Kiwi kiwi = new Kiwi();
		kiwi.name = "골드키위";
//		bread.add(kiwi); //왜 안들어가질까? -> bread의 제네릭은 String이다.
		kiwis.add(kiwi); //키위의 주소 담기
		Kiwi kiwi2 = new Kiwi();
		kiwi2.name = "초록키위";
		kiwis.add(kiwi2); //키위2의 주소 담기
		Tomato tomato = new Tomato();
		tomatos.add(tomato); //토마토 주소 담기
	}
	public void methodB() {
		//for, while문은 boolean을 리턴하는 것이 파라미터 안에 들어감
		Kiwi kiwi = null;
		int i = 1;
		while(true) { //무한루프
			kiwi = new Kiwi();
			System.out.println(kiwi);  //생성되는 kiwi객체의 주소들은 다 다름 
			i++;
			if(i==5) {
				break; //무한루프 끊기
			}
		}
	}
	/*메인메소드 개발자에게 제어권 있음.*/
	public static void main(String[] args) {
		List3 list3 = new List3();
		System.out.println(list3.bread+", "+list3.kiwis+", "+list3.tomatos);
		System.out.println(list3.bread.size()+", "+list3.kiwis.size()+", "+list3.tomatos.size());
		list3.methodA(); 
		System.out.println(list3.bread+", "+list3.kiwis+", "+list3.tomatos);
		System.out.println(list3.bread.size()+", "+list3.kiwis.size()+", "+list3.tomatos.size());
		list3.methodB(); 
	}
}
