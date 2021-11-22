<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<td>상품가격 : ${rr.price}  </td>
		</tr>
		<tr>
			<td>지불한 돈 : ${rr.money}</td>
		</tr>
		<tr>
			<td> 잔돈 : ${rr.exchange} </td>
		</tr>
		<tr>
			<td> ${rr.say}</td>
		</tr>
	</table>
</body>
</html>