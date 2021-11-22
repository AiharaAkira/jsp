<%@page import="com.cmw.main.Reward"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%Reward r = (Reward) request.getAttribute("r"); %>
	
	<!--  ⏬ -->
	
		
		<div style="height: auto; width: 98%; border:5px solid black; margin:5px 5px; text-align:center; color:<%=r.getColor() %>; font-weight:bold; font-size:25px;"> 
		<div id="title" style="height: auto; width: 96%; border:5px solid black; margin:5px auto; background-color:<%=r.getColor() %>; font-size:30px; color:white; ">변환결과</div>
		<div id="result" style="width: 96%; font-size:30px; color:<%=r.getColor() %>;">
			<%=r.getuInput()%> <%=r.getDanwi1()%> 
			<br><br><br>
			⏬⏬⏬
			<br><br><br>
			<%= r.getResult() %> <%=r.getDanwi2()%> 
			</div>
			</div>
		
		
</body>
</html>