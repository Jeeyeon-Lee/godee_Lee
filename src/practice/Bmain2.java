package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class B1{
	JButton jbtnSelect = new JButton("조회");
}
class B2{
	JButton jbtnSelect = new JButton("입력");
}
public class Bmain2 implements ActionListener{
	JFrame jf = new JFrame();
	B1 b1 = new B1();
	B2 b2 = null;
	//생성자
	public Bmain2() {
		b2 = new B2(); //생성
		initDisplay();
	}
	public void initDisplay() {
		jf.setSize(400,500);
		jf.setVisible(true);
		jf.add("North",b1.jbtnSelect);
		jf.add("South",b2.jbtnSelect);
	}
	public static void main(String[] args) {
		Bmain2 b2 = new Bmain2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼눌렀을 때 이벤트 생성 jbtnSelect Object
		Object obj = e.getSource(); //이벤트가 감지된 주소번지!!
			if(obj == b1.jbtnSelect) {
				System.out.println(b1.jbtnSelect.getText());
			}
			else if(obj == b2.jbtnSelect) {
				System.out.println(b2.jbtnSelect.getText());
			}
	}

}
