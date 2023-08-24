<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	if('${msg}')
		alert('${msg}')
	
</script>
</head>
<body>
	<h1>로그인하세요</h1>
	<form:form action="${pageContext.request.contextPath}/login"
		method="post" modelAttribute="loginVO">
		ID : <form:input path="id"/><form:errors path="id" /><br>
		PASSWORD : <form:input path="password"/><form:errors path="password"/><br>
				<input type="submit" value="로그인">
	</form:form>
</body>
</html>