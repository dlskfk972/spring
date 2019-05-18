package day01.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		//기존에 사용하던 방식
		//Spring sp=new Spring();
		//sp.method1();
		
		GenericXmlApplicationContext ctx
		=new GenericXmlApplicationContext("application-context.xml");
		
		Spring sp=ctx.getBean("nice",Spring.class);
		sp.method1();
	}

}
