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
	//내장된 객체 9개중 하나 request 싱글톤
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
%>
<h1>당신이 입력한 정보는 아래와 같습니다.</h1>
<hr color="blue">
ID : <%= id %><br>
PW :  <%= pw %><br>
NAME :  <%= name %><br>
TEL :  <%= tel %><br>

</body>
</html>