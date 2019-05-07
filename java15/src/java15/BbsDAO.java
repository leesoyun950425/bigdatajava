package java15;

import java.sql.*;

public class BbsDAO {
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//CRUD
	//������ �޼ҵ�� ������ �Ѵ�.
	public void insert(BbsDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driber");
		con = DriverManager.getConnection(url,user,password);
		String sql = "insert into bbs values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		
		ps.executeUpdate();
		
	}
	public BbsDTO select(String inputID) {
		BbsDTO dto = null; //������ �������� : ������ ��ġ!
		
		try {
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.����̹� ���� ok..");
			//2.DB����
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB���� ok..");
			//3.SQL�� ����(��üȭ)
			String sql = "select * from bbs where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputID);
			System.out.println("3.SQL�� ��üȭ ok..");
			//4.SQL�� ����
			rs = ps.executeQuery();
			System.out.println("4.SQL�� ���� ok..");
			//SQL���� ����� ������, �޾Ƽ� ó��
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
			}else {
				System.out.println("�˻� ����� �����ϴ�.");
			}
			
		} catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			System.out.println(e.getMessage());
		}finally {
			//���� �߻� ���ο� ������� ������ ������Ѿ� �ϴ� �ڵ�.
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println("�ڿ� ���� �� ���� �߻�!!");
			}//catch
		}//try-catch-finally
		return dto;
	}//select
	
	
}//class
