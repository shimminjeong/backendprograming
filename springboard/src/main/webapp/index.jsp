<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--    환영합니다. 첫 페이지에요.
   <br> 1. 만약 currentUser 있나? 2. ${currentUser.name}님 안녕하세요. 3. 로그아웃
   링크 생성, 로그인 링크 삭제<br> --%>
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

</body>
</html>
