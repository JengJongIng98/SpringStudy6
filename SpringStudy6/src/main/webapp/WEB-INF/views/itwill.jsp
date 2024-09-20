<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/views/itwill.jsp</h1>
	
	<!-- jsp 내장객체를 사용 -->
	<h2> 파라메터 데이터(parameter) </h2>
	<h2> msg (parameter) : <%=request.getParameter("msg") %> </h2>
	<h2> msg (el 표현식) : ${param.msg } </h2>
	<hr>
	<h2> 영역객체 데이터(attribute) </h2>
	<h2> msg (el 표현식) : ${msg } </h2>
	<h2> msg (el 표현식) : ${requestScope.msg } </h2>
	
	<hr>
	
	@ModelAttribute("msg") String msg <br>
	 => request.getParameter("msg") + request.setAttribute("msg",값)
	 
	<hr>
	
	<h1> doB4() 실행시 전달된 VO객체 정보 출력 </h1>
	
	${vo } <hr>
	<%-- ${requestScope } --%>
	${memberVO } <hr>
	
	${vo1 }
	
	
</body>
</html>