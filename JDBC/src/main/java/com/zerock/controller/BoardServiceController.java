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
	
	//게시판 등록 화면처리
	@RequestMapping("/boardRegister")
	public String boardRegister() {
		
		return "service/boardRegister";
	}
	
	//게시글 등록 요청 처리
	@RequestMapping("/boardForm")
	public String boardForm(@RequestParam("name") String name,
			@RequestParam("title") String title,
			@RequestParam("content") String content
			) {
				
		boardService.register(name, title, content);
		
		return "service/boardResult";
	}
	
	//게시글 리스트 보기 요청 처리
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> DB = boardService.getList();
		
		//전달받은 DB를 boardList이름으로 저장
		model.addAttribute("boardList", DB); 
		
		return "service/boardList";
	}
	//게시글 삭제 처리
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") String num) {
		
		boardService.delete(num);
			
		return "redirect:/service/boardList";
	}
	
}

