<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>당신의 나이: ${birth}살</h1>
	<!-- 19살이 넘으면 어서오세요 미만이면 안녕 
		저런거 하려면 if 문이 필요한데
		
		CustomTag
		1. JSP 표준액션태그(정품):include
		2.CustomTag(사제품):말이 그렇다는 거지 그냥 기본으로 생각
		
		JSTL (JSP Standard Tag Library)
		.jar mvn
		
		core - if, for
		
	-->

	<%-- 	<c:if test="${birth > 19}">
	<h1>Hello Hutao!</h1>
	</c:if> --%>

	<!-- if, else if -->

	<c:choose>
		<c:when test="${birth > 19}">
			<h1>Hello Hutao!</h1>
		</c:when>
		<c:when test="${birth > 10}">
			<h1>Hello Raiden!</h1>
		</c:when>
		<c:otherwise>
			<h1>Hello Eura!</h1>
		</c:otherwise>
	</c:choose>

	<hr>
	<!-- 단점 : 역순이 안됨 (step에 음수 x) -->
	<c:forEach var="a" begin="1" end="${birth}" step="2">
		${a}
	</c:forEach>
	<hr>
	<c:forEach var="c" items="${ar }">
		${c}
	</c:forEach>
	<hr>

	<!-- 게시판 -->
	<c:forEach var="m" items="${menus}">
	${m.name}
	${m.price}원
	</c:forEach>

	<!-- 위에 저걸 테이블 구조에 잘 담으면 게시판 -->

	<table>
		<tr>
			<td>메뉴</td>
			<td>가격</td>
		</tr>
		<c:forEach var="m" items="${menus}">
		<tr>
		<td>
		${m.name}
		</td>
		<td>
		${m.price}원
		</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>