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
	$("#font_familySel").on("change",function() {
		$("textarea").css("font-family",$(this).val());
	})
	$("#font_size").on("change",function() {
		$("textarea").css("font-size",$(this).val());
	
	})
	$("#font_weight").on("change",function() {
		$("textarea").css("font-weight",$(this).val());
	
	})
	$("#font").on("change",function() {
		$("textarea").css("text-align",$(this).val());
	
	})
})
</script>
</head>
<body>
	<!-- 상단 메뉴바 -->
	<div align="center">
		<a href="home.jsp"><img class="logo" src="main.png" align="center"></a>
		<div class="nav_bar">
			<table>
				<tr height="10px">
					<td class="menu"><a href="resa.jsp">예약</a></td>
					<td class="menu"><a href="notice.jsp">게시판</a></td>
					<td class="menu"><a href="my.jsp">마이페이지</a></td>
					<td class="menu"><a href="notice2.jsp">고객센터</a></td>
				</tr>
			</table>
		</div>
	<!-- 글쓰기 -->
	<div class="notice_write">
		<h1>게시판 글쓰기</h1>
		<form action="noticeWriteRe.jsp">
			제목: <input type="text" placeholder="제목을 입력해주세요." width="300"
				size="80" name="title"> <br> 
				글꼴 : 
			<select id="font_familySel" name="font_family">
				<option class="font_family" id="font_family1" value="dotum">돋움체</option>
				<option class="font_family" id="font_family2" value="궁서체">궁서체</option>
				<option class="font_family" id="font_family3" value="gulim">굴림체</option>
				<option class="font_family" id="font_family4" value="cursive">cursive</option>
				<option class="font_family" id="font_family5" value="arial">arial</option>
				<option class="font_family" id="font_family6" value="serif">serif</option>
			</select> 
			크기 : <select id="font_size" name="font_size">
				<option id="font_size1" value="9px">9pt</option>
				<option id="font_size2" value="12px">12pt</option>
				<option id="font_size3" value="18px">18pt</option>
				<option id="font_size4" value="24px">24pt</option>
			</select> 
			굵기 : <select id="font_weight" name="font_weight"> 
				<option value="normal">보통</option>
				<option id="font_weight1" value="bold">굵게</option>
			</select> 
			정렬 : <select id ="font" name="font">
				<option value="left">왼쪽</option>
				<option value="center">가운데</option>
				<option value="right">오른쪽</option>
			</select> <br> 
			내용 :
			<textarea rows="20" cols="50" placeholder="내용을 입력해주세요."
				name="content" id="content" ></textarea>
			<br> 
			병원 : <select name="hospital">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
			</select> 
			담당의 : <select name="doctor">
				<option value="a">a</option>
				<option value="b">b</option>
				<option value="c">c</option>
			</select> 
			<br>
			<button type="submit">글쓰기 완료</button>
		</form>
	</div>

</body>
</html>