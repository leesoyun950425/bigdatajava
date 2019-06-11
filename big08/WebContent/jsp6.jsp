<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="jsp7.jsp" method="post"> <!-- get요청 단순한 요청은 get으로 주소값이 다보인다.주소뒤에 값이 다 따라간다. post는 안보임. -->
	아이디 : <input type="text" name="id"><br>
	패스워드 : <input type="text" name="pw"><br>
	<input type="submit" value="로그인 처리"><br>
</form>
</body>
</html>