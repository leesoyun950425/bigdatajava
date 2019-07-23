<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="rDTO" items="${list}">
	<img src="resources/img/sp.jpeg" style="width: 30px; height: 30px">
	${rDTO.content}<hr>
	
</c:forEach>