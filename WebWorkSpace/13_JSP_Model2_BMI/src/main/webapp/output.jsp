<%@page import="com.cmw.main.Status"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Ma+Shan+Zheng&family=Nanum+Pen+Script&display=swap"
	rel="stylesheet">
</head>
<body id="bg">

	<%
	Status s = (Status) request.getAttribute("s");
	%>
	<form id="outline" action="index.html" method="post">
		<table id="form">
			<tr>
				<td id="title" colspan="2">BMI 결과</td>
			</tr>
			<tr>
				<td class="tdText">사진</td>
				<td><img src="img/<%=s.getPhoto()%>" width="200px"></td>
			</tr>
			<tr>
				<td class="tdText">이름</td>
				<td class="tdText"><%=s.getName()%></td>
			</tr>
			<tr>
				<td class="tdText">키</td>
				<td class="tdText"><%=s.getHeight()%></td>
			</tr>
			<tr>
				<td class="tdText">체중</td>
				<td class="tdText"><%=s.getWeight()%></td>
			</tr>
			<tr>
				<td class="tdText">BMI</td>
				<td class="tdText"><%=s.getBmi()%></td>
			</tr>
			<tr>
				<td class="tdText">결과</td>
				<td class="tdText"><%=s.getResult()%></td>
			</tr>


			<tr>
				<td colspan="2"><button id="btn">돌아가기</button></td>
			</tr>

		</table>
	</form>


</body>
</html>