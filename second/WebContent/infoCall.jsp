    
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.InfoDTO"%>
<%@page import="bean.InfoDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="utf-8"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title> -->
<link rel="stylesheet" type="text/css" href="main.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	idx = 0;
	var data = "";
	
})
</script>

	<jsp:useBean id="dto" class="bean.InfoDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" />
	<%
		InfoDAO dao = new InfoDAO();
		ArrayList<InfoDTO> list = dao.selectAll();
		 
		String data = request.getParameter("data");
		String[] data2 = data.split(",");
		
	    int[] rNum = new int[data2.length];
	    for(int i =0; i<data2.length; i++){
	    	rNum[i] = Integer.parseInt(data2[i]);
	    }
	%>
	
	<table id="healthTable" border="1">
		<tr>
			<td width="800px" align="center"><h3>건강정보</h3></td>
		</tr>
		
		<%
		for(int i =0; i< rNum.length; i++){
				dto = list.get(rNum[i]); 
			%>
		<tr>
			<td><a id="infoA" style="text-decoration: none; color: black;" href="<%= dto.getLink() %>"><%= dto.getTitle() %><%= dto.getInum() %></a></td>
		</tr>
	<%
		}
	%>
	</table>
