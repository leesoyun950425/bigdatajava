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
<jsp:useBean id="dto" class = "bean.MemberDTO"></jsp:useBean>
<!-- import+new -->
<!-- 
	import bean.MemberDTO;
	MemberDTO dto = new MemberDTO();
-->
<jsp:setProperty property="*" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	dao.insert(dto);
%>
회원가입신청이 완료되었습니다.
</body>
</html>