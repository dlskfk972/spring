package com.zerock.jdbc;
//�������̽�
interface Car{
	public void run();//�߻�޼���
}


public class AnonymousTest {
	public static void main(String[] args) {
		//������ ��� �����ϴ� ������ Ŭ������ �����ؼ� ���������, 
		//���� ����� ������ ���� ���ٸ� �͸�Ŭ����(�̸����� Ŭ����)�� �����ؼ� 1ȸ������ ����� �� �ֽ��ϴ�.
		
		Car car=new Car() {

			@Override
			public void run() {
				System.out.println("�޸���");
				
			}
		};

		car.run();
		
		
	}

}
