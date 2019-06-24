<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.InfoDTO"%>
<%@page import="bean.InfoDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$(".btn").click(function() {
		$("#healthTable").empty();
		var btn = $(this).val();
		switch (btn) {
		case "life":
			
			break;

		}
	})
})
</script>
</head>
<body>
	<jsp:useBean id="dto" class="bean.InfoDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" />
	<%
		InfoDAO dao = new InfoDAO();
		ArrayList<InfoDTO> list = dao.selectAll();
		  Random r = new Random();
	      int index = 0;
	      int i1 = 0;
	      boolean b = false;
	      int[] rNum = new int[10];
	      while(true) {
	         b =false;
	         index = r.nextInt(list.size());
	         if(i1 ==0) {
	            rNum[i1] = index;
	            i1++;
	         }else if(i1 ==10) {
	            break;
	         }else if(1<=i1 && i1<10) {
	            rNum[i1] = index;
	            for (int j = i1; j >= 0; j--) {
	               for (int k = i1; k >= 0; k--) {
	                  if(j!=k) {
	                     if(rNum[j] != rNum[k]) {
	                        b=true;
	                     }else {
	                        b=false;
	                        j=0;
	                        k=0;
	                     }
	                  }
	               }
	            }
	         }
	         if(b) {
	            i1++;
	         }else {
	         }
	      }
	%>
	<button class="btn" value="life">건강</button>
	<button class="btn" value="health">운동</button>
	<button class="btn" value="doctor">의료기술</button>
	<table id="healthTable" border="1">
		<tr>
			<td width="800px" align="center"><h3>건강정보</h3></td>
		</tr>
		
		<%
		for(int i =0; i< rNum.length; i++){
				dto = list.get(rNum[i]); 
				if(dto.getInum()<31){
			%>
		<tr>
			<td><a href="<%= dto.getLink() %>"><%= dto.getTitle() %><%= dto.getInum() %></a></td>
		</tr>
		<%	}else{
			}
	}%>
	</table>
</body>
</html>