<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	새글입니다.
	<div>
		<form:form action="${pageContext.request.contextPath}/board/new"
			method="post" modelAttribute="boardVO">
			<!-- 여기 안에 있는거 boradVO.title, boradVO.writer, boradVO.content로 만들어서 보냄(jsp -> java) -->

			<table>

				<tr>
					<th>제목</th>
					<td><form:input path="title" /></td>
					<%-- ${boardVO.title} getter, setter같은 역할 --%>
					<td><form:errors path="title" /></td>
				</tr>

				<tr>
					<th>글쓴이</th>
					<td><form:input path="writer" /></td>
					<td><form:errors path="writer" /></td>
				</tr>

				<tr>
					<th>내용</th>
					<td><form:input path="content" /></td>
					<td><form:errors path="content" /></td>
				</tr>

			</table>
			<input type="submit" value="새글쓰기">

		</form:form>
	</div>


</body>
</html>