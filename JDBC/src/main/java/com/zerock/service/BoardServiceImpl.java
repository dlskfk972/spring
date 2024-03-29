package com.zerock.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.command.BoardVO;
import com.zerock.dao.BoardDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	//게시글 등록 메서드
	public void register(String name, String title, String content) {

		boardDAO.boardInsert(name, title, content);
		
		
	}
	//게시물 List보기 메서드
	@Override
	public ArrayList<BoardVO> getList() {
		
		ArrayList<BoardVO> DB = boardDAO.boardSelect();
		
		return DB;
	}
	@Override
	public void delete(String num) {
		
		boardDAO.boardDelete(num);
	}
	
}
