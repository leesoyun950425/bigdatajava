<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

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

<!-- 삭제, 업데이트 부분 함수 -->

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

					<li class="nav-item"><a class="nav-link" href="index.html">게시판</a>

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

	<!-- Page Header -->

	<!-- 사진 슬라이드 -->

	<header class="masthead" style="background-image: url('back.png')">

		<div class="slide">

			<ul class="slide_ul">

				<li><img src="hosimg1.png" alt="dane"></li>

				<li><img src="hosimg2.png" alt="dane"></li>

				<li><img src="hosimg3.png" alt="dane"></li>

				<li><img src="hosimg4.png" alt="dane"></li>

				<li><img src="hosimg5.png" alt="dane"></li>

				<li><img src="hosimg6.jpg" alt="dane"></li>

				<li><img src="hosimg7.jpg" alt="dane"></li>

			</ul>



		</div>

	</header>



	<!-- 게시글 불러오기  -->

	<%
		String info = request.getParameter("info");

		String[] info2 = info.split(",");
	%>

	<div class="container">

		<div class="row">

			<div class="col-lg-8 col-md-10 mx-auto">

				<ul class="list-group list-group-flush">

					<li class="list-group-item"
						style="padding-top: 9px; padding-bottom: 9px;">

						<table>

							<tr>

								<td style="font: 17px 굴림; font-weight: bold;"><%=info2[0]%></td>

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

								<td style="padding: 0px; font-size: 14px"><%=info2[1]%></td>

								<td
									style="font-size: 12px; padding-right: 12px; padding-left: 12px; color: #a1a1a1;">|</td>

								<td style="font-size: 13px; padding-right: 10px;">날짜 :</td>

								<td style="font-size: 14px;"><%=info2[3]%></td>

							</tr>

						</table>

					</li>

					<li class="list-group-item">

						<table>

							<tr>

								<td height="250" style="font-size: 15px"><%=info2[2]%></td>

							</tr>

						</table>

					</li>

				</ul>

				<br>

				<form action="deletePost.jsp">

					<input type="hidden" name="info" value="<%=info%>">

					<button type="submit">삭제</button>

				</form>

				<button>수정</button>

			</div>

		</div>

	</div>











	<hr>



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



	<!-- Contact Form JavaScript -->

	<script src="js/jqBootstrapValidation.js"></script>

	<script src="js/contact_me.js"></script>



	<!-- Custom scripts for this template -->

	<script src="js/clean-blog.min.js"></script>



</body>

</html>