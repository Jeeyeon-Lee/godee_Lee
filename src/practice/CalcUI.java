package practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcUI {
	/*선언부*/
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnClear = new JButton("C"); 
	CalcLogic cLogic = new CalcLogic(this);
	CalcEvent cEvent = new CalcEvent(this);
	/*생성자*/
	public CalcUI() {
		initDisplay();
	}
	/*정의메소드*/
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		jbtnOne.addActionListener(cEvent);
		jbtnTwo.addActionListener(cEvent);
		jbtnPlus.addActionListener(cEvent);
		jbtnEqual.addActionListener(cEvent);
		jbtnBack.addActionListener(cEvent);
		jbtnClear.addActionListener(cEvent);
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jp.add(jbtnClear);
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		CalcUI cUI = new CalcUI();
	}

}
