package com.zerock.controller;

import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.command.ReqVO;

//��Ʈ�ѷ��� �ٴ� @RequestMapping�� �ش�Ŭ������ ��û�� ���� ��θ� �ϳ��� �����ϴµ� ����մϴ�.
@Controller
@RequestMapping("/request/*")
public class RequestController {

	@RequestMapping(value="/req_ex01")
	public String req_ex01() {
		
		System.out.println("�ݵ���");
		return "request/req_ex01";
	}
	//get��ĸ� ����
	@RequestMapping(value="/basic1",method=RequestMethod.GET)
	public void basic1() {
		System.out.println("basic1��ûȮ��");
	}
	//post��ĸ� ����
	@RequestMapping(value="/basic2",method=RequestMethod.POST)
	public void basic2() {
		System.out.println("basic2��ûȮ��");
	}
	//get,post �˾Ƽ� �ڵ�����
	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println("basic3��ûȮ��");
	}
	//-----------------------------------------------
	//req_ex02ȭ��ó��
	@RequestMapping("/req_ex02")
	public String req_ex02() {
		return "request/req_ex02";
	}
	//�������� ���
//	@RequestMapping("/param")
//	public String param(HttpServletRequest request) {
//		
//		String id=request.getParameter("id");
//		String pw=request.getParameter("pw");
//		System.out.println(id);
//		System.out.println(pw);
//		return "request/req_ex03";
//	}
	//@RequestParam("name")������̼� ���
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
	//Ŀ�ǵ� ��ü�� �̿��� �ڵ����� ���
	@RequestMapping("/param")
	public String param(ReqVO vo,@RequestParam(value="inter",required=false, defaultValue="") ArrayList<String> list){
		
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println(vo.getPw());
		System.out.println(vo.getAge());
		
		//�ʼ��� �ƴ� �Ķ������ ��� required=false�Ӽ��� �����ϸ� �˴ϴ�.
		//�׷��ٸ� �ڵ����� null���� �����ϴµ� defaltValue=""�Ӽ����� �⺻���� �����ϸ� �˴ϴ�.
		System.out.println("---checkbox�ޱ�----");
		System.out.println(list.toString());
		return "request/req_ex03";
	}
	
	
}
