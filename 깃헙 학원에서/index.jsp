<%@page import="bean.NoticeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.NoticeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="utf-8">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Clean Blog - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/clean-blog.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="imgtest.js"></script>
</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="index.html">Home</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="index.jsp?index=0">게시판</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="about.html">마이페이지</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="post.html">정보</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="contact.jsp?index=0">고객센터</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Header -->
	<!-- 사진 슬라이드 -->
	<header class="masthead" style="background-image: url('back.png')">
		<div class="slide">
			<ul class="slide_ul">
				<li><a href="#"><img src="hosimg1.png" alt="dane"></a></li>
				<li><a href="#"><img src="hosimg2.png" alt="dane"></a></li>
				<li><a href="#"><img src="hosimg3.png" alt="dane"></a></li>
				<li><a href="#"><img src="hosimg4.png" alt="dane"></a></li>
				<li><a href="#"><img src="hosimg5.png" alt="dane"></a></li>
				<li><a href="#"><img src="hosimg6.jpg" alt="dane"></a></li>
				<li><a href="#"><img src="hosimg7.jpg" alt="dane"></a></li>
			</ul>
		</div>
	</header>

	<jsp:useBean id="dto" class="bean.NoticeDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" />

	<!-- Main Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-md-10 mx-auto">
				<hr>
				<ul class="list-group list-group-flush">
					<li class="list-group-item"
						style="padding-bottom: 3px; padding-top: 3px;">
						<table>
							<tr>
								<td class="noti" align="center">제목</td>
								<td class="noti" align="center">작성자</td>
								<td class="noti">시간</td>
							</tr>
						</table>
					</li>
					<%!int i;%>
					<%
						NoticeDAO dao = new NoticeDAO();
						ArrayList<NoticeDTO> list = dao.selectAll();
						i=Integer.parseInt(request.getParameter("index"));
						NoticeDTO dto2 = null;
						while (i < list.size()) {
							dto2 = list.get(i);
							String info = dto2.toString();
					%>

					<li class="list-group-item"
						style="padding-bottom: 3px; padding-top: 3px;">
						<table>
							<tr>
								<td><%=i + 1%></td>
								<td><a href="post1.jsp?info=<%= info %>"><%=dto2.getTitle()%></a></td>
								<td><%=dto2.getName()%></td>
								<td><%=dto2.getTime()%></td>
							</tr>
						</table>
					</li>

					<%
						i++;
							if(i % 10 == 0 && i != 0){
								break;
							}
						}
					%>

				</ul>
				<div class="col-lg-4 col-md-10 mx-auto">
					<ul class="pagination pagination-sm">
						<li class="page-item"><a class="page-link" href="#">Previous</a></li>
						<li class="page-item"><a class="page-link" href="#">1</a></li>
						<%
							if(list.size() + 1 % 10 !=0 && list.size() !=0 && list.size()>10){
								int pageNum = list.size()+1 / 10;
								int index;
								for(index = 1; index <= pageNum; index++){
						%>
						<li class="page-item"><a class="page-link" href="#"><%= index + 1 %></a></li>
						<%
							}
							}%>
						<li class="page-item"><a class="page-link" href="#">Next</a></li>	
					</ul>
				</div>
			</div>
		</div>
		<hr>
		<a href="noticeWrite.jsp">글쓰기</a>

		<!-- 로그인 폼 -->
		<div id="top">
			<ul>
				<li><a href="index.html">Home</a></li>
				<li><a href="about.html">마이페이지</a></li>
				<li><a href="post.html">정보</a></li>
				<li><a href="contact.html">게시판</a></li>
			</ul>
		</div>

		<!-- Footer -->
		<footer>
			<div class="container">
				<div class="row">
					<div class="col-lg-8 col-md-10 mx-auto">
						<ul class="list-inline text-center">
							<li class="list-inline-item"><a href="#"> <span
									class="fa-stack fa-lg"> <i
										class="fas fa-circle fa-stack-2x"></i> <i
										class="fab fa-twitter fa-stack-1x fa-inverse"></i>
								</span>
							</a></li>
							<li class="list-inline-item"><a href="#"> <span
									class="fa-stack fa-lg"> <i
										class="fas fa-circle fa-stack-2x"></i> <i
										class="fab fa-facebook-f fa-stack-1x fa-inverse"></i>
								</span>
							</a></li>
							<li class="list-inline-item"><a href="#"> <span
									class="fa-stack fa-lg"> <i
										class="fas fa-circle fa-stack-2x"></i> <i
										class="fab fa-github fa-stack-1x fa-inverse"></i>
								</span>
							</a></li>
						</ul>
						<p class="copyright text-muted">Copyright &copy; Your Website
							2019</p>
					</div>
				</div>
			</div>



		</footer>

		<!-- Bootstrap core JavaScript -->
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Custom scripts for this template -->
		<script src="js/clean-blog.min.js"></script>
</body>

</html>