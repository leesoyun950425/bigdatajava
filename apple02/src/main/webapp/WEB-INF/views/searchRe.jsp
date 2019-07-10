<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1 bordercolor="red">
	<tr>
	<td>검색한 결과</td>
	</tr>
	<tr>
		<td>${param.id}</td>
	</tr>
	<tr>
		<td>${param.name}</td>
	</tr>
	<tr>
		<td>${param.price}</td>
	</tr>
	<tr>
		<td>${param.mail}</td>
	</tr>
</table>
</body>
</html>