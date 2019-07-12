<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/bear.gif">
<!-- 클라이언트가 요청하는 페이지 -->
<form action="loginCheck">
아이디 : <input type="text" name="id"><br>
패스워드 : <input type="text" name="pw"><br>
<input type="submit" value="서버로 전송">
</form>
</body>
</html>