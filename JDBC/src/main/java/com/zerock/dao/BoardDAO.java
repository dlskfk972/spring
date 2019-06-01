package com.zerock.dao;

import java.util.ArrayList;

import com.zerock.command.BoardVO;

public interface BoardDAO {

	public void boardInsert(String name, String title, String content); //게시글 등록메서드
	public ArrayList<BoardVO> boardSelect(); //모든 게시글 가져오기
	public void boardDelete(String num); //삭제 메서드
	//위 메서드를 구현하는 클래스 BoardDAOImpl을 생성하고 오버라이딩하세요 
	
}
