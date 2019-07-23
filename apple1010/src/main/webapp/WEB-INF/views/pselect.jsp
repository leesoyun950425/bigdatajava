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
	alert("하이루")
	var re = $("#num").val();
	var num = "gghh";
	$("#content").empty();
	$.ajax({
		url:"cinsert",
		data : {"num" : num,"content" : re}, //hashMap형태 - key, value
		success : function(result) {
			$("#content").append(result);
		}
	})
		
	})
	$.ajax({
		url : "cSelectAll",
		success : function(result) {
			$("#content").append(result);
		}
	})
})
</script>
</head>
<body>
<h1>상품의 상세 내용입니다.</h1>
<hr>
<table border="2" bordercolor="red">
	<tr height="50px">
		<td style="background-color: yellow">ID</td>
		<td style="background-color: green">NAME</td>
		<td style="background-color: green">PRICE</td>
		<td style="background-color: green">COMPANY</td>
		<td style="background-color: green">IMAGE</td>
	</tr>
	<tr height="100px">
		<td>${dto.id}</td>
		<td>${dto.name}</td>
		<td>${dto.price}</td>
		<td>${dto.company}</td>
		<td><img src="resources/img/3.jpg" style="height: 80px"></td>
	</tr>
</table>
	<hr color="pink">
	입력 : <input type="text" name="num" id="num"><input type="button" value="댓글 달기" id="btn">
	<hr color="pink">
	<div id="content"></div>
	
</body>
</html>