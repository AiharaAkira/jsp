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
	String color="red";
	
	String danwi1="";
	String danwi2="";
	double uInput = Double.parseDouble(request.getParameter("uInput"));
	String unit = request.getParameter("unit");
	double result = (uInput* 0.393701);
	
	if(unit.equals("cm")){
		color="red";
		result = (uInput* 0.393701);
		danwi1="cm";
		danwi2="inch";
	}else if(unit.equals("m")){
		color="blue";
		result = (uInput* 0.3025);
		danwi1="m2";
		danwi2="평";
	}else if(unit.equals("f")){
		color="yellow";
		result = ((uInput-32)*5/9);
		danwi1="F";
		danwi2="C";
	}else if(unit.equals("km")){
		color="green";
		result = (uInput* 0.621371);
		danwi1="km/h";
		danwi2="mi/h";
	}
	String result2 = String.format("%.1f", result);
	
	%>
	<!--  ⏬ -->
	
		
		<div style="height: auto; width: 98%; border:5px solid black; margin:5px 5px; text-align:center; color:<%=color %>; font-weight:bold; font-size:25px;"> 
		<div id="title" style="height: auto; width: 96%; border:5px solid black; margin:5px auto; background-color:<%=color %>; font-size:30px; color:white; ">변환결과</div>
		<div id="result" style="width: 96%; font-size:30px; color:<%=color %>;">
			<%=uInput%> <%=danwi1%> 
			<br><br><br>
			⏬⏬⏬
			<br><br><br>
			<%= result2 %> <%=danwi2%> 
			</div>
			</div>
		
		
</body>
</html>