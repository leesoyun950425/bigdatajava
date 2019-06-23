<%@page import="bean.InfoDTO"%>
<%@page import="bean.InfoDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.InfoDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	InfoDAO dao = new InfoDAO();
	InfoDTO dto2 = dao.select(dto);
	String title = dto2.getTitle();
	String link = dto2.getLink();
%>
	<%-- <title><%= title %></title> <%= title %> --%>
	<link><%= link %></link> 
</body>
</html>