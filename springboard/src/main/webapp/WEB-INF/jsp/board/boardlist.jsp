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
	전체게시판입니다
	<br> ${boardlist}
	<div align="center">
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>지은이</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${boardlist}" var="board" varStatus="loop">
				<tr>
					<td>${board.no}</td>
<%-- 					<td><a href="${pageContext.request.contextPath}/post?no=${board.no}">${board.title}</td> --%>
					<td><a href="${pageContext.request.contextPath}/board/${board.no}">${board.title}</td>
					<td>${board.writer}</td>
					<td>${board.regdate}</td>
					<td>${board.count}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>