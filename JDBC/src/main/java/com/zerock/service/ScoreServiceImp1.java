package com.zerock.service;

import java.util.ArrayList;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.command.ScoreVO;
import com.zerock.mapper.ScoreMapper;

//@Component("scoreService")
//@Repository
@Service("scoreService")
public class ScoreServiceImp1 implements ScoreService{
	/*@Autowired
	private ScoreDAO scoreDAO;
	@Override
	public void scoreRegist(ScoreVO vo) {
		scoreDAO.scoreInsert(vo);
	}
	@Override
	public ArrayList<ScoreVO> scoreGetList(){	
		ArrayList<ScoreVO> list=scoreDAO.scoreSelect();
		return list;
		//return scoreDAO.scoreSelect();
	}
	@Override
	public void scoreDelete(String num) {	
		scoreDAO.scoreDelete(num);
	}
*/
	
	//------------------------------------------mybatis로 연결
	@Autowired
	private ScoreMapper mapper;
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		//1st-vo를 통해 다중값 전달
		//mapper.scoreInsert(vo);
		
		//2nd-
		HashMap<String,String>map=new HashMap<>();
		map.put("p1",vo.getName());
		map.put("p2",vo.getKor());
		map.put("p3",vo.getEng());
		map.put("p4",vo.getMath());
		
		mapper.scoreInsert(map);
		
	}
	
	@Override
	public ArrayList<ScoreVO> scoreGetList() {
		ArrayList<ScoreVO> list= mapper.scoreSelect();
		 
		 return list;
	}

	@Override
	public void scoreDelete(String num) {
		
		//1.scoreMapper 인터페이스에 선언된 추상메서드 호출
		//2.xml에 <delete>태그에 id에 추상메서드 선언
		//3.sql문 작성
		mapper.scoreDelete(num);
		
	}

	
	
	
}
