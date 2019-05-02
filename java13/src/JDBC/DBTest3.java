package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest3 {
	public static void main(String[] args) throws Exception {
		//1.����̹�����
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.DB ����
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.sql�� ����
		String id = JOptionPane.showInputDialog("ID�Է�");
		String title = JOptionPane.showInputDialog("TITLE�Է�");
		String price = JOptionPane.showInputDialog("PRICE�Է�");
		String company = JOptionPane.showInputDialog("COMPANY�Է�");
		String sql = "insert into product values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2 ,title);
		ps.setString(3, price);
		ps.setString(4, company);
		
		//4.sql�� ����
		ps.executeUpdate();
	}
}
