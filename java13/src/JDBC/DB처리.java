package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBó�� {
	//�������
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	//����޼ҵ�
	public void insert(String id,String pw,String name,String tel) throws Exception {
//		1. ����̹� ����
		// ������ �ٷ궧�� ����ó�� �ݵ�� �׷��� ����ó�� !
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK...");
		
//		2. DB����(DB��, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		System.out.println("2. DB���� OK....");
		
//		3. SQL����
		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL�� ���� OK....");
		
//		4. SQL����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� OK...");
	}
}
