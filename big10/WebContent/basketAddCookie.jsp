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
		String pid = request.getParameter("pId");
		String count = request.getParameter("count");
		
		Cookie cookie = new Cookie(pid,count);
		response.addCookie(cookie);
	%>
	<jsp:forward page="basketAddCookie2.jsp"></jsp:forward>
</body>
</html>