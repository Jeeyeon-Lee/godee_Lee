package bclass.board;

public class Student {
	/*선언부*/
	//private 재정의, 접근x, 은닉상태임 
	private int s_no;
	private String s_name;
	private int grade;

	Student(int s_no, String s_name, int grade){
		this.s_no = s_no;
		this.s_name = s_name;
		this.grade = grade;
//		setS_no(s_no);
//		setS_name(s_name);
//		setGrade(grade);
		System.out.println("학생번호 : "+s_no+" | 학생이름 : "+s_name+" | 학년 : "+grade);
	}
	public static void main(String[] args) {
		Student s = new Student(54307, "나신입", 3);
		System.out.println(s);
		s = new Student(54306, "나일등", 1);
		System.out.println(s);
		s = new Student(54305, "나졸업", 6);
		System.out.println(s);
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
