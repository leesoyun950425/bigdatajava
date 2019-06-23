package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	public InfoDTO select(InfoDTO dto) throws Exception {
		con = mgr.getConnection();

		String sql = "select * from info where inum=?";
		
		ps= con.prepareStatement(sql);
		ps.setInt(1, 1);
		
		rs = ps.executeQuery();

		while (rs.next()) {
			int inum = rs.getInt(1);
			String title = rs.getString(2);
			String link = rs.getString(3);
			dto.setInum(inum);
			dto.setTitle(title);
			dto.setLink(link);
		}
		rs.close();
		ps.close();
		con.close();
		
		return dto;
	}
}
