package com.itwillbs.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class MemberDAOTest {
	
	// MemberDAO객체의 메서드 호출
	@Inject
	private MemberDAO mdao;
	
	//@Test
	public void getScan() {
		System.out.println("mdao : "+mdao);
	}
	
	@Test
	public void getTime() {
		mdao.getTime();
	}
	
}
