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
		$.ajax({
			url:"xml/dataset.xml",
			dataType:"xml",
			success : function(result) {
				alert("xml문서 연결 성공");
				if($(result).find("record").length > 0){
					$("#div").html("record가 존재 확인"+"<br>");
					$(result).find("record").each(function() {
						var id = $(this).find("id").text();
						var first_name = $(this).find("first_name").text();
						var email = $(this).find("email").text();
						var gender = $(this).find("gender").text();
						$.ajax({
							url: "xmldb.jsp",
							data : {
								"id" : id,
								"first_name" : first_name,
								"email" : email,
								"gender" : gender
							},
							success : function() {
								console.log("ok");
							}
						})
						
					})
				}
			}
			
		})
	})
</script>
</head>
<body>
first_name
<hr color="red">
	<div id="div">
	</div>
</body>
</html>