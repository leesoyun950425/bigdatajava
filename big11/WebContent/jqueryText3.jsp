<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#food").change(function() {
		if($("#food").attr("checked",true)){
			$(".se input").attr("checked",true);
			}
		})
		$("#spot").change(function() {
		if($("#food").attr("checked",true)){
			$(".se input").attr("checked",true);
			}
		})
	});
</script>
</head>
<body>
	<ul><input type="checkbox" id="food">음식
	<li class="se"><input type="checkbox" >감자 </li>
	<li class="se"><input type="checkbox" >고구마 </li>
	</ul>	
	<br>
	<ul><input type="checkbox" id="spot">장소
	<li class="se2"><input type="checkbox" >공원 </li>
	<li class="se2"><input type="checkbox" >주차장 </li>
	</ul>
</body>
</html>