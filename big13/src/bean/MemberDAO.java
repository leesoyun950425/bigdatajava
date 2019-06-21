package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	DBConnectionMgr mgr ;
	
	public MemberDAO() { //한번만 
		mgr = DBConnectionMgr.getInstance();
	}
	public void insert(MemberDTO dto) throws Exception {
		//1,2단계를 해주는 DBConnectionMgr객체 필요
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		//4단계 sql문 전달 요청
		ps.executeUpdate();
	}
	public void update(MemberDTO dto) throws Exception {
		//1,2단계를 해주는 DBConnectionMgr객체 필요
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "update member set id=?,pw=?,name=?,tel=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getId());
		
		//4단계 sql문 전달 요청
		ps.executeUpdate();
	}
	public MemberDTO select(MemberDTO dto) throws Exception {
		//1,2단계를 해주는 DBConnectionMgr객체 필요
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		//4단계 sql문 전달 요청
		ResultSet rs = ps.executeQuery();
		MemberDTO dto2 = null;
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
		}
		return dto2;
	}
	
	//제너릭 프로그래밍(객체생성시 타입을 결정가능)
	//형변환 필요없어서 내부적인 처리 속도 더 빠름.
	public ArrayList<MemberDTO> selectAll() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			Connection con = mgr.getConnection();
			//3단계 sql문 결정
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			
			//4단계 sql문 전달 요청
			ResultSet rs = ps.executeQuery();
			MemberDTO dto2 = null;
			while(rs.next()) {
				dto2 = new MemberDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				dto2.setId(id);
				dto2.setPw(pw);
				dto2.setName(name);
				dto2.setTel(tel);
				list.add(dto2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
