package day15;

public interface BoardService {
//
	
/*  
 * 1. 기능 : 게시글을 수정하는 메소드
 * 			수정할 게시글 정보가 주어지면 게시글 수정하는 메소드
 * 2. 매개변수 : 
 * 3. 리턴타입 :
 * 4. 메소드명 : 
*/
public void update(Board board);
  
    /* 1. 기능 : 게시글 번호가 주어지면 게시글을 전달하는 메소드
	 * 2. 매개변수 : 
	 * 3. 리턴타입 :
	 * 4. 메소드명 : 
	*/


public Board[] getBoardList();
    /* 1. 기능 : 게시글을 리스트를 가져오는 메소드
	 * 			 게시글 정보들을 가져오는 메소드
	 * 2. 매개변수 : X
	 * 3. 리턴타입 : Board[]
	 * 4. 메소드명 : getBoardList
	*/

public Board[] getBoardList(String search);
/* 1. 기능 : 검색어가 들어간 게시글을 리스트를 가져오는 메소드
 * 2. 매개변수 : String search
 * 3. 리턴타입 : Board[]
 * 4. 메소드명 : getBoardList */

class Board{
	int num;
	String title;
	String contents;
	String writer;
	String registerDate;
	}

}
