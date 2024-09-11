package com.itwillbs.domain;

import java.sql.Timestamp;

/*
 * VO (Value Object) : 데이터 저장 객체 (값을 저장하는 동작 이외의 동작O)
 * DTO (Data Transfer Object) : 데이터 전송 객체 (값을 저장하는 동작 이외의 동작X)
 * 
 * 
 * tbl_member 테이블정보를 저장하는 객체
 */

public class MemberVO {
	
	private String userid;
	private String userpw;
	private String username;
	private String useremail;
	private Timestamp regdate;
	private Timestamp updatedate;
	
	
}
