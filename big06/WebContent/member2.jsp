<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문  -->
<%!
%>
<!--스크립트릿:자바코드가 들어가는 부분.(service())->지역변수! -->
<!-- 메소드 정의 할 수 없음.전역변수 사용 불가! -->
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String date = request.getParameter("date");
	String gender = request.getParameter("gender");
	String tel = request.getParameter("tel");
	String[] hobby = request.getParameterValues("hobby");
	String result = "";
	for(int i=0; i<hobby.length; i++){
		result = result + hobby[i] + " ";
	}
%>
<h1>입력하신 정보</h1>
<hr color="pink">
<!-- 표현식(Expression) -->
표현식 연산결과 출력 : <%= 100+200 %> <br>
아이디 : <%= id %><br>
비밀번호 : <%= pw %><br>
이름 : <%= name %><br>
생년월일 : <%= year %>년 <%= month %>월 <%= date %>일<br>
성별 : <%= gender %><br>
휴대전화 : <%= tel %><br>
취미 : <%= result %>
</body>
</html>