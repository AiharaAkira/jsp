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
	<%
	Result r = (Result)request.getAttribute("r"); 
	%>
	
	<form action="" >
	<table>
		<tr>
			<td>이름: <%=r.getName() %> </td>
		</tr>
		<tr>
			<td>아이디: <%=r.getId() %> </td>
		</tr>
		<tr>
			<td>비밀번호: <%=r.getPw() %> </td>
		</tr>
		<tr>
			<td>비밀번호 확인: <%=r.getPwOk() %> </td>
		</tr>
		
	</table>
	
	</form>
	
	<form action="plusBirth" method="post">
			<div>생일연도<input name="birth"></div>
			<div><button>확인</button> </div> 
			 
		
	</form>
	
</body>
</html>