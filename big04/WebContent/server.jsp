<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
<div id="d1">
	<table id="ta" border="1" bordercolor = "#f4424b">
	
	<tr>
		<td class="t1">아이디 :</td>
		<td class="t1">${param.id}</td>
	</tr>
	<tr>
		<td class="t2">비밀번호 :</td>
		<td class="t2">${param.pw}</td>
	</tr>
	<tr>
		<td class="t3">이름 : </td>
		<td class="t3">${param.name}</td>
	</tr>
	<tr>
		<td class="t4">전화번호 : </td>
		<td class="t4">${param.tel}</td>
	</tr>
	</table>
</div>
<div id="d2">
	<ul>
		<li>아이디</li>
		<li>비밀번호</li>
		<li>이름</li>
		<li>전화번호</li>
	</ul>
</div>
<div id="d3">

</div>
</body>
</html>