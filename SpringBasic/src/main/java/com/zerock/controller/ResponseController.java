package com.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/response/*")
public class ResponseController {
	
	//void�� �޼��� ��� ������ ���ΰ� ������ ���Ϸ� �̵�
		@RequestMapping("/res_ex01")
		public void res_ex01() {
			
	}
		//model������
		@RequestMapping("/res_ex02")
		public String res_ex02(Model model) {
			
			model.addAttribute("name","kim");
			
			return "response/res_ex02";
		}
		//ModelAndView(������,�信 ���� ������ ���ÿ� ����)
		@RequestMapping("res_ex03")
		public ModelAndView res_ex03() {
			
			ModelAndView mv=new ModelAndView();
			mv.addObject("name","park");
			mv.setViewName("response/res_ex03");
			
			return mv;
		}
		//@ModelAttribute("�̸�")-ȭ�鿡�� ���� ���� ���� ȭ�鿡�� �ٽ� ����ؾ� �ϴ� ���
		@RequestMapping("/res_ex04")
		public String res_ex04(@ModelAttribute("id") String id) {
			
			System.out.println(id);
			return "response/res_ex04";
		}

}
