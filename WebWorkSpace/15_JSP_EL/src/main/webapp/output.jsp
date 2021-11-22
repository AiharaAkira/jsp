<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%//Result r = (Result) request.getAttribute("r"); 
	/*  
		.jsp에 자바를 쓰는 경우 
		1.값을 읽을 경우
		2.출력형식 때문에
		3.조건문, 반복문
		
		EL(Expresstion Language)
		1.값 읽을때
		2.연산자 사용 가능
		3.import 없어도 됨
		4.값이 없으면 넘어감
	
		EL로 - Parameter 읽기 : ${param.이름}
			-attribute읽기 : ${어트리뷰트 이름}
			-객체 읽기 : 		${이름.멤버변수}
		
		기본형[] or ArrayList<기본형> : ${이름[번호]}
						객체[]	   : ${이름[번호].멤버변수}	
		*/
	
	%>
	<%-- <form action="HC" method="post">
	
	이름 : <%=r.getName() %> <p>
	중간 : <%=request.getParameter("middle") %> <p>
	기말 : <%=request.getParameter("last")%> <p>
	평균 : <%=r.getAvg2()%> <p>
	등급 : <%=r.getGrade()%> <p>
	</form>
	<hr> --%>
		<form action="HC" method="post">
	
	이름 : ${param.name}  <p>
	중간 : ${param.middle}  <p>
	기말 : ${param.last} <p>
	평균 : ${r.avg2} <p>
	등급 : ${r.grade} <p>
	</form>
	<hr>
	a : ${a} <p></p>
	b : ${b}<p></p>
	c : ${c[2]} <p>
	d1 : ${d[0].name}<br>
	d2 : ${d[1].grade}<hr>
	e : ${e[0].name} <br>
	e : ${e[1].name} <br>
	e : ${e[2].name} <br>
	<hr>
	
</body>
</html>