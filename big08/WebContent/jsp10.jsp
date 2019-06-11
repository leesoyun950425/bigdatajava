<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="jsp11.jsp" method="post"> <!-- default가 get요청 -->
쿼리스트링<input type="text" name="find" value="자동차"><br>
<input type="submit" value="서버로 전송">
</form>
</body>
</html>