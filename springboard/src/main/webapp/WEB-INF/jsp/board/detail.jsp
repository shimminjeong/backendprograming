<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script type="text/javascript">
	${document}.ready(function() {
		$('#replyAddBtn').click(function() {
			alert('클릭성공'))
			
		});
		
	});


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
	<div align="center">
		<table border="1">
			<tr>
				<th>번호</th>
				<td>${boardVO.no}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${boardVO.title}</td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td>${boardVO.writer}</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${boardVO.regdate}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${boardVO.content}</td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${boardVO.count}</td>
			</tr>
		</table>
		<input type="button" value="Home"
			onclick="location.href='${pageContext.request.contextPath}/'">
		<input type="button" value="목록으로"
			onclick="location.href='${pageContext.request.contextPath}/board'">
		<input type="button" value="삭제"
			onclick="location.href='${pageContext.request.contextPath}/'">
	</div>
	<div>
		<form>
			댓글 : <input type="text" size="80" anme="content"> 
			작성자 : <input type="text" size="20" anme="writer"> 
			<input type="button" value="댓글쓰기" id="replyAddBtn">
		</form>

	</div>
</body>
</html>