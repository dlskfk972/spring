package day01.ex05.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Printer pt1=ctx.getBean("printer",Printer.class);
		System.out.println(pt1.getDoc().data[0]);
		
		
		System.out.println("------------------------------");
		Printer2 pt2=ctx.getBean("printer2",Printer2.class);
		System.out.println(pt2.getDoc().data[1]);
		
		
	}

}
