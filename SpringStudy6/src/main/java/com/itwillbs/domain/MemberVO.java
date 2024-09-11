package com.itwillbs.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * VO (Value Object) : 데이터 저장 객체 (값을 저장하는 동작 이외의 동작O)
 * DTO (Data Transfer Object) : 데이터 전송 객체 (값을 저장하는 동작 이외의 동작X)
 * 
 * 
 * tbl_member 테이블정보를 저장하는 객체
 */
//@Data : set/get메서드 자동생성
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data
public class MemberVO {
	
//	private String Uid;
	//private String uId; //getUId() (x)
	//private String userId; //getUserId() (o)
	
	private String userid; // getUserid();
	private String userpw;
	private String username;
	private String useremail;
	private Timestamp regdate;
	private Timestamp updatedate;
	
	
}
