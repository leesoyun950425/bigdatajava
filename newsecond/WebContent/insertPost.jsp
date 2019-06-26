<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		if ($("#nullDoctor").val() == "true") {
			$("#doctor").empty();
		} else {
		}
		$("#font_familySel").on("change", function() {
			$("textarea").css("font-family", $(this).val());
		})
		$("#font_size").on("change", function() {
			$("textarea").css("font-size", $(this).val());

		})
		$("#font_weight").on("change", function() {
			$("textarea").css("font-weight", $(this).val());

		})
		$("#font").on("change", function() {
			$("textarea").css("text-align", $(this).val());

		})
		/* $("#filefile").change(function() {
			$("#filename").val($("#filefile").val());
			var s2 = $("#filename").val();
			var attr = s2.substring(s2.length-3);
			if(attr=="png"||attr=="jpg"||attr=="jpeg"){
				var textContent = $("#content").text().html();
				alert(textContent);
				$("#content").append($("#content").html("<img src="+$("#filename").val()+">"));
				alert($("#content").html())
			}
		}) */
		/* $("#subBtn").click(function() {
			$("#content2").val($("#content").text());
			if($("#title").val().trim()!=""&& $("#content").text().trim()!=""){
			$("#filesub").submit();
			$("#content").find("img").remove();//하나로 합치고 dto는 리퀘스트객체로 수동으로.
			alert("글쓰기가 완료되었습니다.");
			}
			else{
				alert("제목과 내용 둘 다 입력해주세요")
				return false;
			}
		})*/
	})
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
	<a href="homemain.jsp"><img src="img/logo.jpeg"
		style="width: 300px; height: 150px; text-align: center; display: block; margin: 0px auto;"></a>
	<!-- 상단 메뉴바 -->
	<div id="top">
		<nav id="topMenu">
			<ul>
				<li><a href="homemain.jsp" id="menuLink"><img
						src="img/home2.png" onmouseover="this.src='img/home.png'"
						onmouseout="this.src='img/home2.png'"></a></li>
				<li><a href="my.jsp" id="menuLink"><img src="img/my2.png"
						onmouseover="this.src='img/my.png'"
						onmouseout="this.src='img/my2.png'"></a></li>
				<li><a href="resa.jsp" id="menuLink"><img
						src="img/resa2.png" onmouseover="this.src='img/resa.png'"
						onmouseout="this.src='img/resa2.png'"></a></li>
				<li><a href="notice.jsp?index=0" id="menuLink"><img
						src="img/notice2.png" onmouseover="this.src='img/notice.png'"
						onmouseout="this.src='img/notice2.png'"></a></li>
				<li><a href="contact.jsp?index=0 " id="menuLink"><img
						src="img/contact2.png" onmouseover="this.src='img/contact.png'"
						onmouseout="this.src='img/contact2.png'"></a></li>
				<li><a href="chart.jsp" id="menuLink"><img
						src="img/chart2.png" onmouseover="this.src='img/chart.jpg'"
						onmouseout="this.src='img/chart2.png'"></a></li>
			</ul>
		</nav>
	</div>
	<br>
	<br>
	<br>
	<br>
	<!-- 로그인 nav바 -->
	<nav
		class="navbar navbar-expand-sm bg-success navbar-dark justify-content-center">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">로그인</a></li>
			<li class="nav-item"><a class="nav-link" href="#">회원가입</a></li>
		</ul>
	</nav>

	<br>
	<!-- 글쓰기 -->
	<div class="notice_write">
		<h1 align="center">게시판 글쓰기</h1>
		<form method="get" action="insertPostRe.jsp">
			<center>
				제목: <input class="form-control" type="text" width="250" size="80"
					id="title" name="title" style="margin-bottom: 10px;"><br>
				<select id="font_familySel" name="font_family"
					style="margin-bottom: 10px;">
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
				<textarea class="form-control" rows="20" cols="50" placeholder="내용을 입력해주세요."
					name="content" id="content" style="width: 773px; height: 566px;"></textarea>
				<!-- <div id="content"  contentEditable="true" style="text-align:left; overflow-x:auto; width:500px; height: 300px; border: solid; 1px; margin: 20px; line-height: 20px; "> </div> -->
				<!-- 넘길내용 -->
				<!-- <input type="hidden"name="content" id="content2"> -->
				<br>
				<%
					String s1 = request.getParameter("nullDoctor");
				%>
				<input id="nullDoctor" type="hidden" value="<%=s1%>">
				<div id="doctor" style="margin-bottom: 10px;">
					병원 : <select name="hospital"
						class="browser-default custom-select custom-select-sm sm-1">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select> 담당의 : <select name="doctor"
						class="browser-default custom-select custom-select-sm sm-1">
						<option value="a">a</option>
						<option value="b">b</option>
						<option value="c">c</option>
					</select><br>
				</div>
				<button id="subBtn" type="submit" class="btn btn-success">글쓰기
					완료</button>
			</center>
		</form>
	</div>
</body>
</html>