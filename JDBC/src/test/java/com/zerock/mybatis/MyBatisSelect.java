package com.zerock.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zerock.testmapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisSelect {
	
	//service클래스로 가정
	@Autowired
	private TestMapper mapper;
	
	
	@Test
	public void select() {
		
		String time=mapper.getTime();
		
		System.out.println(time);
		
	}

}
