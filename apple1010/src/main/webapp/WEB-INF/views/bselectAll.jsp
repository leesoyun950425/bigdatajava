<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="bDTO" items="${list}">
	아이디 : ${bDTO.id}<br>
	제목 : ${bDTO.title} <br>
	내용 : ${bDTO.content} <br>
	사용자 : ${bDTO.uuser} <br>
		<hr color="pink">
	</c:forEach>
</body>
</html>