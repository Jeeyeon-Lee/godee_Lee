package collec.list;

import java.util.ArrayList;
import java.util.List;
class List1{
	/*선언부 읽혀지는 순간은 생성자가 호출이 될 때이다. 
	 * 초기화문제 -> 시점[타임라인관계] -> 인터셉트 가능(관여) : Spring F/W*/
	List<Integer> nums = null;      //선언만
	/*생성자*/
	public List1() {
		List<Integer> nums = new ArrayList<>();  //선언빼고(타입을 적지 않음) 생성만 하기
	}
}
public class ListMain1 {
	public static void main(String[] args) {
		List1 list1 = new List1();
		/*list는 위에서 생성되었기에 null 아님
		 * nums 변수는 전변이고, null임
		 * null의 사이즈는 확인할 수 없기 때문에 에러 
		System.out.println(list1.nums.size()); //원인 : 8번, nums의 생성이 필요함*/
		//System.out.println(list1.nums.size()); 0이 나오게 하고 싶으면??? 
		//1. 생성자를 통해 지변을 전변으로 생성해줌
		//2. 메인에서 생성을 해 줌. but, 지변일 땐 리턴타입으로 해결해야 함. 
		list1.nums = new ArrayList<>();
		System.out.println(list1.nums.size()); 
	}
}