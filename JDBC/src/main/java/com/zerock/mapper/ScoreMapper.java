package com.zerock.mapper;

import java.util.ArrayList;
import java.util.Map;

import com.zerock.command.ScoreVO;

public interface ScoreMapper {
	
	//public void scoreInsert(ScoreVO vo);//���� �Է� �޼���
	public void scoreInsert(Map<String,String> map);//���� �Է� �޼���
	
	public ArrayList<ScoreVO> scoreSelect();//��� ���� ����Ʈ �������� �޼ҵ�
	public void scoreDelete(String num);//���� ���� �޼���
	
	

}
