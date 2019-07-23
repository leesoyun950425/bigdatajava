<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="rDTO" items="${list}"> <!-- var는  출력을 위한 변수 , for(int x : list)에서 x와 같은 변수, 일치할 값은 없다. -->
		내용 : ${rDTO.content}<br>
</c:forEach>