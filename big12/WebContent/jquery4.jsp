
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
	var food = ["감자","고구마","양파"];
	// console.log(food[0]);
	// console.log(food[1]);
	// console.log(food[2]);
	for(var i = 0; i<food.length; i++){
		console.log(food[i]);
	}
	var food2 = [];
	for (var i= 0; i< 3; i++) {
		food2[i]= prompt("먹고 싶은 음식을 입력하세요.");
	}
	for(var i = 0; i<food2.length;i++){
		alert(food2[i]);
	}
})
</script>
</head>
<body>
</body>
</html>