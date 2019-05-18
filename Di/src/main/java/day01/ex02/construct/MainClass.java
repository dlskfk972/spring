package day01.ex02.construct;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
		//Chef chef=new Chef();
		//Hotel hotel =new Hotel(chef);
		
		//hotel.getChef().cook();
	GenericXmlApplicationContext ctx=
			new GenericXmlApplicationContext("application-context.xml");
	
	Hotel hotel=ctx.getBean("hotel",Hotel.class);
		hotel.getChef().cook();
		
		
	ResTaurant res=ctx.getBean("res",ResTaurant.class);
	res.getChef().cook();
	}

}
