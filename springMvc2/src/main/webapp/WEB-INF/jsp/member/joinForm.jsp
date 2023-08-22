<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지입니다.</h1>
	<form action="${pageContext.request.contextPath}/member/join" method="post">
		id : <input type="text" name="id"> 
		password : <input type="text" name="password"> 
		<input type="submit" value="회원가입">
	</form>


</body>
</html>