<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="AccountUpdateC" method="post" enctype="multipart/form-data">

			<img src="file/${sessionScope.accountInfo.u_profileImg}">		
			<div>프로필사진:<input name="u_profileImg" type="file" ></div>
			<div>아이디:<input name="u_id" type="text" value="${sessionScope.accountInfo.u_id}" readonly></div>
			<div>비번:<input name="u_pw" value="${sessionScope.accountInfo.u_pw}"></div>
			<div>비번 확인:<input name="u_pw_check" ></div>
			<div>이름:<input name="u_name" value="${sessionScope.accountInfo.u_name}"></div>
			<div>닉네임:<input name="u_nickName" value="${sessionScope.accountInfo.u_nickName}"></div>
		
			<div><button>정보수정</button></div>
			
		</form>
	</div>

</body>
</html>