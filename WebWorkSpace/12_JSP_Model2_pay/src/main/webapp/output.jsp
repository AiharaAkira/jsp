<%@page import="com.cmw.main.Remain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Remain r = (Remain) request.getAttribute("r"); %>
	<form action="HC" method="post">
		<table>
			<tr>
				<td>번 돈 : <%=r.getEarn() %> </td>
			</tr>
			<tr>
				<td>쓴 돈 : <%=r.getSpend() %> </td>
			</tr>
			<tr>
				<td> 남은 돈 : <%=r.getResult() %> </td>
			</tr>
			
		</table>
	</form>
	
</body>
</html>