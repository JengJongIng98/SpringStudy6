<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function(){
		
		var cnt = 1;
		// 파일추가 버튼 클릭시
		$("#btnAdd").click(function(){
			//alert("클릭");
			// 파일추가(input 태그) 동적으로 생성
			$("#divFile").append("<input type='file' name='file"+cnt+"'><br>");
			cnt++;
		});
		
	});
</script>
</head>
<body>
	<h1>/views/file/form.jsp</h1>
	
	<fieldset>
		<legend> (다중)파일 업로드 </legend>
		
		<form action="${contextPath }/file/upload" method="post" enctype="multipart/form-data">
			아이디 : <input type="text" name="userid"> <br>
			이름 : <input type="text" name="username"> <br>
			<hr>
			<div id="divFile"></div>
			<!-- 첨부파일 : <input type="file" name="file"> <br> -->
			<input type="button" value="파일추가" id="btnAdd">
			
			<input type="submit" value="파일 업로드">
			
		</form>
	</fieldset>
	
</body>
</html>