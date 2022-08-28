<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${sessionScope.accountInfo.u_nickName} 로그인!! 
<button type="button" onclick="location.href='LogOutC'">LogOut</button>
<button type="button" onclick="location.href='AccountUpdateC'">정보수정</button>
<button type="button" onclick="location.href='AccountDeleteC'">회원탈퇴</button>
</body>
</html>