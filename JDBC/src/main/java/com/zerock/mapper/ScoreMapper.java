package com.zerock.mapper;

import java.util.ArrayList;
import java.util.Map;

import com.zerock.command.ScoreVO;

public interface ScoreMapper {
	
	//public void scoreInsert(ScoreVO vo);//점수 입력 메서드
	public void scoreInsert(Map<String,String> map);//점수 입력 메서드
	
	public ArrayList<ScoreVO> scoreSelect();//모든 점수 리스트 가져오는 메소드
	public void scoreDelete(String num);//점수 삭제 메서드
	
	

}
