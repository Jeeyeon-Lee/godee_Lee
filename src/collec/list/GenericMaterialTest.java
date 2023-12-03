package collec.list;

public class GenericMaterialTest {

	public static void main(String[] args) {
		Powder  p = new Powder();
		Plastic pt = new Plastic();
		GenericMaterial<Powder> tp3 = new GenericMaterial<>();
		tp3.setMaterial(p);
		//타입을 잘못 맞추면 ClassCastingException 발생 가능 -> 멈춤)
		Powder p1 = tp3.getMaterial(); //제네릭을 사용하지 않아서 문제가 됨? 

	}

}
