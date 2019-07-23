<%@page import="com.itbank.mvc10.MemberDTO"%>
<%@page import="java.util.List"%>
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
<h1>검색한 리스트</h1>

<c:forEach var="mDTO" items="${list}"> 
아이디 :  <a href="select.do?id=${mDTO.id}">${mDTO.id}</a> <br>
비밀번호 : ${mDTO.pw} <br>
이름 : ${mDTO.name} <br>
전화번호 : ${mDTO.tel} <br>
<hr color="pink">
</c:forEach> 
</body>
</html>