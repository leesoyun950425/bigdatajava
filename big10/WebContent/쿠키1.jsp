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
		
		Cookie cookie = new Cookie("hi","hello");
		response.addCookie(cookie);
		cookie.setMaxAge(0);

		Cookie cookie2 = new Cookie("subject","jsp");
		response.addCookie(cookie2);
		cookie2.setMaxAge(0);
	
		Cookie cookie3 = new Cookie("name","hong");
		response.addCookie(cookie3);
		cookie3.setMaxAge(0);
	%>
	<jsp:forward page="쿠키2.jsp"></jsp:forward>
</body>
</html>