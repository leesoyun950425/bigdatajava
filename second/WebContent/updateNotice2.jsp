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
	if ($("#nullDoctor").val() == "true") {
		$("#doctor").empty();
	} else {
	}
	$("#font_familySel").on("change", function() {
		$("textarea").css("font-family", $(this).val());
	})
	$("#font_size").on("change", function() {
		$("textarea").css("font-size", $(this).val());
	})
	$("#font_weight").on("change", function() {
		$("textarea").css("font-weight", $(this).val());
	})
	$("#font").on("change", function() {
		$("textarea").css("text-align", $(this).val());
	})
	$("#subBtn").click(function() {
		if($("#title").val().trim()!=""&& $("#content").text().trim()!=""){
			$("#update").submit();
			alert("글쓰기가 완료되었습니다.");
			}
	})
})
</script>
</head>
<body>

<%
		String info = request.getParameter("info");//선택한 게시물의 dto를 toString() 한것
		String[] info2 = info.split(",");// title,content~ 등으로 나눈것
		String[] fonts = info2[5].split(":"); //font를 나눈것
	%>
	<div class="notice_write">
		<h1>게시판 수정하기</h1>
		<form action="updateNoticeRe.jsp" id="update">
	<input type="hidden" name="dto2" value="<%=info%>">

			제목: <input type="text" width="300" size="80" id="title" name="title" value="<%= info2[0]%>"><br>
				 
			<select id="font_familySel" name="font_family">
				<option value="dotum">글꼴</option>
				<option class="font_family" id="font_family1" value="dotum">돋움체</option>
				<option class="font_family" id="font_family2" value="궁서체">궁서체</option>
				<option class="font_family" id="font_family3" value="gulim">굴림체</option>
				<option class="font_family" id="font_family4" value="cursive">cursive</option>
				<option class="font_family" id="font_family5" value="arial">arial</option>
				<option class="font_family" id="font_family6" value="serif">serif</option>
			</select><select id="font_size" name="font_size">
				<option value="9px">크기</option>
				<option id="font_size1" value="9px">9pt</option>
				<option id="font_size2" value="12px">12pt</option>
				<option id="font_size3" value="18px">18pt</option>
				<option id="font_size4" value="24px">24pt</option>
			</select><select id="font_weight" name="font_weight">
				<option value="normal">굵기</option>
				<option value="normal">보통</option>
				<option id="font_weight1" value="bold">굵게</option>
			</select><select id="font" name="font">
				<option value="left">글꼴</option>
				<option value="left">왼쪽</option>
				<option value="center">가운데</option>
				<option value="right">오른쪽</option>
				<!-- 파일이름들어가는공간 -->
				<!-- <input type="hidden" value="" id="filename" name = "filename"> -->
			</select> <br>
			<textarea rows="20" cols="50" placeholder="내용을 입력해주세요."
				name="content" id="content" style="width: 773px; height: 566px; font-family: '<%=fonts[0]%>';font-size: '<%=fonts[1]%>';font-weight: '<%=fonts[2]%>';text-align: '<%=fonts[3]%>';" ><%=info2[2] %></textarea>
			<!-- <div id="content"  contentEditable="true" style="text-align:left; overflow-x:auto; width:500px; height: 300px; border: solid; 1px; margin: 20px; line-height: 20px; "> </div> -->
			<!-- 넘길내용 -->
			<!-- <input type="hidden"name="content" id="content2"> -->
			<br>
			<%
				String s1 = request.getParameter("nullDoctor");
			%>
			<input id="nullDoctor" type="hidden" value="<%=s1%>">
		
			<div id="doctor">
				병원 : <select name="hospital">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
				</select> 담당의 : <select name="doctor">
					<option value="a">a</option>
					<option value="b">b</option>
					<option value="c">c</option>
				</select><br>
			</div>
			<button id="subBtn" type="button">수정완료</button>
			</form>
	</div>
	
</body>
</html>