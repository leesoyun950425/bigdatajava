<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
요청 방식 : <%= request.getMethod() %><br>
요청 스트링 : <%= request.getQueryString() %><br>
요청된 길이 : <%= request.getContentLength() %><br>
요청된 타입 : <%= request.getContentType() %>
</body>
</html>