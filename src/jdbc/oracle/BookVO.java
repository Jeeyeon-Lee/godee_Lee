package jdbc.oracle;

public class BookVO {
	/*선언부*/
	//toad에서 가져오기 ->표 확인  해당 Object 드래그 &  f4 / script / 해당 변수 복사&붙여넣기 
	// ctrl + y (소문자로) / ctrl + shift + a  또는 위 아이콘(Toggle Block Selection Mode) 클릭
	//but, 반드시 설계된 컬럼만 선언할 수 있는 건 아니야! 설계 중 필요한 변수들을 추가할 수 있어! 
	private int b_no =0;     ;
    private String b_title =""  ;               
    private String b_author ="" ;               
    private int b_price  =0;  ;       
    int count = 5;//도서 주문량
    int start = 0;//시작페이지
    int end = 0;//끝나는 페이지
    int pagePerList = 10;
    int totalRecord = 45; 
	/*생성자*/

	/*정의메소드*/

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_author() {
		return b_author;
	}

	public void setB_author(String b_author) {
		this.b_author = b_author;
	}

	public int getB_price() {
		return b_price;
	}

	public void setB_price(int b_price) {
		this.b_price = b_price;
	}

	/*메인메소드*/
	public static void main(String[] args) {
	}

}
