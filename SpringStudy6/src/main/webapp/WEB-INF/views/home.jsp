<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<!-- <link rel="stylesheet" type="text/css" href="resources/style.css"> -->
	<!-- <link rel="stylesheet" type="text/css" href="./resources/style.css"> -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/style.css">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
