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
		$("#btn").click(function() {
			var t = $("#inputText").val();
				$("#con").append(t+"<br>");
		}) 
	});
</script>
</head>
<body>
	입력한 값 : <input type="text" id="inputText">
	<button id="btn">추가</button><br>
	----------------------------------------------
	<div id="con">
	
	</div>
</body>
</html>