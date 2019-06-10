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
<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	dao.update(dto);
%>
회원수정 신청이 완료되었습니다.
검색해보히겠습니까?<a href=find.jsp?id=<%=dto.getId()%>>수정된 내용 확인해주기.</a>
</body>
</html>