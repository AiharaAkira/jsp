<%@page import="com.cmw.main.Result2"%>
<%@page import="com.cmw.main.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h1>잔돈 계산3</h1>
		<h1><%=request.getParameter("how") %>원 모자르네요<h1>
		<h1><%=request.getAttribute("how") %>원 모자르네요<h1>
</body>
</html>