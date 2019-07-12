<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
	<input type="text" value="${result.id}" name="id"><br>
	<input type="text" value="${result.title}" name="title"><br>
	<input type="text" value="${result.content}" name="content"><br>
	<input type="text" value="${result.uuser}" name="uuser"><br>
	<input type="submit" value="수정하기">
</form>
</body>
</html>