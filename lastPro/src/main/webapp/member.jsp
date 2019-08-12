<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/member.js"></script>
</head>
<body>
<form action="insert">
	아이디 : <input type="text" id="id" name="id"><input type="button" id="checkId" value="중복확인"><br>
	비밀번호 : <input type="text" name="pw"><br>
	이름 : <input type="text" name="name"><br>
	전화번호 : <input type="text" name="tel"><br>
	이메일 : <input type="text" name="email"><br>
	생년월일 : <input type="text" name="birth"><br>
	<input type="submit" id="sign" value="회원가입" disabled="disabled">
</form>
</body>
</html>