<%@page import="bean.MemberDTO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<!-- property : 변수  name : usebean에서 id만든 이름이랑 일치하게.-->
<!-- 액션태그 -->
<jsp:useBean id="dto" class = "bean.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<% /* 스크립트릿 */
	//자동import 컨트롤+쉬프트+m
	MemberDAO dao = new MemberDAO();
	MemberDTO dto2 = dao.select(dto);
%>
검색결과입니다.
<hr>
<!-- 표현식(Expression) -->
<form action="update.jsp">
	수정할 ID : <input type="text" name="id" value="<%= dto2.getId() %>" readonly="readonly"><br>
	수정할 PW : <input type="text" name="pw" value="<%= dto2.getPw() %>"><br>
	수정할 NAME : <input type="text" name="name" value="<%= dto2.getName() %>"><br>
	수정할 TEL : <input type="text" name="tel" value="<%= dto2.getTel() %>"><br>
	<button type="submit" class="btn btn-primary">수정하기</button>
</form>
</body>
</html>