<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<a href="${pageContext.request.contextPath}/"><img alt="" src="https://www.kopo.ac.kr/ckimage/2021/11/RdpM96PX1HZJpTwWZ4gX.png">
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
	<h1>로그인하세요</h1>
	<form:form action="${pageContext.request.contextPath}/login"
		method="post" modelAttribute="loginVO">
		ID : <form:input path="id"/><form:errors path="id" /><br>
		PASSWORD : <form:input path="password"/><form:errors path="password"/><br>
				<input type="submit" value="로그인">
	</form:form>
</body>
</html>