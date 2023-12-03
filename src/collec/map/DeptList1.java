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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//주소번지 두 번 접근해야 부서번호, 부서명, 지역 출력 가능

public class DeptList1 extends JFrame implements ActionListener {
	/*선언부*/
	JPanel jp_north = new JPanel();
	JButton jbtn_sel = new JButton("조회");
	String header[] = {"부서번호","부서명","지역"};
	String data[][] = new String[0][3];
	DefaultTableModel dtm = new DefaultTableModel(data, header);
	JTable jt = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jt);
	/*정의메소드*/
	//
	
	//DeptVo 초기화 메소드 -> 리턴타입으로 설정
	public DeptVO init1(int deptno, String dname, String loc) {
		DeptVO dvo = new DeptVO();
		dvo.setDeptno(deptno);
		dvo.setDname(dname);
		dvo.setLoc(loc);
		return dvo;
	}
	//DeptVO 화면에 뿌리는 메소드
	void arrayPrint() {
		DeptVO[] dvos = getDeptList1();
		for(int i=0;i<dvos.length;i++) {
			Vector<Object> v = new Vector<>();
			v.add(dvos[i].getDeptno());
			v.add(dvos[i].getDname());
			v.add(dvos[i].getLoc());
			dtm.addRow(v);
		}
	}
	
	//List<VO> 화면에 뿌리는 메소드
	void listVOPrint() {
		List<DeptVO> list = getDeptList2();
		for(int i=0;i<list.size();i++) {
			DeptVO dvo = list.get(i);
			Vector<Object> v = new Vector<>();
			v.add(dvo.getDeptno());
			v.add(dvo.getDname());
			v.add(dvo.getLoc());
			dtm.addRow(v);
		}
	}
	//List<Map> 화면에 뿌리는 메소드
	void listMapPrint() {
		List<Map<String,Object>> list = getDeptList3();
		//Iterator 사용 
		Iterator<Map<String, Object>> iter = list.iterator(); 
		while(iter.hasNext()) {
			Vector<Object> v = new Vector<>();
//			HashMap hm = (HashMap) iter.next();
			Map rmap = iter.next();
			v.add(rmap.get("deptno"));
			v.add(rmap.get("dname"));
			v.add(rmap.get("dloc"));
			dtm.addRow(v);			
		}
	}
	//DeptVO 활용
	DeptVO[] getDeptList1() {
		DeptVO[] dvos = new DeptVO[3];
		for(int i=0;i<dvos.length;i++) {
			dvos[i] = init1((i+1)*10,"개발"+(i+1)+"팀", "서울"+(i+1));
		}
		return dvos;
	}
	//List<DeptVO> 활용
	List<DeptVO> getDeptList2(){
		List<DeptVO> list = new ArrayList<>();
		DeptVO dvo = null;
		for(int i=0;i<3;i++) {
			dvo = new DeptVO((i+1)*20,"개발"+(i+1)+"팀", "서울"+(i+1));
			list.add(dvo);
		}
		return list;
	}
	//LIst<Map<String,Object>> 활용
	List<Map<String,Object>> getDeptList3(){
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String,Object> map = null;
		for(int i=0;i<3;i++) {
			map = new HashMap<>();
			map.put("deptno", (i+1)*30);
			map.put("dname","운영"+(i+1)+"팀");
			map.put("dloc", "서울"+(i+1));
			list.add(map);       //VO Map은 for문 안에서 add를 해야함. 마지막 것만 저장되기 때문에
		}
		return list;		
	}
	
	/*메인메소드*/
	public static void main(String[] args) {
		DeptList1 dt = new DeptList1();
		dt.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//조회
		if(obj  == jbtn_sel) {
//			arrayPrint();
//			listVOPrint();
			listMapPrint();
		}
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