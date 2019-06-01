package com.zerock.service;

import java.util.ArrayList;

import com.zerock.command.ScoreVO;

public interface ScoreService {
	
	public void scoreRegist(ScoreVO vo);//점수 등록 메서드
	public ArrayList<ScoreVO> scoreGetList();//모든 점수 리스트 가져오는 메서드
	public void scoreDelete(String num);//점수 삭제 메서드
	
	





}
