<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.DBConnectionMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="bbsInsert">
	id : <input type="text" name="id"><br>
	title : <input type="text" name="title"><br>
	content : <input type="text" name="content"><br>
	user : <input type="text" name="uuser"><br>
	<input type="submit" value="서버로 전송">
</form>
</body>
</html>