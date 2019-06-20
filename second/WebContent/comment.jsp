<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	/* 세션id가 null이면 */
	/* $("#comment").click(function() {
		alert("로그인 하고 작성해주세요!!");
	}) */
	$("#btn").click(function() {
		var com = $("#comment").val();
		$(".commentIn").append(com+"<br>"+$("#del").html());
	})
})
</script>
</head>
<body>
	<div class="commentIn">
	</div>
	<div class="comment_div" style="width: 750px; height: 100px; background: #e8e8e8">
		<table class="comment-tb">
			<tr>
				<td><textarea rows="5" cols="100" name="comment" id="comment" ></textarea></td>
				<td><button type="button" id="btn" style="height: 70px; width: 50px; background: #ebf0f4">등록</button></td>
			</tr>
		</table>
		<button type="button" id="del">삭제</button>
		<button type="button" id="up">수정</button>
	</div>
</body>
</html>