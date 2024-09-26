<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>loginForm.jsp</h1>
	
	<fieldset>
		<legend> 로그인 </legend>
		<form method="post"> <!-- action속성이 없을때 자신주소 호출 -->
			아이디 : <input type="text" name="userid"> <br>
			비밀번호 : <input type="password" name="userpw"> <hr>
			
			<input type="submit" value="로그인">
			<input type="button" value="회원가입" onclick="location.href='/member/join';">
			
			<a href="/member/join">회원가입</a>
			<a href="javascript:location.href='/member/join';">회원가입2</a>
		</form>
	</fieldset>
	
</body>
</html>