<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script type="text/javascript">
function update() {
	var data = document.querySelector("#id");
	data2 = data.value;
	location.href = "update2.jsp?id="+data2;
}
function delette() {
	location.href = "delete.jsp";
}
</script>
</head>
<body>
<jsp:useBean id="dto" class ="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	BbsDAO dao = new BbsDAO();
	BbsDTO dto2 = dao.select(dto);
%>
검색결과 입니다.
<hr>
	수정할 ID : <input type="text" name="id" id="id" value="<%= dto2.getId() %>" readonly="readonly"><br>
	수정할 TITLE : <input type="text" name="title" value="<%= dto2.getTitle() %>"><br>
	수정할 CONTENT : <input type="text" name="content" value="<%= dto2.getContent() %>"><br>
	수정할 ETC : <input type="text" name="etc" value="<%= dto2.getEtc() %>"><br>
 <button type="button" class="btn btn-warning" onclick="update()">수정하기</button>
 <button type="button" class="btn btn-danger" onclick="delette()">삭제하기</button>
</body>
</html>