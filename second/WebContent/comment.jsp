<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="main.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		/* 세션id가 null이면 */
		/* 	 $("#comment").click(function() {
		 alert("로그인 하고 작성해주세요!!");
		 })  */
		$("#btn").click(function() {
			var com = $("#comment").val();
			$(".commentIn").append(com);
			$(".commentIn").append($("#del"));

		})
	})
</script>
</head>
<body>
	<div class="commentIn" style="width: 1000px; height: 200px;">
		<table class="comment-tb">
			<tr>
				<td><img src="woman.png"></td>
				<td>aaa</td>
				<td>
					<%
						Calendar cal = Calendar.getInstance();
						String today;
						String str = (cal.get(Calendar.YEAR) + "").substring(2);
						today = str + "." + (cal.get(Calendar.MONTH) + 1) + "." + cal.get(Calendar.DATE);
					%>
					<%= today %>
				</td>
			</tr>
			<tr>
				<td>나는댓글</td>
			</tr>
		</table>
		<button type="button" id="del" style="margin-left: 500px;">삭제</button>
		<button type="button" id="up">수정</button>
	</div>
</body>
</html>