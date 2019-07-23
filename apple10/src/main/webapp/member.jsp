<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert.do">
<h1>회원정보를 입력하시오.</h1>
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="text" name="pw"><br>
이름 : <input type="text" name="name"><br>
전화번호 : <input type="text" name="tel"><br>
<input type="submit" value="회원가입">
</form>
<br><hr>
<h1>아이디 검색</h1>
<form action="select.do">
아이디 : <input type="text" name="id"><br>
<input type="submit" value="검색하기"> 
</form>
<br><hr>
<a href="selectAll.do">전체 검색</a>
<a href="main.do">클라이언트측으로 연결</a>
</body>
</html>