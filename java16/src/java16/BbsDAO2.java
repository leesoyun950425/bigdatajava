package java16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java16.BbsDTO;

public class BbsDAO2 {
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		
		BbsDTO dto = null;
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection(url,user,password);
			  String sql = "select * from bbs ";
			  ps = con.prepareStatement(sql);
			  rs = ps.executeQuery();
			 while(rs.next()) {
				  dto = new BbsDTO();
				  String id = rs.getString(1);
				  String title = rs.getString(2);
				  String content = rs.getString(3);
				  String etc = rs.getString(4);
				  dto.setId(id);
				  dto.setTitle(title);
				  dto.setContent(content);
				  dto.setEtc(etc);
				  list.add(dto);
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
		return list;
	}
	public void insert(BbsDTO dto) {
		try {
		  Class.forName("com.mysql.jdbc.Driver");
		  con = DriverManager.getConnection(url,user,password);
		  String sql = "insert into bbs values(?,?,?,?)";
		  ps = con.prepareStatement(sql);
		  ps.setString(1, dto.getId());
		  ps.setString(2, dto.getTitle());
		  ps.setString(3, dto.getContent());
		  ps.setString(4, dto.getEtc());
		  ps.executeUpdate();
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
			}
	public BbsDTO select(String inputId) {
		BbsDTO dto = null;
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection(url,user,password);
			  String sql = "select * from bbs where id = ?";
			  ps = con.prepareStatement(sql);
			  ps.setString(1, inputId);
			  rs = ps.executeQuery();
			  if(rs.next()) {
				  dto = new BbsDTO();
			  String id = rs.getString(1);
			  String title = rs.getString(2);
			  String content = rs.getString(3);
			  String etc = rs.getString(4);
			  dto.setId(id);
			  dto.setTitle(title);
			  dto.setContent(content);
			  dto.setEtc(etc);
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
	public void update(BbsDTO dto) {
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection(url,user,password);
			  String sql = "update bbs set title =?,content=?,etc=? where id = ?";
			  ps = con.prepareStatement(sql);
			  ps.setString(1, dto.getTitle());
			  ps.setString(2, dto.getContent());
			  ps.setString(3, dto.getEtc());
			  ps.setString(4, dto.getId());
			  ps.executeUpdate();
		  
		 } catch (Exception e) {
		  e.printStackTrace();
	  }
	}
	public void delete(BbsDTO dto) {
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection(url,user,password);
			  String sql = "delete from bbs where id = ?";
			  ps = con.prepareStatement(sql);
			  ps.setString(1, dto.getId());
			  ps.executeUpdate();
		  } catch (Exception e) {
			  e.printStackTrace();
		 }
	}
}
