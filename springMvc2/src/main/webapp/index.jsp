<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>index입니다.</h1>
<a href="<%=request.getContextPath()%>/hello/hello">HelloController</a>
<a href="${pageContext.request.contextPath}/hello/hello">HelloController</a>
<a href="${pageContext.request.contextPath}/method/method">method/method</a>
<a href="${pageContext.request.contextPath}/member/joinForm">회원가입</a> <!-- url요청 -->
<a href="${pageContext.request.contextPath}/stringresponse">스트링response</a> <!-- url요청 -->
<a href="${pageContext.request.contextPath}/voresponse">memberVOresponseBody</a> <!-- url요청 -->
<a href="${pageContext.request.contextPath}/hello/3">requestMapping</a> <!-- url요청 -->
<br>
<br>
<h2>request.uri - springmvc/hello/hello</h2>
<h2>request.contextPath : ${pageContext.request.contextPath} - springmvc</h2>
<h2>request.servletPath : ${pageContext.request.servletPath} - hello/hello</h2>


</body>
</html>