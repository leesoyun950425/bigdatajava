<%@page import="bean.NoticeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.NoticeDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	NoticeDAO dao = new NoticeDAO();
	dao.insert(dto);
%>
</body>
</html>