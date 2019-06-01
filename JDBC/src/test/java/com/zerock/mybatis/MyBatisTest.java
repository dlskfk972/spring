package com.zerock.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*스프링 테스트를 사용하는 방법
 * pom.xml에 spring-test라이브러리 추가
 * pom.xml에 Juit 버전을 상위버전으로 변경 4.12
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
