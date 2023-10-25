package bclass.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//화면과 로직을 분리하자 -> 디자인패턴 -> Logic이 MVC에서 Model 부분(데이터계층, 업무프로세스 계층)
//화면과 로직을 연결해주는 클래스 설계함. 
//자유게시판의 로직(입력, 수정, 삭제, 전체/상세조회 업무 구상 - 메소드 5개 설계-메소드별, 리턴/파라미터타입 결정)
//공통점을 찾아 하나로 합칠지 따로 작성할지 결정
//입력인 경우, 성공이면 1 반환, 실패이면 0 반환 - 누가? 오라클 서버가 
/*생성자*/
public class BoardController {
	BoardDao bDao = new BoardDao(this);
	//전체조회 메소드
	public List<Map<String, Object>> getBoardList() {
		System.out.println("getBoardList 호출 성공");
		return null;
	}
}
