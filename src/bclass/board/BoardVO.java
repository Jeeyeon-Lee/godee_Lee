package bclass.board;

public class BoardVO {
	/*선언부*/
	private int fb_no           =0; //글번호
	private String fb_title     ="";//글제목
	private String fb_wirter   ="";//작성
	private String fb_content ="";//글내용
	private int fb_hit           =0; //조회수
	private int fb_group       =0; //그룹번호
	private int fb_step         =0; //글순서
	private String fb_date     ="";//작성일자
	//1이면 입력|수정|삭제 성공, 0이면 입력|수정|삭제 실패
	private int result           = -1; //0실패, 1정상(두 값에 영향을 주지 않도록 초기값을 설정)

	/*생성자*/
	public int getResult() {
		return result;
	}

	/*사용자메소드*/
	public void setResult(int result) { 
		//public으로 변수를 선언하여 직접 사용할 때 보다 메소드를 통해 값을 사용하므로 
		//1또는 0이라는 입력값에 대한 유효성 체크를 할 수 있다는 장점이 있음. 
		boolean isValid = false;
		if(result == 0 | result == 1) {
			isValid = true;
		}
		
		this.result = result;
	}

	/*getter, setter*/
	public int getFb_no() {
		return fb_no;
	}

	public void setFb_no(int fb_no) {
		this.fb_no = fb_no;
	}

	public String getFb_title() {
		return fb_title;
	}

	public void setFb_title(String fb_title) {
		this.fb_title = fb_title;
	}

	public String getFb_wirter() {
		return fb_wirter;
	}

	public void setFb_wirter(String fb_wirter) {
		this.fb_wirter = fb_wirter;
	}

	public String getFb_content() {
		return fb_content;
	}

	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}

	public int getFb_hit() {
		return fb_hit;
	}

	public void setFb_hit(int fb_hit) {
		this.fb_hit = fb_hit;
	}

	public int getFb_group() {
		return fb_group;
	}

	public void setFb_group(int fb_group) {
		this.fb_group = fb_group;
	}

	public int getFb_step() {
		return fb_step;
	}

	public void setFb_step(int fb_step) {
		this.fb_step = fb_step;
	}

	public String getFb_date() {
		return fb_date;
	}

	public void setFb_date(String fb_date) {
		this.fb_date = fb_date;
	}
		
}
