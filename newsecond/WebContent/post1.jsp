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
		//댓글 불러오는 ajax
		$(document).ready();
		var alComment = $("#alComment").val().split(":");
		var count = 0;
		count = alComment.length;
		$("#count").val(count + "");
		for (var i = 0; i < alComment.length; i++) {
			if (i != 0) {
				$("#commentUl").append("<li>" + alComment[i] + "</li>");
			}
		}
		$("#commentDiv").css("height", (250 + count * 25) + "px");
		$("#commentVal").val($("#alComment").val());
		//댓글 추가하는 이벤트와 메소드
		$("#comment").click(function() {
			var com = $("#commentCon").val();
			var com1 = $("#commentVal").val();
			if (com != "") {
				count++;
				$("#commentUl").append("<li>" + com + "</li>");
				$("#commentDiv").css("height", (250 + count * 25) + "px")
				$("#count").val(count + "");
				if (com1 != "") {
					$("#commentVal").val(com1 + ":" + com);
					$(document).ready();
				} else {
					$("#commentVal").val(com);
					$(document).ready();
				}
				var comment = $("#commentVal").val();
				var content = $("#content").text();
				var time = $("#time").text();
				var name = $("#name").text();
				var title = $("#title").text();
				$.ajax({
					url : "commentAdd.jsp",
					data : {
						"comment" : comment,
						"content" : content,
						"time" : time,
						"name" : name,
						"title" : title
					},
					success : function(result) {
						console.log(result);
					}
				})
			}
		});
	});
</script>
</head>
<body>
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
				<li><a href="notice.jsp" id="menuLink"><img
						src="img/notice2.png" onmouseover="this.src='img/notice.png'"
						onmouseout="this.src='img/notice2.png'"></a></li>
				<li><a href="contact.jsp" id="menuLink"><img
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
		<%
			String name = (String)session.getAttribute("name");
			String pw = (String)session.getAttribute("password");
			if(name == null){
		%>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="login.jsp">로그인</a></li>
			<li class="nav-item"><a class="nav-link" href="signUp.jsp">회원가입</a></li>
		</ul>
		<%
			}else{
			%>
			<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="logout.jsp">로그아웃</a></li>
			</ul>
		<%	
			}
		%>
	</nav>

	<br>
	<br>
	<%
		String info = request.getParameter("info");
		String[] info2 = info.split(",");
		String[] fonts = info2[5].split(":");
	%>
	<div class="container"
		style="display: block; margin-left: auto; margin-right: auto;">
		<div class="row" style="">
			<div class="col-lg-8 col-md-10 mx-auto">
				<ul class="list-group list-group-flush">
					<li class="list-group-item"
						style="padding-top: 9px; padding-bottom: 9px;">
						<table>
							<tr>
								<td id="title" style="font: 17px 굴림; font-weight: bold;"><%=info2[0]%></td>
								<td
									style="padding-left: 10px; padding-right: 10px; font: 15px 굴림; color: #a1a1a1;">|</td>
								<td style="font: 15px 굴림;"><a style="color: #a1a1a1;"
									href="contact.jsp?index=0">■ 건의사항</a></td>
							</tr>
						</table>
					</li>
					<li class="list-group-item"
						style="padding-top: 7px; padding-bottom: 7px;">
						<table>
							<tr>
								<td style="font-size: 13px; padding-right: 10px;">작성자 :</td>
								<td id="name" style="padding: 0px; font-size: 14px"><%=info2[1]%></td>
								<td
									style="font-size: 12px; padding-right: 12px; padding-left: 12px; color: #a1a1a1;">|</td>
								<td style="font-size: 13px; padding-right: 20px;">날짜 :</td>
								<td id="time" style="font-size: 14px;"><%=info2[3]%></td>
							</tr>
						</table>
					</li>
					<li class="list-group-item">
						<table>
							<tr>
								<td id="content" height="250"
									style="font-size: '<%=fonts[1]%>'; font-family: '<%=fonts[0]%>';font-weight: '<%=fonts[2]%>'; text-align: '<%=fonts[3]%>';"><%=info2[2]%></td>
							</tr>
						</table>
					</li>
				</ul>
				<br>
				<div id="commentDiv"
					style="background: gray; border: 2px; width: 800px; height: 200px; position: relative;">
					<p>댓글</p>
					<ul id="commentUl" type="none">
					</ul>
					<div id="commentDiv">
						<input id="commentCon" type="text"
							style="margin-top: 80px; width: 600px; height: 60px; margin-left: 60px;">
						<input id="commentVal" type="hidden" value=""> <input
							type="hidden" value="0" id="count">
						<button id="comment" style="height: 60px;">작성완료</button>
						<input id="alComment" type="hidden" value="<%=info2[6]%>">
					</div>
				</div>
				<form action="deletePost.jsp">
					<input type="hidden" name="info" value="<%=info%>">
					<button type="submit">삭제</button>
				</form>
				<form action="updatePost.jsp">
					<button type="submit">수정</button>
				</form>
			</div>
		</div>
	</div>

	<!-- 챗봇 -->
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id)) {
				return;
			}
			js = d.createElement(s);
			js.id = id;
			js.src = "https:\/\/danbee.ai/js/plugins/frogue-embed/frogue-embed.min.js";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'frogue-embed'));
	</script>


	<div id="frogue-container" class="position-right-bottom"
		data-chatbot="dfe8c896-af87-4447-882e-bf1e2383f8ba" data-user="사용자ID"
		data-init-key="value"></div>
</body>
</html>