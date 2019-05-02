package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest2 {
	public static void main(String[] args) throws Exception {
//		1. ����̹� ����
		// ������ �ٷ궧�� ����ó�� �ݵ�� �׷��� ����ó�� !
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK...");
		
//		2. DB����(DB��, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2. DB���� OK....");
		
//		3. SQL����
		String id = JOptionPane.showInputDialog("ID�Է�");
		String pw = JOptionPane.showInputDialog("PW�Է�");
		String name = JOptionPane.showInputDialog("NAME�Է�");
		String tel = JOptionPane.showInputDialog("TEL�Է�");
//		String sql = "insert into member values('"+id+"','"+pw+"','"+name+"','"+tel+"')";
		String sql = "insert into member values(?,?,?,?)";
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);    //����
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL�� ���� OK....");
		
		//��üȭ
		//��üȭ�� ���ϸ� �׳� ������ �ڹٿ��� �ν��Ѵ�. ��üȭ���Ѽ� url���̶�� �ؾ��Ѵ�.
//		String url = "http://www.naver.com";
//		URI url2 = new URI(url);
		
//		4. SQL����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� OK...");
	}
}
