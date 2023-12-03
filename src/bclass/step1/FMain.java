package bclass.step1;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bclass.board.BoardVO;

//입력 수정 삭제 조회 상세보기
//입력 수정 삭제 - 리턴 int(1건), 파라미터는 BoardVO로 한다 . 
//전체조회 - List<BoardVO) or List<Map>>, 상세보기 -리턴
/* 반복되는 코드를 줄이기 위해 공통분모 생각해보기
 * 첫번째 단추 , 반복되는 코드 모아서 한 눈에 보이게 펼치고 리턴타입, 파라미터에 대한 선택*/
//추출 후 연산처리할 경우, VO를 제네릭으로 해야함. *(타입체크 필수)
//설계단계 - 화면정의서, 요구사항 정의서, 클래스 다이어그램(클래스 설계), 유스케이스 다이어그램(업무담당자 요구사항 그림 - 업무절차)
public class FMain {

	//입력처리
	/* ********************************************************************************
	 * INSERT INTO 테이블명(컬럼명1, 컬럼여2...)values(?,?,?,?,?,?,?)
	 * 쿼리문 자바코드에 왜 적나? 파라미터 자리 결정 가능(갯수, 타입, 컬럼명, 컬럼타입 등)
	 * @param BoardVO
	 * *******************************************************************************/
	public int boardInsert(BoardVO bVO) {
		int result =-1;
		return result;
	}

	//수정처리 - 있는 걸 바꾼다 - PK는 수정x
	/* ********************************************************************************
	 * update dept set dname =:dname, loc =:loc where deptno=:deptno;
	 * @param BoardVO
	 * *******************************************************************************/
	public int boardUpdate(BoardVO bVO) {
		int result =-1;
		return result;		
	}
	
	//삭제처리
	/* ********************************************************************************
	 * DELETE FROM freeboard WHERE fb_no=?;
	 * 쿼리문 자바코드에 왜 적나? 파라미터 자리 결정 가능(갯수, 타입, 컬럼명, 컬럼타입 등)
	 * @param int fb_no
	 * *******************************************************************************/
	public int boardDelete(int fb_no) {
		int result =-1;
		return result;
	}
	
	//전체조회처리
	/* ********************************************************************************
	 * SELECT fb_no, fb_title, fb_writer, fb_hi, fb_group, fb_step, fb_date FROM freeboard;
	 * SELECT*FROM freeboard;
	 * WHERE fb_title LIKE ? ||'%'  (제목으로 조건검색)
	 * AND(OR) fb_date LIKE ? ||'%'  (날짜로 조건검색)
	 * AND(OR) fb_writer LIKE ? ||'%'  (작성자로 조건검색) 
	 * -> 조건검색이 늘어나다보면 파라미터에 BoardVO 넣어야 함. 
	 * 쿼리문 자바코드에 왜 적나? 파라미터 자리 결정 가능(갯수, 타입, 컬럼명, 컬럼타입 등)
	 * @param (전체조회여서 필요x)
	 * *******************************************************************************/
//	public List<BoardVO> boardList() {
	public List<BoardVO> boardList(Map<String, Object> pmap) {
		List<BoardVO> bList = new ArrayList<>();
		return bList;
	}
	//상세보기 처리
	/* ********************************************************************************
	 * @param 
	 * *******************************************************************************/
	public BoardVO boardDetail() {
		BoardVO rbVO = null;
		return rbVO;
	}
	
	/*메인메소드*/
	public static void main(String[] args) {
	}
}