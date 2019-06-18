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
<%
	ArrayList<BasketDTO> list = (ArrayList<BasketDTO>)session.getAttribute("basket");
%>
장바구니에 들어간 물건의 개수 : <%= list.size() %> <br>
<%
	for(int i = 0; i<list.size(); i++){
		BasketDTO dto = list.get(i);
	%>
	제품id : <%= dto.getpId() %> ,
	제품개수 : <%= dto.getCount() %> ,
	제품가격 : <%= dto.getPrice() %> <br>
<%
	}
%>
</body>
</html>