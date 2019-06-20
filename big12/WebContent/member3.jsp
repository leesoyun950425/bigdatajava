<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user="root";
	String password="1234";
	Connection con = null;
	PreparedStatement ps = null;
	String dbId = request.getParameter("id");
	
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url,user,password);
	String sql = "select * from member where id = ?";
	ps = con.prepareStatement(sql);
	ps.setString(1, dbId);
	
	ResultSet rs = ps.executeQuery();
	String id = null;
	while(rs.next()) {
		id = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString(3);
		String tel = rs.getString(4);
	}

	if(id==null){
		out.write("사용 가능한 ID");
	}else{
		out.write("중복된 ID");
	}
%>