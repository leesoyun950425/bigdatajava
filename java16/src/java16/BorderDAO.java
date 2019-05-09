package java16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BorderDAO {
	String url = "jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "insert into border values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getUid());
			ps.setString(4, dto.getDate());
			ps.setString(5, dto.getCount());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public BorderDTO select(String inputId) {
		BorderDTO dto = new BorderDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from border where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			rs = ps.executeQuery();
			if(rs.next()) {
			String num = rs.getString(1);
			String content = rs.getString(2);
			String uid = rs.getString(3);
			String date = rs.getString(4);
			String count = rs.getString(5);
			dto.setNum(num);
			dto.setCount(count);
			dto.setUid(uid);
			dto.setDate(date);
			dto.setCount(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	public void update(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "update border set content =?,uid=?,date=? where num =? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getContent());
			ps.setString(2, dto.getUid());
			ps.setString(3, dto.getDate());
			ps.setString(4, dto.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "delete from border where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
