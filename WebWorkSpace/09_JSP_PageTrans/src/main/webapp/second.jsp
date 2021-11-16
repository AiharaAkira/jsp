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
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));

	int hab = a + b;
	request.setAttribute("ccc", hab);
	
	/*
		값
		(1) parameter
		html 에서 만든 값
		그자료형 String, String[]
		그런 값이 request 객체에 실려서 전송
		
		second에서 만든 c를 third로 가져가고 싶음
		//자동이동 시리즈 3개
		1.redirect - 그전의 값을 쓸필요가 없을때(홈페이지 개선중)
		//response.sendRedirect("third.jsp")
		
		2.forward
		//first에서 second로 넘어올때 요청한 정보를 third까지 넘겨줌
	*/
	//response.sendRedirect("third.jsp");
	RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
	rd.forward(request, response);
	//이건 쓰는 코드 
	//forard를 많이 쓰는데 first에서 second로 넘어온 request까지 third로 보내줌
	//redirect는 그냥 넘기는거
	//forward는 request에 값이 실려서 넘어오는건데 그 request를 같이 넘기 니까 third가 그값을 쓸 수 있음
	
	// 3. include(어떤 jsp속에 다른 jsp포함)
	//위치조절이 안됨(무조건 제일 위에)
	//위치 조절이 되는 include가 있음
	//rd.include(request, response);
	
	/*
		(2)attribute
		java에서 만든 값
		Object(객체)면 다 됨
		request객체에 실려서 전송
	*/
	%>
	<h1>second page</h1>
	a+b=<%=hab%>
	
	
</body>
</html>