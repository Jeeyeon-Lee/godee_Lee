package practice;

public class Sungjuk {
	private String name = null;              //학생이름
	private int scoreH;                          //html 점수
	private int scoreC;                          //css 점수
	private int scoreJ;                           //java 점수
	private int scoreSum;                      //score 합
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScoreH() {
		return scoreH;
	}
	public void setScoreH(int scoreH) {
		this.scoreH = scoreH;
	}
	public int getScoreC() {
		return scoreC;
	}
	public void setScoreC(int scoreC) {
		this.scoreC = scoreC;
	}
	public int getScoreJ() {
		return scoreJ;
	}
	public void setScoreJ(int scoreJ) {
		this.scoreJ = scoreJ;
	}
	public int getScoreSum() {
		return scoreSum;
	}
	public void setScoreSum(int scoreSum) {
		this.scoreSum = scoreSum;
	}
}