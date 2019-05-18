package day01.ex04.prototype;

import org.springframework.context.support.GenericXmlApplicationContext;

import day01.ex03.setter.DatabaseDev;

public class MainClass {

	public static void main(String[] args) {
		//Perosn클래스를 bean으로 생성(proto-context.xml)
		//이름은 홍길자, age 20으로 설정
		//main호출
		
		GenericXmlApplicationContext ctx
		=new GenericXmlApplicationContext("proto-context.xml");
		
		Person p1=ctx.getBean("person",Person.class);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
				
		Person p2=ctx.getBean("person",Person.class);
		p2.setName("홍길숙");
		System.out.println(p2.getName());
	}
}
