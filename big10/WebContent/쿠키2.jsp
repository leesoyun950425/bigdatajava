<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>JSESSIONID,6BEC41FBC65E3A977A015D05DF976E04
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	for(Cookie c : cookies){
		if(!(c.getName().equals("JSESSIONID"))){
			String name = c.getName();
			String val = c.getValue();
			out.print(name+","+val+"<br>");
			out.write("<hr>");
		}
	}
%>
</body>
</html>