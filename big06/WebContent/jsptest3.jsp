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
	String trip = request.getParameter("trip");
	String count = request.getParameter("count");
	int c1 = Integer.parseInt(count);
	if(c1<3){
		out.print(trip+"을 더 갈수도 있겠군요");
	}else{
		out.print(trip+"을 그만 가셔야겠군요.");
	}
%>
</body>
</html>