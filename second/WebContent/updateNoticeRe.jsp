<%@page import="bean.NoticeDTO"%>
<%@page import="bean.NoticeDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uft-8">
<title>Insert title here</title>
<script type="text/javascript">
	history.go(-3);
</script>
</head>
<body>
	<jsp:useBean id="dto" class="bean.NoticeDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" /> 
	<%
		NoticeDAO dao = new NoticeDAO();
	
		String info1 = request.getParameter("dto2");
		String[] info = info1.split(",");
		NoticeDTO dto2 = new NoticeDTO();
		dto2.setTitle(info[0]);
		dto2.setContent(info[2]);
		dto2.setTime(info[3]);
		dto2.setName(info[1]);
		String font1 = request.getParameter("font_family");
		String font2 = request.getParameter("font_size");
		String font3 = request.getParameter("font_weight");
		String font4 = request.getParameter("font");
		String font = font1+":"+font2+":"+font3+":"+font4;
		dto.setFont(font);
		dao.updateNotice(dto,dto2);
	%>
	
</body>
</html>