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
		$("button").click(function() {
			$(":checkbox").attr("checked",true);
		});
	});
</script>
</head>
<body>
	<input type="checkbox" value="감자">감자<br>
	<input type="checkbox" value="고구마">고구마<br>
	<input type="checkbox" value="양파">양파<br>
	<input type="checkbox" value="카레">카레<br>
	<input type="checkbox" value="호박">호박<br>
	<button >나를 눌러요.</button>
</body>
</html>