package com.zerock.service;

import java.util.ArrayList;

import com.zerock.command.BoardVO;

public interface BoardService {

	public void register(String name, String title, String content); //board ��� �޼���
	public ArrayList<BoardVO> getList(); //��� �Խù� ��������
	public void delete(String num); //�Խñ� ���� �޼���
	
	//�� �޼��带 �����ϴ� Ŭ���� BoardServiceImpl�� �����ϰ� �������̵��ϼ��� 
}