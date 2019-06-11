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
	//post인 방식의 요청인 경우, 한글 처리를 따로 해주어야 함.
	request.setCharacterEncoding("utf-8");
	String find = request.getParameter("find");
%>
</body>
검색 요청된 스트링 : <%= find %>
</html>