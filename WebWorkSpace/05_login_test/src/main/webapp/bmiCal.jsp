<%@page import="com.oreilly.servlet.multipart.FileRenamePolicy"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bmi계산기</title>
<link rel="stylesheet" href="style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Ma+Shan+Zheng&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
</head>
<body id="bg">


	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	//파일경로
    String path = request.getSession().getServletContext().getRealPath("img");
	
	
	MultipartRequest mr = 
	new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());

	//파일 업로드 
	String photo = mr.getFilesystemName("photo");
	
	String name = mr.getParameter("name");
	double height = Double.parseDouble(mr.getParameter("height"));
	if (height < 10) {
		height = height * 100;
	}
	String heightR = String.format("%.1f", height);
	double weight = Double.parseDouble(mr.getParameter("weight"));
	String weightR = String.format("%.1f", weight);
	double bmi = bmiCalcul(height, weight);
	String bmiR = String.format("%.2f", bmi);
	String result = result(bmi);
	%>

	<%!
	public double bmiCalcul(double height, double weight) {
		if (height < 10) {
			height = height * 100;
		}
		height = height * 0.01;
		return (weight / (height * height));
	}

	public String result(double bmi) {
		if (bmi >= 25) {
			return "비만";
		} else if (bmi >= 23) {
			return "과체중";
		} else if (bmi >= 18.5) {
			return "정상";
		} else {
			return "저체중";
		}
	}
	%>

	<form id="outline" action="index.html" method="post">
		<table id="form" >
			<tr>
				<td id="title" colspan="2">BMI 결과</td>
			</tr>
			<tr>
				<td class="tdText">사진</td>
				<td><img src="img/<%=photo %>" width="200px"> </td>
			</tr>
			<tr>
				<td class="tdText">이름</td>
				<td class="tdText"><%=name%></td>
			</tr>
			<tr>
				<td class="tdText">키</td>
				<td class="tdText"><%=heightR%></td>
			</tr>
			<tr>
				<td class="tdText">체중</td>
				<td class="tdText"><%=weightR%></td>
			</tr>
			<tr>
				<td class="tdText">BMI</td>
				<td class="tdText"><%=bmiR%></td>
			</tr>
			<tr>
				<td class="tdText">결과</td>
				<td class="tdText"><%=result%></td>
			</tr>


			<tr>
				<td  colspan="2"><button id="btn">돌아가기</button></td>
			</tr>

		</table>
	</form>


</body>
</html>