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
			$("div").append("<img src=010.jpg width=100px height=100px>");
		})
	});
</script>
</head>
<body>
	<button>사진 추가</button>
	<div>
	</div>
</body>
</html>