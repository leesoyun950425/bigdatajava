package java14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BorderDAO {
	String url = "jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "950425";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(BorderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "insert into border values(null,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
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
	public BorderDTO select(String inputNum) {
		BorderDTO dto = new BorderDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from border where num = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			rs = ps.executeQuery();
			if(rs.next()) {
				String title = rs.getString(2);
				String content = rs.getString(3);
				String uid = rs.getString(4);
				String date = rs.getString(5);
				String count = rs.getString(6);
				dto.setNum(title);
				dto.setContent(content);
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
			String sql = "update border set content =? where uid =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getContent());
			ps.setString(2, dto.getUid());
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
			String sql = "delete from border where uid = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getUid());
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
}
