package com.zerock.command;

public class ReqVO {
	
	//컨트롤러가 해당 파라미터 이름에 맞춰서 자동으로 받아줌
	//단 폼태그 이름과 setter의 set을 제외한 이름이 동일해야함.
	private String id;
	private String pw;
	private String name;
	private String age;
	
	//getter,setter
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	

}
