package bclass.step2;

import javax.swing.JFrame;

public class DMain extends JFrame {
	/*선언부에서 JFrame으로 생성하기*/
	JFrame jf = new DMain();
	public DMain() {
	}
	public void initDisplay() {
		/*상속받아 사용하기 
		 * this = JFrame을 상속받은 이 클래스
		this.setSize(600,500); // void java.awt.Window.setSize(int width, int height)
        //super = 부모를 나타냄. 여기선(Window)
		super.setSize(600,500); // void java.awt.Window.setSize(int width, int height)
		this.setVisible(true); // void java.awt.Window.setSize(int width, int height) */
		System.out.println(jf);
		System.out.println(this);
		jf.setVisible(true);
		jf.setSize(600,500);
	}
	public static void main(String[] args) {
		DMain dm = new DMain();
		dm.initDisplay();
	}

}
