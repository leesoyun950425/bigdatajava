package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB贸府Test2 {
	Connection con;
	PreparedStatement ps;
	String idDe;
	String url;
	String user;
	String password;
	
	public void delete(String idDe) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("己傍");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		System.out.println("己傍!");
		
		String dele = "delete from member where id = ?";
		ps = con.prepareStatement(dele);
		ps.setString(1, idDe);
		System.out.println("己傍!");
		
		ps.executeUpdate();
		System.out.println("己傍!");
	}
}
