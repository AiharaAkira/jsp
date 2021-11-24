<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>잔돈 계산</h1>
	<table>
		<tr>
			<td>상품가격 : ${rr.price} </td>
		</tr>
		<tr>
			<td>지불한 돈 : ${rr.money}</td>
		</tr>
		<tr>
			<td> 잔돈 : ${rr.exchange} </td>
		</tr>
		<tr>
			<td> ${rr.say}  </td>
		</tr>
	</table>
	버튼을 눌렀을때 output3.jsp
	1.모자를 때만 나오게
	2.모자른 금액을 안내<p>${how}원</p>
	<c:if test="${rr.price > rr.money}">
	
	<a href="attr/output3.jsp?how=${how} ">
	<button>얼마 모자른데요?</button>
	</a>
	
	
	<button onclick="location.href='attr/output3.jsp?how=${how}'" >얼마 모자른데요?(js로하는 get요청)</button>
	
	<form action="attr/output3.jsp" method="post">
		<input name="how" type="hidden" value="${how}">
		<button>얼마 모자른데요?(post)</button>
	</form>
	
	<form action="attr/output3.jsp" method="post">
		<button name="how" value="${how}">얼마 모자른데요2?(post)</button>
	</form>
	
	<form action="NoMoney" method="post">
		<button name="how" value="${how}">얼마 모자른데요 서블릿?(post)</button>
	</form>
	
	<form action="NoMoney" >
		<button name="how" value="${how}">얼마 모자른데요 서블릿?(get)</button>
	</form>
	</c:if>
	
</body>
</html>