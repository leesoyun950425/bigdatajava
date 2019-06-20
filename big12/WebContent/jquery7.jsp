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
	$("#form").submit(function(){
		var d = $(this).serialize(); //폼안에 있는거 자동으로 쿼리형태로 ex)"name":$("#name") key,value형태
		$.ajax({
			url:"member3.jsp",
			data : d,
			success:function(result){
				alert("ajax 통신 성공2!!");
				$("#result").text(result);
			}
		})
		return false;
	})
})
</script>
</head>
<body>
	<div id="result"></div>
	<form action="" id="form">
		아이디 : <input type="text" name="id">
		<button type="submit">AJAX통신</button>
	</form>
</body>
</html>