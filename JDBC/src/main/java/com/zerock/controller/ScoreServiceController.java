package com.zerock.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.command.ScoreVO;
import com.zerock.service.ScoreService;
import com.zerock.service.ScoreServiceImp1;

@Controller
@RequestMapping("/service/*")
public class ScoreServiceController {
	//1st
	//ScoreService scoreService =new ScoreServiceImp1();
	
	//2nd
	//@Resource(name="scoreService")//이름
	@Autowired //@Qualifier("scoreService")
	private ScoreService scoreService;
	
	//화면처리
	@RequestMapping("/1scoreRegister")
	public String score() {
		return "service/1scoreRegister";
	}
	
	
	//점수 등록 요청
	@RequestMapping("/regist")
	public String regist(ScoreVO vo) {
		
		scoreService.scoreRegist(vo);
		
		return "service/2scoreResult";
	}
	
	//점수 리스트 보는 메서드
	@RequestMapping("/3scoreList")
	public String scoreList(Model model) {
		
		ArrayList<ScoreVO> list=scoreService.scoreGetList();
		model.addAttribute("scoreList",list);
		
		return "service/3scoreList";
		
	}
	//점수 삭제 요청
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") String num) {
		
	scoreService.scoreDelete(num);
	return "redirect:/service/3scoreList";
		
		
		
	}

}
