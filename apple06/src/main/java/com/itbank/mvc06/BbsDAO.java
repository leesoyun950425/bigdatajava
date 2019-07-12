package com.itbank.mvc06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository //클래스를 싱글톤으로 만들어준다.
public class BbsDAO {
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//기본 생성자
	//생성자: 객체 생성시 자동 호출되는 메소드
	//객체생성시 꼭 해주어야하는 초기화 과정
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public void insert(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getUuser());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	public void delete(String did) {
		try {
			con = dbcp.getConnection();
			//3. SQL문 객체화
			String sql = "delete from bbs where id=?";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, did);
			//4. SQL문 실행 요청
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbcp.freeConnection(con,ps);
		}
	}
	public BbsDTO select(String sId) {
		BbsDTO dto = null;
		try {
			con = dbcp.getConnection();
			String sql = "select * from bbs where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, sId);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String uuser = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setUuser(uuser);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbcp.freeConnection(con,ps,rs);
		}
		return dto;
	}
	
	public void update(BbsDTO dto) {
		try {
			con = dbcp.getConnection();
			String sql = "update bbs set title=?, content=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
