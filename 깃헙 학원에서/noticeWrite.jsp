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
<script type="text/javascript">
function dodum() {
	alert("됨");
}

</script>
</head>
<body>
	<div>
		<nav class="navbar navbar-expand-lg navbar-light fixed-top"
			id="mainNav">
			<div class="container">
				<a href="index.html">병원 예약 사이트</a>
				<button class="navbar-toggler navbar-toggler-right" type="button"
					data-toggle="collapse" data-target="#navbarResponsive"
					aria-controls="navbarResponsive" aria-expanded="false"
					aria-label="Toggle navigation">
					Menu <i class="fas fa-bars"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li><a class="nav-link" href="index.jsp?index=0">Home</a></li>
						<li><a class="nav-link" href="about.html">마이페이지</a></li>
						<li><a class="nav-link" href="post.html">정보</a></li>
						<li><a class="nav-link" href="contact.html">게시판</a></li>
					</ul>
				</div>
			</div>
		</nav>
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
	</div>
	<div align="center">
		<h1>게시판 글쓰기</h1>
		<form action="noticeWriteRe.jsp">
			제목: <input type="text" placeholder="제목을 입력해주세요." width="300"
				size="80" name="title"> <br> 
			글꼴 : <select name="font_family">
				<option class="font_family1" value="dodum" >돋움체</option>
				<option class="font_family2" value="goong">궁서체</option>
				<option class="font_family3" value="gulim">굴림체</option>
				<option class="font_family4" value="Courier">Courier</option>
				<option class="font_family5" value="Impact">Impact</option>
			</select>  
			크기 : <select name="font_size">
				<option value="10px" >10pt</option>
				</select>
				
			굵기 : <select name="font_weight">
				<option value="bold" >굵게</option>
			</select>
			정렬 : <select name="font">
				<option value="center" >가운데</option>
			</select> <br>
			내용 :
			<textarea rows="15" cols="80" placeholder="내용을 입력해주세요."
				name="content" ></textarea>
			<br> 병원 : <select name="hospital">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
			</select> 담당의 : <select name="doctor">
				<option value="a">a</option>
				<option value="b">b</option>
				<option value="c">c</option>
			</select>
			
			<br>

			<button type="submit">글쓰기 완료</button>
		</form>
	</div>

	<div id="top">
		<ul>
			<li><a href="index.html">Home</a></li>
			<li><a href="about.html">마이페이지</a></li>
			<li><a href="post.html">정보</a></li>
			<li><a href="contact.html">게시판</a></li>
		</ul>
	</div>
	
	<hr>

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