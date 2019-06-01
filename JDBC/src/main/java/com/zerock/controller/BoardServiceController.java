package com.zerock.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.command.BoardVO;
import com.zerock.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardServiceController {
//	create table board01(
//			num int primary key auto_increment,
//		    name varchar(50),
//		    title varchar(50),
//		    content varchar(50)
//
//	);
	

	@Autowired
	private BoardService boardService;
	
	//�Խ��� ��� ȭ��ó��
	@RequestMapping("/boardRegister")
	public String boardRegister() {
		
		return "service/boardRegister";
	}
	
	//�Խñ� ��� ��û ó��
	@RequestMapping("/boardForm")
	public String boardForm(@RequestParam("name") String name,
			@RequestParam("title") String title,
			@RequestParam("content") String content
			) {
				
		boardService.register(name, title, content);
		
		return "service/boardResult";
	}
	
	//�Խñ� ����Ʈ ���� ��û ó��
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> DB = boardService.getList();
		
		//���޹��� DB�� boardList�̸����� ����
		model.addAttribute("boardList", DB); 
		
		return "service/boardList";
	}
	//�Խñ� ���� ó��
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") String num) {
		
		boardService.delete(num);
			
		return "redirect:/service/boardList";
	}
	
}

