package day01.ex03.setter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] arg) {
		GenericXmlApplicationContext ctx
		=new GenericXmlApplicationContext("application-context.xml");
		
		DatabaseDev dv=ctx.getBean("DBDev",DatabaseDev.class);
		System.out.println(dv.getUrl());
		System.out.println(dv.getUid());
		System.out.println(dv.getUpw());
				
		System.out.println("-----------------------------------------");
		//url="jdbc:mysql://118.130.22.132:3306/dev
		//uid=auth01
		//upw=1234
		
		DatabaseDev dv2=ctx.getBean("DBDev2",DatabaseDev.class);
		System.out.println(dv2.getUrl());
		System.out.println(dv2.getUid());
		System.out.println(dv2.getUpw());
		
		System.out.println("-----------------------------------------");
		
		MemberDAO dao=ctx.getBean("ds",MemberDAO.class);
		dao.info();
		
		
	}
}
