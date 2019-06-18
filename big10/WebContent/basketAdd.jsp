<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.BasketDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<%
	//장바구니 세션이 이미 있는지 없는지 체크
	ArrayList<BasketDTO> list = (ArrayList<BasketDTO>)session.getAttribute("basket");
	if(list == null){
	//장바구니로 사용할 arrayList생성
		list = new ArrayList<>();
		list.add(dto);
		session.setAttribute("basket", list);
	}else{
		list.add(dto);
		session.setAttribute("basket", list);
	}
%>
<!-- <a href="basketView.jsp">장바구니 보러가기</a> -->
<%-- <jsp:forward page="장바구니에넣기.jsp"></jsp:forward> --%>
<jsp:forward page="basketView.jsp"></jsp:forward>
</body>
</html>