package com.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/response/*")
public class ResponseController {
	
	//void형 메서드 경우 지정한 맵핑과 동일한 파일로 이동
		@RequestMapping("/res_ex01")
		public void res_ex01() {
			
	}
		//model전달자
		@RequestMapping("/res_ex02")
		public String res_ex02(Model model) {
			
			model.addAttribute("name","kim");
			
			return "response/res_ex02";
		}
		//ModelAndView(데이터,뷰에 대한 정보를 동시에 저장)
		@RequestMapping("res_ex03")
		public ModelAndView res_ex03() {
			
			ModelAndView mv=new ModelAndView();
			mv.addObject("name","park");
			mv.setViewName("response/res_ex03");
			
			return mv;
		}
		//@ModelAttribute("이름")-화면에서 받은 값을 다음 화면에서 다시 사용해야 하는 경우
		@RequestMapping("/res_ex04")
		public String res_ex04(@ModelAttribute("id") String id) {
			
			System.out.println(id);
			return "response/res_ex04";
		}

}
