<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	if ('${msg}')
		alert('${msg}')
</script>
</head>
<body>
	<a href="${pageContext.request.contextPath}/"><img alt=""
		src="https://www.kopo.ac.kr/ckimage/2021/11/RdpM96PX1HZJpTwWZ4gX.png">
	</a>

	<a href="${pageContext.request.contextPath}/board">게시판</a>v
	<a href="${pageContext.request.contextPath}/board/new">글쓰기</a>
	<c:if test="${empty currentUser}">
		<a href="${pageContext.request.contextPath}/login">로그인</a>
		<br>
	</c:if>
	<c:if test="${not empty currentUser}">
      ${currentUser.name}님 안녕하세요.<br>
		<a href="${pageContext.request.contextPath}/logout">로그아웃</a>
		<br>
	</c:if>
	<h1>로그인페이지</h1>
	<h1><spring:message code="label.title"></spring:message></h1>
	<form:form action="${pageContext.request.contextPath}/login"
		method="post" modelAttribute="loginVO">
		<form:errors path="id" /><br><spring:message code="label.firstName"></spring:message> : <form:input path="id" />
		
		
		비밀번호 : <form:input path="password" />
		<form:errors path="password" />
		<br>
		<input type="submit" value="로그인">
	</form:form>
</body>
</html>