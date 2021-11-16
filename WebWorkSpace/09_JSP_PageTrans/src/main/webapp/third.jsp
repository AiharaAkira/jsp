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
//정석
Object c = request.getAttribute("ccc");
Integer c2 = (Integer) c;
int c3 = c2.intValue();

//오토박싱, 언박싱
Object o = request.getAttribute("ccc");
int o2 = (Integer)o;

//위에꺼 한줄로 쓰기(쓰게 될 방식)
int ccc = (Integer)request.getAttribute("ccc");

int a = Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));
int hab = a + b;
%>
<h1>third page</h1>
<%=a%>+<%=b%>=<%=hab %>

<br> 합은<%=ccc %>
</body>
</html>