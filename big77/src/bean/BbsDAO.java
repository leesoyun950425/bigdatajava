package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	DBConnectionMgr mgr;
	public BbsDAO() {
		mgr = DBConnectionMgr.getInstance();
	}
	public void insert(BbsDTO dto) {
		try {
			Connection con = mgr.getConnection();
			String sql = "insert into bbs values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public BbsDTO select(BbsDTO dto) {
			BbsDTO dto2 = new BbsDTO();
		try {
			Connection con = mgr.getConnection();
			String sql = "select * from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				dto2 = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto2.setId(id);
				dto2.setTitle(title);
				dto2.setContent(content);
				dto2.setEtc(etc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto2;
	}	
	public void update(BbsDTO dto) {
		try {
			Connection con = mgr.getConnection();
			String sql = "update bbs set id=?,title=?,content=?,etc=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			ps.setString(5, dto.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(BbsDTO dto) {
		try {
			Connection con = mgr.getConnection();
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
