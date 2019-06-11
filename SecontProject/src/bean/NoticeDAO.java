package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoticeDAO {
	String url = "jdbc:mysql://localhost:3306/hos";
	String user="root";
	String password="1234";
	Connection con ;
	PreparedStatement ps;
	ResultSet rs ;
	public void insert(NoticeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "insert into notice values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, "lee");
			ps.setString(3, dto.getContent());
			ps.setString(4, "19.06.05");
			ps.setString(5, dto.getHospital());
			ps.setString(6, dto.getDoctor());
			ps.setInt(7, 1);
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
	public void update(NoticeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "update notice set title =?, content=? where unum=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setInt(3, dto.getUnum());
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
	public void delete(NoticeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "delete from notice where unum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getUnum());
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
	public NoticeDTO select(String value,String value2) {
		NoticeDTO dto = new NoticeDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from notice where "+value+"like'%"+value2+"%'";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String time = rs.getString(4);
				String hospital = rs.getString(5);
				String doctor = rs.getString(6);
				int unum = rs.getInt(7);
				dto.setTitle(title);
				dto.setName(name);
				dto.setContent(content);
				dto.setTime(time);
				dto.setHospital(hospital);
				dto.setDoctor(doctor);
				dto.setUnum(unum);
			}
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
	
		return dto;
	}
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		NoticeDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from notice";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new NoticeDTO();
				if(dto.getDoctor()!=null) {
					String title = rs.getString(1);
					String name = rs.getString(2);
					String content = rs.getString(3);
					String time = rs.getString(4);
					String hospital = rs.getString(5);
					String doctor = rs.getString(6);
					int unum = rs.getInt(7);
					dto.setTitle(title);
					dto.setName(name);
					dto.setContent(content);
					dto.setTime(time);
					dto.setHospital(hospital);
					dto.setDoctor(doctor);
					dto.setUnum(unum);
					list.add(dto);
				}
			}
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
		return list;
	}
}