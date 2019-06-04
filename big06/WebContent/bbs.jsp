<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<h1>입력한 값</h1>
<hr color="pink">
	id : <%= dto.getId() %><br>
	title : <%= dto.getTitle() %><br>
	content : <%= dto.getContent() %><br>
	writer : <%= dto.getWriter() %><br>
</body>
</html>