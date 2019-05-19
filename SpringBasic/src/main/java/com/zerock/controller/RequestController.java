package com.zerock.controller;

import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.command.ReqVO;

//컨트롤러에 붙는 @RequestMapping운 해당클리새의 요청에 대한 경로를 하나로 통일하는데 사용합니다.
@Controller
@RequestMapping("/request/*")
public class RequestController {

	@RequestMapping(value="/req_ex01")
	public String req_ex01() {
		
		System.out.println("반딧불");
		return "request/req_ex01";
	}
	//get방식만 받음
	@RequestMapping(value="/basic1",method=RequestMethod.GET)
	public void basic1() {
		System.out.println("basic1요청확인");
	}
	//post방식만 받음
	@RequestMapping(value="/basic2",method=RequestMethod.POST)
	public void basic2() {
		System.out.println("basic2요청확인");
	}
	//get,post 알아서 자동맵핑
	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println("basic3요청확인");
	}
	//-----------------------------------------------
	//req_ex02화면처리
	@RequestMapping("/req_ex02")
	public String req_ex02() {
		return "request/req_ex02";
	}
	//전통적인 방식
//	@RequestMapping("/param")
//	public String param(HttpServletRequest request) {
//		
//		String id=request.getParameter("id");
//		String pw=request.getParameter("pw");
//		System.out.println(id);
//		System.out.println(pw);
//		return "request/req_ex03";
//	}
	//@RequestParam("name")어노테이션 사용
//	@RequestMapping("/param")
//	public String param(@RequestParam("id") String id,
//			            @RequestParam("pw") String pw,
//			            @RequestParam("name") String goodName) {
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(goodName);
//		
//		return "request/req_ex03";
//	}
	//커맨드 객체를 이용한 자동맵핑 방법
	@RequestMapping("/param")
	public String param(ReqVO vo,@RequestParam(value="inter",required=false, defaultValue="") ArrayList<String> list){
		
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println(vo.getPw());
		System.out.println(vo.getAge());
		
		//필수가 아닌 파라미터인 경우 required=false속성을 지정하면 됩니다.
		//그렇다면 자동으로 null값을 지정하는데 defaltValue=""속성으로 기본값을 지정하면 됩니다.
		System.out.println("---checkbox받기----");
		System.out.println(list.toString());
		return "request/req_ex03";
	}
	
	
}
