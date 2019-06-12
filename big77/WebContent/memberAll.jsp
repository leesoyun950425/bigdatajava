<%@page import="bean.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
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
//dao중에서 전체리스트를 가지고 오는
//메소드를 호출
//반복문으로 테이블내에 tr태그내에 집어 넣는다.
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberDTO> list = dao.selectAll();
%>
<center>
	<table border="1" bordercolor="red" width="600">
	
		<tr align="center">
			<td>아이디</td>
			<td>패스워드</td>
			<td>이 름</td>
			<td>연락처</td>
		</tr>
		<% for(int i = 0; i<list.size(); i++){ %>
		<tr align="center">
			<td><a href=find.jsp?id=<%= list.get(i).getId() %>><%= list.get(i).getId() %></a></td>
			<td><%= list.get(i).getPw() %></td>
			<td><%= list.get(i).getName() %></td>
			<td><%= list.get(i).getTel() %></td>
		</tr>
		<%} %>
	</table>
</center>
</body>
</html>