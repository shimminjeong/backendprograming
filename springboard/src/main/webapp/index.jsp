<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   환영합니다. 첫 페이지에요.
   <br> 1. 만약 currentUser 있나? 2. ${currentUser.name}님 안녕하세요. 3. 로그아웃
   링크 생성, 로그인 링크 삭제

   <a href="${pageContext.request.contextPath}/board">게시판</a>
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

</body>
</html>