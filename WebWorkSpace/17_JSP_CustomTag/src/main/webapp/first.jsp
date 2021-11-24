<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  
	.jsp에 ㅈ자바를 쓰는 경우
	1. 값을 읽으려고 - EL로 해결
	--------------------CustomTag로 해결
	2.출력형식 때문에 
	3.조건문 반복문
	4.이동하려고
	
	CustomTag
	-DOM객체 모양 (html) - 실행 떄 자바코드로 바뀌어서 실행
	- .jsp 여기서만 
	
	<접두어:XXX></접두어:XXX>
	CustomTag는 2종류
	1. JSP 표준 액션 태그(정품) 
	.jsp에서 기본적으로 쓸수있음.
	2.JSTL(사제)
	
-->
<h1>firstpage</h1>
redirect는 표준 액션ㅊㄹ)태그에 없음 : forward로 처리
<jsp:forward page="second.jsp"></jsp:forward>
</body>
</html>