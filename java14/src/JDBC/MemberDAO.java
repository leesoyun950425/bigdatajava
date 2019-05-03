package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(MemberDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql = "insert into membership values(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getNum());
		ps.setString(2, dto.getId());
		ps.setString(3, dto.getPw());
		ps.setString(4, dto.getName());
		ps.setString(5, dto.getTel());
		ps.setString(6, dto.getAddr());
		ps.setString(7, dto.getStyle());
		
		ps.executeUpdate();
	}
	
	public String[] select(MemberDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql4 = "select * from membership where num = ?";
		ps = con.prepareStatement(sql4);
		ps.setString(1, dto.getNum());
		
		rs = ps.executeQuery();
		String[] mem = null;
		if(rs.next()) {
			mem = new String[7];
			String s1 = rs.getString(1);
			String s2 = rs.getString(2);
			String s3 = rs.getString(3);
			String s4 = rs.getString(4);
			String s5 = rs.getString(5);
			String s6 = rs.getString(6);
			String s7 = rs.getString(7);
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
			mem[4] = s5;
			mem[5] = s6;
			mem[6] = s7;
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
		return mem;
	}
	public void update(MemberDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql2 = "update membership set id = ?,pw=?,name=?,tel=?,addr =?,style=? where num =?";
		ps = con.prepareStatement(sql2);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getAddr());
		ps.setString(6, dto.getStyle());
		ps.setString(7, dto.getNum());
		
		ps.executeUpdate();
	}
	
	public void delete(MemberDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql3 = "delete from membership where id =?";
		ps = con.prepareStatement(sql3);
		ps.setString(1, dto.getId());
		
		ps.executeUpdate();
	}
}
