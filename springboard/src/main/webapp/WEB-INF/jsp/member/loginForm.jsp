<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인하세요</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		ID : <input type="text" name="id"><br> PASSWORD : <input
			type="text" name="password"> <input type="submit"
			value="로그인">
	</form>
</body>
</html>