package bclass.board;
//자유게시판 구현에 대한 클래스 설계
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoardView extends JFrame implements ActionListener {
    //생성자는 객체 생성 시 new 키워드와 함께 사용 ( 예 : new Student(); )
	//리턴타입을 사용하면 x, 사용하게 되면 메소드가 됨  -> 상수의 초기화, 메소드의 실행가능
	//디폴트 생성자는 파라미터가 들어있지 않은 생성자
	/*선언부*/
	BoardController boardController = null; //선언만, 타입x, 생성x -> 어디서?/ 액션에서 생성하자
	JButton jbtn_sel = new JButton("조회");
	/*생성자*/
	public BoardView() {	
		initDisplay();
	}
	/*사용자 메소드*/
	public void initDisplay() {
		//this는 현재 자신의 주소 -> 얘가 null로 들어가면 주소를 알 수 없는 상태가 됨 
//		jbtn_sel.addActionListener(null); 
		jbtn_sel.addActionListener(this); 
		this.add("North",jbtn_sel);
		this.setVisible(true);
		this.setSize(500,400);
	}
	/*메인메소드*/
	public static void main(String[] args) {
		BoardView bview = new BoardView();
	}
	//현재 상태 단위테스트 가능한가요?? -> 콜백메소드여서 내가 호출해야 메소드가 나옴. 
	//파라미터자리에 클래스(참조형) 타입도 올 수 있다. 
	@Override
	public void actionPerformed(ActionEvent e) { //추상메소드 - 구상이 미정(사용자가 정함) / 인터페이스(ActionListener)
		System.out.println("actionPerformed");
		Object obj = e.getSource();
		if(1 == 1) {
			boardController = new BoardController(); //1번이 눌릴 때만 생성하는 것으로
			boardController.getBoardList();              //그 메소드 호출
		}
	}

}
