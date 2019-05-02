package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB처리 {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	//멤버메소드
	public void insert(String id,String pw,String name,String tel) throws Exception {
//		1. 드라이버 설정
		// 파일을 다룰때는 에러처리 반드시 그래서 예외처리 !
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url,user,password);
		System.out.println("2. DB연결 OK....");
		
//		3. SQL선택
		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL문 결정 OK....");
		
//		4. SQL전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK...");
	}
}
