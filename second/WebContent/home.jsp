<%@page import="java.util.Random"%>
<%@page import="bean.InfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="main.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".btn").click(function() {
			alert("ok");
			var btn = $(this).val();
			var data = "";
			switch(btn){
			case "life" :
				idx = 0;
				data = $("#idnum").val();
				alert(data);
				break;
			case "health" :
				idx = 30;
				var ssss = $("#idnum").val().split(",");
				var intssss = [];
				for(var i =0; i<ssss.length;i++){
					intssss[i] = ssss[i]*1+idx;
					if(i==ssss.length-1){
						data += intssss[i];
					}else{
						data+= intssss[i]+",";
					}
				}
				alert(data);
				break;
			case "doctor" :
				idx = 60;
				var ssss = $("#idnum").val().split(",");
				var intssss = [];
				for(var i =0; i<ssss.length;i++){
					intssss[i] = ssss[i]*1+idx;
					if(i==ssss.length-1){
						data += intssss[i];
					}else{
						data+= intssss[i]+",";
					}
				}
				alert(data);
				break;
			}
		$.ajax({
			url : "infoCall.jsp",
			data : {
				"data" : data
			},
			dataType:"html",
			success : function(result) {
					/* $(".life").append(result); */
					$("#test").html(result);
			}
		})
	})
})
</script>
</head>
<body>
<div id="test"></div>
	<!-- 상단 메뉴바 -->
	<div align="center">
		<a href="home.jsp"><img class="logo" src="main.png"
			style="width: 50px; height: 50px; margin: auto; padding: auto; float: left;"></a>
		<div style="height: 50px; background: skyblue;">
			<table>
				<tr height="10px">
					<td
						style="width: 500px; text-align: center; padding-bottom: 9px; padding-top: 5px;"><a
						style="color: #f2f2f2; font-size: 30px; font-family: 굴림; text-decoration: none; text-align: center;"
						href="resa.jsp">예약</a></td>
					<td
						style="width: 500px; text-align: center; padding-bottom: 9px; padding-top: 5px;"><a
						style="color: #f2f2f2; font-size: 30px; font-family: 굴림; text-decoration: none; text-align: center;"
						href="notice.jsp?index=0">게시판</a></td>
					<td
						style="width: 500px; text-align: center; padding-bottom: 9px; padding-top: 5px;"><a
						style="color: #f2f2f2; font-size: 30px; font-family: 굴림; text-decoration: none; text-align: center;"
						href="my.jsp">마이페이지</a></td>
					<td
						style="width: 500px; text-align: center; padding-bottom: 9px; padding-top: 5px;"><a
						style="color: #f2f2f2; font-size: 30px; font-family: 굴림; text-decoration: none; text-align: center;"
						href="notice2.jsp?index=0">고객센터</a></td>
				</tr>
			</table>
		</div>
		
		<%
		  Random r = new Random();
	      int index = 0;//랜덤으로 뽑힌 숫자가 들어가는 변수
	      int i1 = 0;//배열의 인덱스가 될 변수
	      boolean b = false;//중복체크를 하고 중복이 아닐경우 true ,중복이 false
	      int[] rNum = new int[10];//랜덤으로 뽑힌 중복되지 않은 숫자들이 들어갈 배열
	      while(true) {
	         b =false;//중복체크가 끝나고 나서 다시 false로 초기화
	         index = r.nextInt(30);
	         if(i1 ==0) {//첫번째 인덱스이기 떄문에 중복체크를 하지 않는 조건식
	            rNum[i1] = index;
	            i1++;
	         }else if(i1 ==10) {//배열이 다 채워졌을 때 반복문을 종료하는 조건식
	            break;
	         }else if(1<=i1 && i1<10) {//두번째 인덱스부터 마지막 인덱스를 채울때까지의 중복을 체크하는 조건식
	            rNum[i1] = index;
	            for (int j = i1; j >= 0; j--) {//중복을 체크하는 반복문 j는 중복체크의 기준이 될 인덱스, k는 중복체크할 인덱스
	               for (int k = i1; k >= 0; k--) {
	                  if(j!=k) {//j와 k가 같으면 같은 인덱스의 값을 비교하기 때문에 같은 인덱스를 건너뜀
	                     if(rNum[j] != rNum[k]) {//중복체크
	                        b=true;//중복되지 않으면 true
	                     }else {//하나라도 중복일 경우 j와 k의 값을 0으로 만들어서 반복문 탈출 유도.
	                        b=false;
	                        j=0;
	                        k=0;
	                     }
	                  }
	               } 
	            }
	         }
	         if(b) {//중복되지 않은 결과가 나왔을 때 인덱스를 증가시켜 다음 인덱스 비교 유도
	            i1++;
	         }else {
	         }
	      }
	      //rNum을 스트링으로 바꿔서 넣을 변수
	      String ssss="";
	      //rNum의 길이만큼 반복문의 범위
	      for(int i=0;i<rNum.length;i++){
	    	  //마지막에 ,안넣기 위한 조건식
	    	  if(i==rNum.length-1){
	    		  //스트링 배열에 rNum의 값 저장
				ssss+=rNum[i];	    		  
	    	  }else{
	    		  //스트링 배열에 rNum의 값 저장
	    	  	ssss+=rNum[i]+",";
	    	  }
	      }
	%>
	<input type="text" id="idnum" value="<%=ssss%>" name="idnum">
	<button class="btn" value="life">건강</button>
	<button class="btn" value="health">운동</button>
	<button class="btn" value="doctor">의료기술</button>
	<!-- 정보 테이블 불러올 div -->
		<div class="life"
			style="width: 1000px; height: 250px; padding-top: 20px; float: left; background: pink;">
		</div>
</body>
</html>