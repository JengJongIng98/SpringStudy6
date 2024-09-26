<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>views/member/info.jsp</h1>
	
	${memberVO } <hr>
	
	<h2> 아이디 : ${memberVO.userid } </h2>
	<h2> 비밀번호 : ${memberVO.userpw } </h2>
	<h2> 이름 : ${memberVO.username } </h2>
	<h2> 이메일 : ${memberVO.useremail } </h2>
	<h2> 회원가입일 : ${memberVO.regdate } </h2>
	
	<h3><a href="/member/main" >메인페이지로</a></h3>
	
</body>
</html>