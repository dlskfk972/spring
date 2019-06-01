package com.zerock.service;

import java.util.ArrayList;

import com.zerock.command.BoardVO;

public interface BoardService {

	public void register(String name, String title, String content); //board 등록 메서드
	public ArrayList<BoardVO> getList(); //모든 게시물 가져오기
	public void delete(String num); //게시글 삭제 메서드
	
	//위 메서드를 구현하는 클래스 BoardServiceImpl을 생성하고 오버라이딩하세요 
}