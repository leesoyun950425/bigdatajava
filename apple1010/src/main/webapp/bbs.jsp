<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 입력</h1>
<form action="binsert">
아이디 : <input type="text" name="id"><br>
제목 : <input type="text" name="title"><br>
내용 : <input type="text" name="content"><br>
사용자 : <input type="text" name="uuser"><br>
<input type="submit" value="입력">
</form>
<h1>게시판 수정</h1>
<form action="bupdate">
수정할 내용 : <input type="text" name="content"><br>
아이디 선택: <input type="text" name="id"><br>
<input type="submit" value="수정">
</form>
<h1>게시판 삭제</h1>
<form action="bdelete">
삭제할 아이디 : <input type="text" name="id"><br>
<input type="submit" value="삭제">
</form>
<h1>아이디 검색</h1>
<form action="bselect">
검색할 아이디 : <input type="text" name="id"><br>
<input type="submit" value="검색">
<hr>
<a href="bselectAll">전체 검색</a>

</form>
</body>
</html>