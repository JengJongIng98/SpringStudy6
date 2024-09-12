package com.itwillbs.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
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
	
	//@Test
	public void getTime() {
		mdao.getTime();
	}
	
	//@Test
	public void 회원가입테스트() {
		System.out.println(" TEST : 회원가입테스트() 시작 ");
		
		// 회원가입정보
		MemberVO vo = new MemberVO();
		vo.setUserid("itwill");
		vo.setUserpw("1234");
		vo.setUsername("아이티윌");
		vo.setUseremail("itwill@itwill.com");
		
		//mdao.insertMember(vo);
		
		System.out.println(" TEST : 회원가입테스트() 끝 ");
	}
	
	//@Test
	public void 로그인테스트() {
		System.out.println(" TEST : 로그인테스트() 시작 ");
		
		MemberVO vo = new MemberVO();
		vo.setUserid("admin");
		vo.setUserpw("12345");
		
		MemberVO resultVO = mdao.loginMember(vo);
		System.out.println(" TEST : "+resultVO);
		
		if(resultVO != null) {
			System.out.println(" TEST : 로그인 성공! ");
		}else {
			System.out.println(" TEST : 로그인 실패! ");
		}
		
		System.out.println(" TEST : 로그인테스트() 끝 ");
	}
	
	//@Test
	public void 로그인테스트2() {
		System.out.println(" TEST : 로그인테스트2() 시작 ");
		
		MemberVO vo = new MemberVO();
		vo.setUserid("admin");
		vo.setUserpw("12345");
		
		MemberVO resultVO = mdao.loginMember("admin","1234");
		System.out.println(" TEST : "+resultVO);
		
		if(resultVO != null) {
			System.out.println(" TEST : 로그인 성공! ");
		}else {
			System.out.println(" TEST : 로그인 실패! ");
		}
		
		System.out.println(" TEST : 로그인테스트2() 끝 ");
	}
	
	//@Test
	public void 로그인테스트3() {
		
	}
	
	
	// 회원정보 조회
	//@Test
	public void 회원정보조회() {
		
		MemberVO resultVO = mdao.getMember("admin");
		System.out.println(" TEST : "+resultVO);
		
	}
	
	//@Test
	public void 회원정보수정() {
		
		MemberVO uvo = new MemberVO();
		uvo.setUserid("admin");
		uvo.setUserpw("1234");
		uvo.setUsername("수정 관리자");
		uvo.setUseremail("updateAdmin@admin.com");
		
		int result = mdao.updateMember(uvo);
		System.out.println(" TEST : "+result);
		
		if(result > 0) {
			System.out.println(" Test : 회원정보 수정완료! ");
		}else {
			System.out.println(" Test : 회원정보 수정실패! ");
		}
		
	}
	
	//@Test
	public void 회원정보삭제() {
		
		MemberVO dvo = new MemberVO();
		dvo.setUserid("admin");
		dvo.setUserpw("1234");
		
		int result = mdao.deleteMember(dvo);
		
		if(result > 0) {
			System.out.println(" Test : 회원정보 삭제 성공");
		}else {
			System.out.println(" Test : 회원정보 삭제 실패");
		}
		
	}
	
	@Test
	public void 회원목록_리스트() {
		
		List<MemberVO> memberList = mdao.getMemberList();
		
		for(MemberVO vo:memberList) {
			System.out.println("vo : "+vo);
		}
		
	}
	
	
	
	
}
