package collec.map;
/* Dept[]
 * dept[0]
 * dept[1]
 * dept[2]
 * 
 * List<DeptVO>
 * 
 * List<Map<String,Object>>
 * */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//주소번지 두 번 접근해야 부서번호, 부서명, 지역 출력 가능

public class DeptList1 extends JFrame implements ActionListener {
	JPanel jp_north = new JPanel();
	JButton jbtn_sel = new JButton("조회");
	String header[] = {"부서번호","부서명","지역"};
	String data[][] = new String[0][3];
	DefaultTableModel dtm = new DefaultTableModel(data, header);
	JTable jt = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jt);
	DeptVO[] getDeptList1() {
		return null;
	}
	List<DeptVO> getDeptList2(){
		return null;
		
	}
	
	List<Map<String,Object>> getDeptList3(){
		return null;
		
	}
	
	public static void main(String[] args) {
		DeptList1 dt = new DeptList1();
		dt.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	void initDisplay() {
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jbtn_sel.addActionListener(this);
		jp_north.add(jbtn_sel);
		this.add("North", jp_north);
		this.add("Center", jsp);
		this.setTitle("부서목록");
		this.setSize(600, 400);
		this.setVisible(true);
	}

}