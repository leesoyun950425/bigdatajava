<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 방식 : <%= request.getScheme() %> <br>
	<%= request.getServerName() %><br>
	서버 IP : <%= request.getLocalAddr()%><br>
	톰킷 포트 : <%= request.getServerPort()%><br>
	브라우저 포트 : <%= request.getRemotePort()%><br>
	클라이언트 주소 : <%= request.getRemoteHost()%><br>
	<%= request.getRemoteAddr()%><br>
	<hr>
	요청 한 주소 : <%= request.getRequestURI() %><br>
	<%= request.getRequestURL() %><br>
	<%= request.getContextPath() %>
</body>
</html>