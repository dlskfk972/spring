package com.zerock.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*������ �׽�Ʈ�� ����ϴ� ���
 * pom.xml�� spring-test���̺귯�� �߰�
 * pom.xml�� Juit ������ ������������ ���� 4.12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisTest {
	
	@Autowired
	SqlSessionFactory sqlFactory;
	
	@Test
	public void test() {
		
		System.out.println(">>>>"+sqlFactory);
	}

}
