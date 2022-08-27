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
		<form action="SignUpC" method="post" enctype="multipart/form-data">
		
			<div>아이디:<input name="u_id"></div>
			<div>비번:<input name="u_pw"></div>
			<div>비번 확인:<input name="u_pw_check"></div>
			<div>이름:<input name="u_name"></div>
			<div>닉네임:<input name="u_nickName"></div>
			<div>프로필사진:<input name="u_profileImg" type="file"></div>
			<div><input name="u_typeOfManager" type="hidden" value="0"></div>
		
			<div><button>회원가입</button></div>
			
		</form>
	</div>

</body>
</html>