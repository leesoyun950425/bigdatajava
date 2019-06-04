<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문 전역변수여서 자동초기화 -->
<%!
	String name;
	public String test(){
		return 1000+"원";
	}
%>
<!-- 스크립트릿 지역변수여서 초기화 해줘야함-->
<%
String test="";
	/* PrintWriter out = new PrintWriter(); */
	out.print(100+200+"<br>");
%>
<!-- 표현식 -->
<%= 100+200 %><br>
<%= name %>,<%= test %>
<%= test() %>
</body>
</html>