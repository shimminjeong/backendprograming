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
<br>
<br>
<h2>request.uri - springmvc/hello/hello</h2>
<h2>request.contextPath : ${pageContext.request.contextPath} - springmvc</h2>
<h2>request.servletPath : ${pageContext.request.servletPath} - hello/hello</h2>


</body>
</html>