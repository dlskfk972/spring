package com.zerock.dao;

import java.util.ArrayList;

import com.zerock.command.ScoreVO;

public interface ScoreDAO {

	public void scoreInsert(ScoreVO vo);//���� �Է� �޼���
	public ArrayList<ScoreVO> scoreSelect();//��� ���� ����Ʈ �������� �޼ҵ�
	public void scoreDelete(String num);//���� ���� �޼���

	
	
}
