package com.zerock.service;

import java.util.ArrayList;

import com.zerock.command.ScoreVO;

public interface ScoreService {
	
	public void scoreRegist(ScoreVO vo);//���� ��� �޼���
	public ArrayList<ScoreVO> scoreGetList();//��� ���� ����Ʈ �������� �޼���
	public void scoreDelete(String num);//���� ���� �޼���
	
	





}
