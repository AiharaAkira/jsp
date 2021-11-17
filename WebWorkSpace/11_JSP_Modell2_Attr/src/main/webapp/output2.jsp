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
	Result r = (Result) request.getAttribute("rr");
%>
	<h1>잔돈 계산</h1>
	<table>
		<tr>
			<td>상품가격 : <%=r.getPrice()%> </td>
		</tr>
		<tr>
			<td>지불한 돈 : <%=r.getMoney()%></td>
		</tr>
		<tr>
			<td> 잔돈 : <%=r.getExchange()%> </td>
		</tr>
		<tr>
			<td> <%=r.getSay()%>  </td>
		</tr>
	</table>
	버튼을 눌렀을때 output3.jsp
	1.모자를 때만 나오게
	2.모자른 금액을 안내
	<%if(r.getPrice() > r.getMoney()){
		int how = Math.abs(r.getPrice() - r.getMoney());
		%>
	<a href="output3.jsp?how=<%=how%>">
	<button>얼마 모자른데요?</button>
	</a>
	
	
	<button onclick="location.href='output3.jsp?how=<%=how%>'" >얼마 모자른데요?(js로하는 get요청)</button>
	
	<form action="output3.jsp" method="post">
		<input name="how" type="hidden" value="<%=how%>">
		<button>얼마 모자른데요?(post)</button>
	</form>
	
	<form action="output3.jsp" method="post">
		<button name="how" value="<%=how%>">얼마 모자른데요2?(post)</button>
	</form>
	
	<form action="NoMoney" method="post">
		<button name="how" value="<%=how%>">얼마 모자른데요 서블릿?(post)</button>
	</form>
	
	<form action="NoMoney" >
		<button name="how" value="<%=how%>">얼마 모자른데요 서블릿?(get)</button>
	</form>
	<%}//위에것들은 새로운 요청 	%>
	
</body>
</html>