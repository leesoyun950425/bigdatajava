package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	
	public void insert(MemberDTO2 dto2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql = "insert into border values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto2.getId());
		ps.setString(2, dto2.getContent());
		ps.setString(3, dto2.getMid());
		ps.setString(4, dto2.getDate());
		ps.setString(5, dto2.getCount());
		
		ps.executeUpdate();
	}
	
	public void update(MemberDTO2 dto2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql2 = "update border set content =?,mid =?,date =?,count =? where id =?";
		ps = con.prepareStatement(sql2);
		ps.setString(1, dto2.getContent());
		ps.setString(2, dto2.getMid());
		ps.setString(3, dto2.getDate());
		ps.setString(4, dto2.getCount());
		ps.setString(5, dto2.getId());
		
		ps.executeUpdate();
	}
	
	public void delete(MemberDTO2 dto2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		
		String sql3 = "delete from border where id = ?";
		ps = con.prepareStatement(sql3);
		ps.setString(1, dto2.getId());
		
		ps.executeUpdate();
	}
}
