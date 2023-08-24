<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome
<a href="${pageContext.request.contextPath}/board">게시판</a>
<a href="${pageContext.request.contextPath}/board/new">새글쓰기</a>
<a href="${pageContext.request.contextPath}/login">로그인</a>
<a href="${pageContext.request.contextPath}/join">회원가입</a>
</body>
</html>