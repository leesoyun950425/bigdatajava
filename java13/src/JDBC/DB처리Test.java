package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB贸府Test {
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	
	public void update(String telUp,String idUp) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("己傍");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		System.out.println("己傍!");
		
		String up = "update member set tel = ? where id = ? ";
		ps = con.prepareStatement(up);
		ps.setString(1, telUp);
		ps.setString(2, idUp);
		System.out.println("己傍!");
		
		ps.executeUpdate();
		System.out.println("己傍!");
	}
}
