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
	<h1>회원가입</h1>
	<form:form action="${pageContext.request.contextPath}/join"
		method="post" modelAttribute="memberVO">
		NAME : <form:input path="name"/><form:errors path="name" /><br>
		ID : <form:input path="id"/><form:errors path="id" /><br>
		PASSWORD : <form:input path="password"/><form:errors path="password" /><br>
		ADDRESS : <form:input path="address"/><form:errors path="address" /><br>
				<input type="submit" value="회원가입">
	</form:form>
</body>
</html>