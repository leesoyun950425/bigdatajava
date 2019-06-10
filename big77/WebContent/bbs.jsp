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
function select() {
	location.href = "select.html";
}
</script>
</head>
<body>
<jsp:useBean id="dto" class = "bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	BbsDAO dao = new BbsDAO();
	dao.insert(dto);
%>
<h1 align="center">입력한 게시판</h1>
<hr color="gray">
<div class="alert alert-secondary" role="alert">
	<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">아이디</span>
  </div>
  <input type="text" value="<%= dto.getId() %>" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="id">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">제목</span>
  </div>
  <input type="text" value="<%= dto.getTitle() %>" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="title">
</div>

<div class="input-group" > 
  <div class="input-group-prepend">
    <span class="input-group-text" >내용</span>
	 </div>
	<input type="text" value="<%= dto.getContent() %>" class="form-control" aria-label="With textarea" name="content"></textarea>
 </div>
	 
<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">기타사항</span>
  </div>
  <input type="text" value="<%= dto.getEtc() %>" class="form-control" placeholder="etc" aria-label="Username" aria-describedby="basic-addon1" name="etc">
  </div>
  <br>
 
 <button type="submit" class="btn btn-success" onclick="select()">검색하기</button>
</div>
</body>
</html>