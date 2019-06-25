<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="notice_write">
		<h1>게시판 글쓰기</h1>
		<form method="get" action="insertPostRe.jsp">

			제목: <input type="text" width="300" size="80" id="title" name="title"><br>
			<select id="font_familySel" name="font_family">
				<option value="dotum">글꼴</option>
				<option class="font_family" id="font_family1" value="dotum">돋움체</option>
				<option class="font_family" id="font_family2" value="궁서체">궁서체</option>
				<option class="font_family" id="font_family3" value="gulim">굴림체</option>
				<option class="font_family" id="font_family4" value="cursive">cursive</option>
				<option class="font_family" id="font_family5" value="arial">arial</option>
				<option class="font_family" id="font_family6" value="serif">serif</option>
			</select><select id="font_size" name="font_size">
				<option value="9px">크기</option>
				<option id="font_size1" value="9px">9pt</option>
				<option id="font_size2" value="12px">12pt</option>
				<option id="font_size3" value="18px">18pt</option>
				<option id="font_size4" value="24px">24pt</option>
			</select><select id="font_weight" name="font_weight">
				<option value="normal">굵기</option>
				<option value="normal">보통</option>
				<option id="font_weight1" value="bold">굵게</option>
			</select><select id="font" name="font">
				<option value="left">글꼴</option>
				<option value="left">왼쪽</option>
				<option value="center">가운데</option>
				<option value="right">오른쪽</option>
				<!-- 파일이름들어가는공간 -->
				<!-- <input type="hidden" value="" id="filename" name = "filename"> -->
			</select> <br>
			<textarea rows="20" cols="50" placeholder="내용을 입력해주세요."
				name="content" id="content" style="width: 773px; height: 566px;"></textarea>
			<!-- <div id="content"  contentEditable="true" style="text-align:left; overflow-x:auto; width:500px; height: 300px; border: solid; 1px; margin: 20px; line-height: 20px; "> </div> -->
			<!-- 넘길내용 -->
			<!-- <input type="hidden"name="content" id="content2"> -->
			<br>
			<%
				String s1 = request.getParameter("nullDoctor");
			%>
			<input id="nullDoctor" type="hidden" value="<%=s1%>">
			<div id="doctor">
				병원 : <select name="hospital">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
				</select> 담당의 : <select name="doctor">
					<option value="a">a</option>
					<option value="b">b</option>
					<option value="c">c</option>
				</select><br>
			</div>
			<button id="subBtn" type="submit">글쓰기 완료</button>
		</form>
	</div>
</body>
</html>