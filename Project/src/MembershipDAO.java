import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import Project.MembershipDTO;

public class MembershipDAO {
	String url="jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(MembershipDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "insert into membership values(null,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
//			ps.setInt(1, dto.getNum());
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.setString(5, dto.getAddr());
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
	
	public MembershipDTO select(String inputNum) {
		MembershipDTO dto = new MembershipDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from membership where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputNum);
			rs = ps.executeQuery();
			if(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String addr = rs.getString(5);
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);
				dto.setAddr(addr);
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
	
	public MembershipDTO selectId(String inputId) {
		MembershipDTO dto = new MembershipDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from membership where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			rs = ps.executeQuery();
			if(rs.next()) {
				String id = rs.getString(2);
				dto.setId(id);
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
	public MembershipDTO selectPw(String inputPw) {
		MembershipDTO dto = new MembershipDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from membership where pw=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputPw);
			rs = ps.executeQuery();
			if(rs.next()) {
				String pw = rs.getString(3);
				dto.setPw(pw);
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
//	public ArrayList selectAll() {
//		ArrayList list = new ArrayList();
//		MembershipDTO dto = new MembershipDTO();
//		 try {
//			  Class.forName("com.mysql.jdbc.Driver");
//			  con = DriverManager.getConnection(url,user,password);
//			  String sql = "select * from bbs ";
//			  ps = con.prepareStatement(sql);
//			  rs = ps.executeQuery();
//			 while(rs.next()) {
//				String num = rs.getString(1);
//				String id = rs.getString(2);
//				String pw = rs.getString(3);
//				String name = rs.getString(4);
//				String tel = rs.getString(5);
//				String addr = rs.getString(6);
//				String style = rs.getString(7);
//				dto.setNum(num);
//				dto.setId(id);
//				dto.setPw(pw);
//				dto.setName(name);
//				dto.setTel(tel);
//				dto.setAddr(addr);
//				dto.setStyle(style);
//				list.add(dto);
//			 }
//		 } catch (Exception e) {
//			 e.printStackTrace();
//		 }finally {
//		  try {
//			  rs.close();
//			  ps.close();
//			  con.close();
//		  } catch (SQLException e) {
//			  e.printStackTrace();
//		  	}
//		  }
//		return list;
//	}
	
	public void update(MembershipDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "update membership set pw =?,name=?,tel=?,addr=? where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getTel());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getId());
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
	
	public void delete(MembershipDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "delete from membership where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
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