<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean> <!-- import와 new -->
<jsp:setProperty property="*" name="dto"/> <!-- 파라메터값을 받아서 get과 set메소드해줌 -->

<!-- 같은 역할 -->
<jsp:getProperty property="id" name="dto"/>
<br>
${dto.id}
<br>
<%= dto.getId() %>
</body>
</html>