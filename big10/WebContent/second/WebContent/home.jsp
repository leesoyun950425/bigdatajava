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
 		$("#healthId1").click(function() {
			$.ajax({
				url : "infoCall.jsp",
				data : "GET",
				dataType : "text",
				success : function(result) {
					
				}
			})

		})

	})
</script>
</head>
<body>
	<!-- 상단 메뉴바 -->
	<div align="center">
		<a href="home.jsp"><img class="logo" src="main.png" style="width: 50px; height: 50px; margin: auto; padding: auto; float: left;"></a>
		<div style="height: 50px;
	background: skyblue;">
			<table>
				<tr height="10px">
					<td style="width: 500px;text-align: center;padding-bottom: 9px;padding-top: 5px;"><a style="color: #f2f2f2;font-size: 30px;font-family: 굴림;text-decoration: none;text-align: center;" href="resa.jsp">예약</a></td>
					<td style="width: 500px;text-align: center;padding-bottom: 9px;padding-top: 5px;"><a style="color: #f2f2f2;font-size: 30px;font-family: 굴림;text-decoration: none;text-align: center;" href="notice.jsp?index=0">게시판</a></td>
					<td style="width: 500px;text-align: center;padding-bottom: 9px;padding-top: 5px;"><a style="color: #f2f2f2;font-size: 30px;font-family: 굴림;text-decoration: none;text-align: center;" href="my.jsp">마이페이지</a></td>
					<td style="width: 500px;text-align: center;padding-bottom: 9px;padding-top: 5px;"><a style="color: #f2f2f2;font-size: 30px;font-family: 굴림;text-decoration: none;text-align: center;" href="notice2.jsp?index=0">고객센터</a></td>
				</tr>
			</table>
		</div>
		
	<div class="health" style="width: 1000px; height: 250px; padding-top: 20px; float: left; background: pink;">
	
		<table id="healthTable" border="1">
			<tr>
				<td width="800px" align="center"><h3>운동정보</h3></td>
			</tr>
			<tr>
				<td id="healthTd1"><a href="#" id="healthId1">운동</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">운동1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">운동1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">운동1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">운동1</a></td>
			</tr>
		</table>
	</div>
	 <div class="food" style="width: 1000px; height: 250px; padding-top: 20px; float: left; background: yellow">
		<table id="foodTable" border="1">
			<tr>
				<td width="800px" align="center"><h3>음식정보</h3></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">음식1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">음식1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">음식1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">음식1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">음식1</a></td>
			</tr>
		</table>
	</div> 
<!-- 	<div class="login" style="float: left; width: 200px ; height: 300px">
		<form action="loginPage2.jsp">
			이름 : <input type="text" name="name"> <br>
			비밀번호 : <input type="password" name="pw"> <br>
			<input type="submit" value="로그인">
		</form>
	</div> -->
	<div class="food" style="width: 1000px; height: 250px; padding-top: 20px; float: left; background: red; margin-left: 20px">
	
		<table id="foodTable" border="1">
			<tr>
				<td width="800px" align="center"><h3>건강이야기</h3></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">건강1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">건강1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">건강1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">건강1</a></td>
			</tr>
			<tr>
				<td id="healthTd"><a href="#">건강1</a></td>
			</tr>
		</table>
	</div>
</body>
</html>