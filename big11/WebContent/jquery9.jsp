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
			$("img").attr("width",200);
			$("img").attr("height",200);
			$("img").css("border","2px dotted red");
			$("img").removeAttr("border");
		});
	});
</script>
</head>
<body>
	<button>나를 눌러요.</button>
	<img src="010.jpg">
</body>
</html>