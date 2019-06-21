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
			url:"xml/database.xml",
			dataType:"xml",
			success : function(result) {
				alert("xml문서 연결 성공")
				if($(result).find("record").length>0){
					$(result).find("record").each(function() {
						var id = $(this).find("id").text();
						$("div").appent(id);
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
	<div>
	</div>
</body>
</html>