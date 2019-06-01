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
	
	//------------------------------------------mybatis�� ����
	@Autowired
	private ScoreMapper mapper;
	
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		//1st-vo�� ���� ���߰� ����
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
		
		//1.scoreMapper �������̽��� ����� �߻�޼��� ȣ��
		//2.xml�� <delete>�±׿� id�� �߻�޼��� ����
		//3.sql�� �ۼ�
		mapper.scoreDelete(num);
		
	}

	
	
	
}
