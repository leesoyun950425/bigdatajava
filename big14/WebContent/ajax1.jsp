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
		$(".btn").click(function() {
			$("#result").empty();
			var btn = $(this).val();
			var url ="";
			switch(btn){
			case "건강" : url ="http://health.chosun.com/rss/column.xml"; break;
			case "헬스" : url ="http://health.chosun.com/site/data/rss/rss.xml"; break;
			case "맛있는교육" : url ="http://edu.chosun.com/site/data/rss/rss.xml";break;
			}
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url="+url+"&api_key=bz2svcxkn5d3bta7sty7cwzi0cdinpnomn9o5nle",
			dataType: "json",
			data:{
				url:url,
				api_key: "bz2svcxkn5d3bta7sty7cwzi0cdinpnomn9o5nle",
				count : 20
			},
			success : function(result) {
				for(var i = 0;i<20; i++ ){
				var title = result.items[i].title;
				var link = result.items[i].link;
				var img = result.items[i].thumbnail; 
				$("#result").append("- <a href="+link+">"+title+"</a><br>");
				$("#result").append("-<img src="+img+"><br>"); 
				}
			}
		})
	})
		/* $("#btn2").click(function() {
			$("#result").empty();
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=bz2svcxkn5d3bta7sty7cwzi0cdinpnomn9o5nle",
				dataType: "json",
				data:{
					url:"http://health.chosun.com/site/data/rss/rss.xml",
					api_key:"bz2svcxkn5d3bta7sty7cwzi0cdinpnomn9o5nle",
					count :20
				},
				success: function(result) {
					for(var i =0; i<20; i++){
						var title = result.items[i].title;
						var link = result.items[i].link;
						$("#result").append("- <a href="+link+">"+title+"</a><br>");
					}
				}
			})
		}) */
	})
</script>
</head>
<body>
		<button class="btn" value="건강">건강</button>
		<button class="btn" value="헬스">헬스</button>
		<button class="btn" value="맛있는교육">맛있는 교육</button>
	<div id="result">
	</div>
</body>
</html>