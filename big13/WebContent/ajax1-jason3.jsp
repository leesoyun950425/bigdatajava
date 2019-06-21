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
			url:"json/MOCK_DATA2.json",
			dataType:"json",
			success : function(result) {
				alert("json연결 성공!!");
				var list = result.rank;
				if(list.length>0){
					$("#div").append("존재 확인!");
					$(list).each(function(index, member) {
						var id = member.id;
						var first_name = member.first_name;
						var email = member.email;
						var jop = member.jop;
					})$.ajax({
						url : "jsondb2.jsp",
						data : {
							"id" : id,
							"first_name" : first_name,
							"email" : email,
							"jop" : jop
						},
						success: function() {
							console.log("ok");
						}
					})
				}
			}
		})
	})

</script>
</head>
<body>
	<div id="div">
	</div>
</body>
</html>