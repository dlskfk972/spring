package com.zerock.dao;

import java.util.ArrayList;

import com.zerock.command.BoardVO;

public interface BoardDAO {

	public void boardInsert(String name, String title, String content); //�Խñ� ��ϸ޼���
	public ArrayList<BoardVO> boardSelect(); //��� �Խñ� ��������
	public void boardDelete(String num); //���� �޼���
	//�� �޼��带 �����ϴ� Ŭ���� BoardDAOImpl�� �����ϰ� �������̵��ϼ��� 
	
}
