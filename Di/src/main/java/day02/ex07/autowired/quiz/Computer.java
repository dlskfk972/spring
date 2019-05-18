﻿package day02.ex07.autowired.quiz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {

	private Mouse mouse;
	private Keyboard kb;
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
	
	
	
	
	
	
	
}
