package com.itwillbs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

//@Service : 서비스영역(비지니스로직 영역)에서의 동작을 구현하도록 설정
//			 root-context.xml에 빈(MemberService)으로 등록

/*
  비지니스 영역, Action페이지,pro.jsp 동작을 처리하는 공간
  => 컨트롤러와 DAO를 연결다리(접착제) / 완충영역
  => 고객사마다 유연한 대처가 가능
 */

@Service
public class MemberServiceImpl implements MemberService{
	
	// MemberDAO 객체 주입
	@Autowired
	private MemberDAO mdao;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Override
	public void memberJoin(MemberVO vo) {
		logger.debug(" 컨트롤러 -> 서비스 ");
		logger.debug(" 회원가입 메서드 memberJoin(MemberVO vo) 실행 ");
		
		logger.debug(" 서비스 -> DAO ");
		mdao.insertMember(vo);
		logger.debug(" DAO -> 서비스 ");
		logger.debug(" 서비스 -> 컨트롤러 ");
		
	}
	
	@Override
	public MemberVO memberLoginCheck(MemberVO vo) {
		logger.debug(" 컨트롤러가 호출 -> DAO 호출");
		// DAO 객체를 사용해서 로그인 여부를 체크하는 메서드를 호출
		
		//		MemberVO resultVO = mdao.loginMember(vo);
		//		return resultVO;
		
		return mdao.loginMember(vo);
	}
	
}
