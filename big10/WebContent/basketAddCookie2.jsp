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
		Cookie[] cookies = request.getCookies();
	
		for(int i = 1; i < cookies.length; i++){
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			if(!name.equals("JSESSIONID")){
				out.write("상품 이름 " + name + ","+"상품 개수"+value+"<br>");
			}
			out.write("<hr>");
		}
	%>
</body>
</html>