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
	//�Խñ� ��� �޼���
	public void register(String name, String title, String content) {

		boardDAO.boardInsert(name, title, content);
		
		
	}
	//�Խù� List���� �޼���
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
