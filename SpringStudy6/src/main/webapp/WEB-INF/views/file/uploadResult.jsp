<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/views/file/uploadResult.jsp</h1>
	
	${map }
	<hr>
	
	아이디 : ${map.userid } <br>
	이름 : ${map.username } <br>
	<%-- 파일: ${map.fileList[0] } <br> --%>
	<c:forEach var="file" items="${map.fileList }">
	
		<%-- 파일: <a href="C:/upload/${file }">${file }</a> <br> --%>
		파일: <a href="/file/download?fileName=${file }">${file }</a> <br>
		
		<img src="/file/download?fileName=${file }">
	</c:forEach>
	
	<a href="/file/form"> 다시 업로드 </a>
	
</body>
</html>