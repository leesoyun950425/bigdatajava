
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
	$("#data").load("2012-02-02.txt");
	$("#button").click(function(){
		var date = $("#date").val().length;
		console.log(date);
		if(date<1){
			alert("날짜를 입력해주세요!");
			return false;
		}else{
			alert("당신이 입력한 날짜는 "+ $("#date").val());
		}
		$("#content").val($("#data").text());
		$("#form").submit();
	})
})
</script>
</head>
<body>
	<div id="data">
	</div>
	<form action="diary.jsp" id="form">
		날짜 : <input type="text" name="date" id="date"><br>
		제목 : <input type="text" name="title" id="title"><br>
		내용 : <input type="text" name="content" id="content"><br>
		<button type="button" id="button">서버로 전송</button>
	</form> 
</body>
</html>