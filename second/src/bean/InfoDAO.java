package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoDAO {
	String url = "jdbc:mysql://localhost:3306/hos";
	String user = "root";
	String password = "1234";

	DBConnectionMgr mgr;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public InfoDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public ArrayList<InfoDTO> selectAll()  {
		ArrayList<InfoDTO> list = new ArrayList<InfoDTO>();
		InfoDTO dto = null;
		try {
			con = mgr.getConnection();
			String sql = "select * from info";
			
			ps= con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				dto = new InfoDTO();
				String title = rs.getString(1);
				String link = rs.getString(2);
				String type = rs.getString(3);
				
				dto.setTitle(title);
				dto.setLink(link);
				dto.setType(type);
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
}