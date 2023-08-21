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
<br>
<br>
request.uri - springmvc/hello/hello<br>
request.contextPath : ${pageContext.request.contextPath} - springmvc<br>
request.servletPath : ${pageContext.request.servletPath} - hello/hello<br>


</body>
</html>