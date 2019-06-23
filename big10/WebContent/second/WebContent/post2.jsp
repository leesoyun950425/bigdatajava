<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 상단 메뉴바 -->
	<div align="center">
		<a href="home.jsp"><img class="logo" src="main.png" align="center"></a>
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
		


<!-- 게시글 불러오기  -->
	<%
		String info = request.getParameter("info");
		String[] info2 = info.split(",");
		String[] fonts = info2[5].split(":");
		
	%>
	<div class = "container">
		<div class="row">
        	<div class="col-lg-8 col-md-10 mx-auto">	
				<ul class="list-group list-group-flush">
					 <li class="list-group-item" style="padding-top: 9px; padding-bottom : 9px;">
							<table>
			 					<tr>
			 						<td style="font: 17px 굴림; font-weight: bold;"><%= info2[0] %></td>
			 						<td style="padding-left: 10px; padding-right: 10px; font:15px 굴림; color: #a1a1a1;">|</td>
			 						<td style="font: 15px 굴림;"><a style="color: #a1a1a1;" href = "notice2.jsp?index=0">■ 건의사항</a></td>
			 					</tr>
			 				</table>
					 </li>
					 <li class="list-group-item" style="padding-top: 7px; padding-bottom : 7px;">
			 			<table>
			 				<tr>
			 					<td style="font-size: 13px; padding-right: 10px;">작성자 :</td>
			 					<td style="padding: 0px; font-size : 14px"><%= info2[1] %></td>
			 					<td style="font-size: 12px; padding-right: 12px; padding-left: 12px; color: #a1a1a1;">|</td>
			 					<td style="font-size: 13px;padding-right: 20px;">날짜 :</td>
			 					<td style="font-size: 14px;"><%= info2[3] %></td>
			 				</tr>
			 			</table>
					 </li>
					 <li class="list-group-item">
					 	<table>
					 		<tr>
					 			<td height = "250" style="font-size: '<%= fonts[1] %>'; font-family: '<%= fonts[0] %>';font-weight: '<%= fonts[2] %>'; text-align: '<%= fonts[3] %>';"> 
									<%= info2[2] %>
					 			</td>
					 		</tr>
					 	</table>
					 </li>
				</ul>
				<br>
				<form action = "deletePost.jsp">
					<input type = "hidden" name="info" value = "<%= info %>">
					<button type = "submit">삭제</button>
				</form>
				<button >수정</button>
			</div>
		</div>
	</div>
	
	
	
	
	  
	  <hr>

</body>
</html>