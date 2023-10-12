package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//액션리스너를 인터페이스로 하는 클래스명으로 출력 가능(선언부, 생성부 이름이 다름)
public class DeptManager extends JFrame implements ActionListener {
	/*선언부*/
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[0][0]; //데이터는 아직x, 후처리
	DefaultTableModel  dtm_dept = new DefaultTableModel(datas,header); //폼, 양식만 만들어 DataSet 구상하기! 
	//파라미터 순(2차배열 자리, 1차배열 자리)
	//javax.swing.table.DefaultTableModel.DefaultTableModel(Object[][] data, Object[] columnNames)
	JTable jt_dept          = new JTable(dtm_dept); //위 데이터를 테이블에 넣겠음.
	JScrollPane jsp_dept = new JScrollPane(jt_dept); //속지 또한 테이블을 참조함.  	
	JPanel jp_north         = new JPanel();
	JButton jbtnSelect    = new JButton("조회");
	JButton jbtnAdd       = new JButton("행추가");
	JButton jbtnDel        = new JButton("행삭제");
	JButton jbtnExit        = new JButton("종료");
	/*생성자*/
	public DeptManager() { //디폴트 생성자
		initDisplay();
	}
	/*화면처리부*/
	public void initDisplay() {
		jbtnAdd.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnAdd.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnSelect.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnDel.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jbtnExit.addActionListener(this); //이 클래스의 ActionPerformed 호출됨. 
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT)); //패널에 들어가는 내용 왼쪽으로! 
		jp_north.add(jbtnSelect);
		jp_north.add(jbtnAdd);
		jp_north.add(jbtnDel);
		jp_north.add(jbtnExit);
		this.add("North", jp_north);
		this.add("Center",jsp_dept); //속지-데이터-테이블 다 연동 한꺼번에 나옴. 
		this.setSize(500,400);
		this.setVisible(true);
	}
	/*정의메소드*/

	/*메인메소드*/
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //첫 MVC패턴을 사용했던 swing에서 제공되는 창의 형태!
		DeptManager dm = new DeptManager(); //상속된 JFrame도 호출이 됨.
	}
	@Override //추상메소드 구현체클래스
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출은 반드시 addactionLister가 필요");
		Object obj = e.getSource();
		//버튼이 눌렸을 때의 이벤트 입력
		if(obj == jbtnSelect) {     //너 조회눌렀어?
			System.out.println("조회버튼 클릭");        //"로그" 어디까지 출력되고 있는지, 이력을 확인하는 용
			String sample[][] = {
					{"10","영업부","부산"}	
					,{"20","개발부","대전"}	
					,{"30","운영부","인천"}	
			};
			this.getContentPane().removeAll();; //remove All
			dtm_dept = null;
			dtm_dept = new DefaultTableModel(sample,header); //0*0 빈 값 테이블에서 3*3으로 재정의
			jt_dept = null;
			jt_dept = new JTable(dtm_dept);
			jsp_dept = null;
			jsp_dept = new JScrollPane(jt_dept); 
			this.add("Center",jsp_dept); 
			this.revalidate();
			this.repaint();
		}
	}
}
