package com.zerock.jdbc;
//인터페이스
interface Car{
	public void run();//추상메서드
}


public class AnonymousTest {
	public static void main(String[] args) {
		//보통의 경우 구현하는 별도의 클래스를 생서해서 사용하지만, 
		//내부 기능을 재사용할 일이 없다면 익명클래스(이름없는 클래스)로 선언해서 1회성으로 사용할 수 있습니다.
		
		Car car=new Car() {

			@Override
			public void run() {
				System.out.println("달린다");
				
			}
		};

		car.run();
		
		
	}

}
