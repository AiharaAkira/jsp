<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<a href="SecondC">(a태그)SecondC로 get방식 요청</a>
	<hr>
	<form action="SecondC">
		<input name="a">
		<button>(form태그)SecondC로 get방식 요청</button>
	</form>
	<hr>
	<h2 onclick="location.gref='secondC?a=ㅋㅅㅋ'">(js)SecondC로 get방식 요청</h2>
	<a href="SecondC?a=ㅋㅅㅋ">(a태그)ㅋㅅㅋSecondC로 get방식 요청</a>
</body>
</html>