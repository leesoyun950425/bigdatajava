package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class NoticeDAO {
//	dao의 단계를 효율적으로 바꾸기
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url = "jdbc:mysql://localhost:3306/hos";
	String user = "root";
	String password = "1234";
	
	public void insert(NoticeDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
				
		con = DriverManager.getConnection(url,user,password);
				
		String sql = "insert into notice values(?,?,?,?,?,?,?)";
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getTime());
		ps.setString(5, null);
		ps.setString(6, null);
		ps.setInt(7, dto.getUnum());
				
				
		ps.executeUpdate();
		ps.close();
		con.close();
//		con.freeConnection()
	}
	public NoticeDTO select(String value, String search)  {
		NoticeDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from member where "+value+" like '%"+search+"%'";
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			if(rs.next()) {
				dto = new NoticeDTO();
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
			System.out.println("DB처리에러");
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원해제에러");
			}
		}
		return dto;
		
		
	}
	public ArrayList<NoticeDTO> selectAll() {
		ArrayList<NoticeDTO> list = new ArrayList<NoticeDTO>();
		NoticeDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			String sql = "select * from notice";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String hospital = rs.getString(5);
				if(hospital==null) {
					dto = new NoticeDTO();
					String title = rs.getString(1);
					String name = rs.getString(2);
					String content = rs.getString(3);
					String time = rs.getString(4);
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
			System.out.println("DB처리 중 에러 발생");
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			}
		}
		
		return list;
	}
	

}