<%@page import="bean.NoticeDTO"%>
<%@page import="bean.NoticeDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uft-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="bean.NoticeDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" /> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	
	$(function() {
		<% if(dto.getDoctor()==null){
			response.sendRedirect("notice2.jsp?index=0");
		}else{
			response.sendRedirect("notice.jsp?index=0");
		}%>
		
	});
</script>
	<%
		NoticeDAO dao = new NoticeDAO();
	
		NoticeDTO dto2 = new NoticeDTO();
		String font1 = request.getParameter("font_family");
		String font2 = request.getParameter("font_size");
		String font3 = request.getParameter("font_weight");
		String font4 = request.getParameter("font");
		String font = font1+":"+font2+":"+font3+":"+font4;
		dto.setFont(font);
		dao.update(dto);
	%>
	
</body>
</html>