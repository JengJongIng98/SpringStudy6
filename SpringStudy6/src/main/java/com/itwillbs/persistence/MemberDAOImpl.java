package com.itwillbs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

/*
 * MemberDAO 동작을 수행
 */
//@Repository : 스프링이 해당클래스를 DAO객체 (Bean)로 인식
//				root-context.xml파일에서 해당객체를 사용하도록 설정

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	// 공통변수, 디비 연결, 자원해제
	// 디비 연결객체(SqlSessionFactory)가 필요함 => 의존관계 주입
	@Inject
	private SqlSessionFactory sqlFactory;
	
	
	@Override
	public String getTime() {
		System.out.println(" DAO : getTime() 실행! ");
		
		// 1.2 디비연결
		SqlSession sqlSession = sqlFactory.openSession();
		// 3. SQL구문 & pstmt 객체
		// 4. SQL 실행
		//sqlFactory.selectOne(SQL구문);
		//sqlFactory.selectOne(SQL구문,전달정보);
		String result =
			sqlSession.selectOne("com.itwillbs.mapper.MemberMapper.getTime");
			//sqlSession.selectOne("com.itwillbs.mapper.MemberMapper.getScan");
		// 5. 데이터 처리
		System.out.println("결과 : "+result);
		
		return result;
	}
	
}
