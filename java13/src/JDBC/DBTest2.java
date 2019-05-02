package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest2 {
	public static void main(String[] args) throws Exception {
//		1. 드라이버 설정
		// 파일을 다룰때는 에러처리 반드시 그래서 예외처리 !
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2. DB연결 OK....");
		
//		3. SQL선택
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("PW입력");
		String name = JOptionPane.showInputDialog("NAME입력");
		String tel = JOptionPane.showInputDialog("TEL입력");
//		String sql = "insert into member values('"+id+"','"+pw+"','"+name+"','"+tel+"')";
		String sql = "insert into member values(?,?,?,?)";
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);    //세팅
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL문 결정 OK....");
		
		//객체화
		//객체화를 안하면 그냥 변수로 자바에서 인식한다. 객체화시켜서 url문이라고 해야한다.
//		String url = "http://www.naver.com";
//		URI url2 = new URI(url);
		
//		4. SQL전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK...");
	}
}
