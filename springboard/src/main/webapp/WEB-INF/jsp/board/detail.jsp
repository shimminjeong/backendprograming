<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script type="text/javascript">
	function showReplyList(){
		$.ajax({
			url : '${pageContext.request.contextPath}/reply/${boardVO.no}',
			method : 'GET',
			success : function(data){ //ReplyVO list
				console.log(data)
				console.log(typeof data)
				$('#replyList').empty();
				//#replyList에 보여줄것
				$(data).each(function(){
					str='<hr>';
					str+='<strong>'+this.content+'</strong>';
					str+='&nbsp;'+this.writer+'&nbsp;';
					str+='&nbsp;'+this.regDate+'&nbsp;';
					str+='<button class="delBtn" id='+this.no+'>삭제</button>';
					console.log("str",str)
					$('#replyList').append(str)
				})
			},
			error : function(){
				alert('showReplyList 실패')
			}
		})
	}
	
	$(document).ready(function() {
		
		showReplyList();
		
		$(document).on('click','.delBtn',function(){
			let replyNo=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/reply/'+replyNo,
				method : 'delete',
				success : function(){
					alert('delete 성공')
					//reload해주자
					//replylist를 한번 더 불러줘
					showReplyList();
				},
				error : function(){
					alert('delete 실패')
				}
			})
		})
		
		$('#replyAddBtn').click(function() {
			/* alert('클릭성공') */
			let replyContent=document.replyForm.content.value;
			let replyWriter=document.replyForm.writer.value;

			$.ajax({
				url : '${pageContext.request.contextPath}/reply',
				method : 'POST',
				data : {
					boardNo: ${boardVO.no},
						writer:replyContent,
						content:replyContent
				},
				success : function(){
					alert('insert성공')
					document.replyForm.content.value="";
					document.replyForm.writer.value="";
					showReplyList();
				},
				error : function(){
					alert('insert실패')
				}
			
			})
			
		})
		
	})

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
		<form name="replyForm">
			댓글 : <input type="text" size="80" name="content"> 작성자 : <input
				type="text" size="20" name="writer"> <input type="button"
				value="댓글쓰기" id="replyAddBtn">
		</form>

	</div>
	<div id="replyList"></div>

</body>
</html>