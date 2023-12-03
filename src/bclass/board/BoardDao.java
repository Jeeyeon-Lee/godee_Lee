package bclass.board;
//Data Access Object - 영속성을 제공하는 오라클 서버와 연계하는 역할만 전담 클래스
//클래스 사이의 결합도를 낮춰야 함.  <-재사용성, 칼퇴, 
//왜 오라클서버 연동하는 클래스를 따로 설계하였
public class BoardDao {
	//NullException을 맞지 않기 위해 this로 객체 주입받을 때는 항상 초기화하기
	BoardController boardController = null;  
	public BoardDao(BoardController boardController) {
		this.boardController = boardController;
	}

	public static void main(String[] args) {

	}

}
