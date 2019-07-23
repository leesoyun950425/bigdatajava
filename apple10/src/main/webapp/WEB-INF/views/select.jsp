<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	var id = $("#id").val();
	$.ajax({
		url : "replyselect.do",
		data : {
			"id" : id
		},
		success : function(result) {
			$("#div").append(result)
		}
	})
	$("#form").submit(function() {
		var d = $(this).serialize()
		$.ajax({
			url : "replyInsert.do",
			data : d,
			success : function(result) {
				alert(result)
				$("#div").append(result)
			}
		})
		return false;
	})
})
</script>
</head>
<body>
<h1>검색한 아이디 정보</h1>
아이디 : ${dto.id} <br>
<input type="hidden" value="${dto.id}" id="id">
비밀번호 : ${dto.pw} <br>
이름 : ${dto.name} <br>
전화번호 : ${dto.tel} <br>
<hr>
<form id="form">
	댓글>><input type="text" name="content">
	<input type="hidden" name="id" value="${dto.id}">
	<input type="submit" value="댓글달기">
</form>
<div id="div"></div>
</body>
</html>