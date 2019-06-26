package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	String url = "jdbc:mysql://localhost:3306/hos";
	String user = "root";
	String password = "1234";

	DBConnectionMgr pool;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public MemberDAO() {
		pool = DBConnectionMgr.getInstance();
	}

//	notice에 글쓴이를 기준으로 자신이 쓴 글을 찾아오는 DAO작성

	public void Questioninsert(String id, int [] value) throws Exception {

		con = pool.getConnection();
					
		String sql = "insert into question values(?,?,?,?,?,?,?,?,?,?,?)";
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, value[0]);
		ps.setInt(2, value[1]);
		ps.setInt(3, value[2]);
		ps.setInt(4, value[3]);
		ps.setInt(5, value[4]);
		ps.setInt(6, value[5]);
		ps.setInt(7, value[6]);
		ps.setInt(8, value[7]);
		ps.setInt(9, value[8]);
		ps.setInt(10, value[9]);
		ps.setString(11, id);

		ps.executeUpdate();

		ps.close();
		con.close();

	}

	public boolean QuestionCheck(String id) throws Exception {

		con = pool.getConnection();

		String sql = "select * from question where name = ?";

		boolean check = false;

		ps = con.prepareStatement(sql);
		ps.setString(1, id);

		rs = ps.executeQuery();

		if (rs.next()) {
			check = true;
		} else {
			check = false;
		}

		rs.close();
		ps.close();
		con.close();

		return check;
	}

	public void insert(MemberDTO dto) throws Exception {

		con = pool.getConnection();

		String sql = "insert into member values(?,?,?,?,?,default,?)";

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getPw());
		ps.setInt(3, dto.getAge());
		ps.setString(4, dto.getGender());
		ps.setString(5, dto.getTel());
		ps.setString(6,
				dto.getSample6_address() + " " + dto.getSample6_detailAddress() + " " + dto.getSample6_extraAddress());

		ps.executeUpdate();

		ps.close();
		con.close();

	}

	public void delete(String id, String pw) throws Exception {
		con = pool.getConnection();
		String sql = "delete from member where name = ? and pw = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);

		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void delete(MemberDTO dto) throws Exception {

		con = pool.getConnection();

		String sql = "delete from member where name = ? and pw = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getPw());

		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void update(String id, int age, String tel, String addr, String pw) throws Exception {
		con = pool.getConnection();

		String sql = "update member set age = ?, tel = ?, addr = ?, pw = ? where name = ?";

		ps = con.prepareStatement(sql);
		ps.setInt(1, age);
		ps.setString(2, tel);
		ps.setString(3, addr);
		ps.setString(4, pw);
		ps.setString(5, id);

		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void update(MemberDTO dto) throws Exception {

		con = pool.getConnection();

		String sql = "update member set age = ?, tel = ?, addr = ? where name = ? and pw = ?";

		ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getAge());
		ps.setString(2, dto.getTel());
		ps.setString(3,
				dto.getSample6_address() + " " + dto.getSample6_detailAddress() + " " + dto.getSample6_extraAddress());
		ps.setString(4, dto.getName());
		ps.setString(5, dto.getPw());

		ps.executeUpdate();

		ps.close();
		con.close();

	}

	public String select(String id, String passw) throws Exception {

		con = pool.getConnection();

		String sql = "select * from member where name = ? and pw = ?";

		String name = null;
		String pw = null;
		int age = 0;
		String gender = null;
		String tel = null;
		int unum = 0;
		String addr = null;

		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, passw);

		rs = ps.executeQuery();

		while (rs.next()) {

			name = rs.getString(1);
			pw = rs.getString(2);
			age = rs.getInt(3);
			gender = rs.getString(4);
			tel = rs.getString(5);
			unum = rs.getInt(6);
			addr = rs.getString(7);

		}

		rs.close();
		ps.close();
		con.close();

		return name + " " + pw + " " + age + " " + gender + " " + tel + " " + unum + " " + addr;
	}

	public boolean loginCheck(String name, String pw) throws Exception {

		con = pool.getConnection();

		String sql = "select * from member where name = ? and pw = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, pw);
		rs = ps.executeQuery();

		boolean check = false;

		if (rs.next() == true) {
			check = true;
		} else {
			check = false;
		}

		rs.close();
		ps.close();
		con.close();

		return check;
	}

	public void pwCheck(MemberDTO dto) throws Exception {

		con = pool.getConnection();

		String sql = "select * from member where pw = ? and name = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPw());
		ps.setString(2, dto.getName());

		rs = ps.executeQuery();

		if (rs.next() == true) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		rs.close();
		ps.close();
		con.close();

	}

	public String resacall(String id, String pw) throws Exception {

		con = pool.getConnection();

		String sql = "select * from resa where name = ? and pw = ?";

		String hospital = null;
		String address = null;
		String body = null;
		String doctor = null;
		String date = null;
		String price = null;

		ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);

		rs = ps.executeQuery();

		if (rs.next()) {
			while (rs.next()) {
				hospital = rs.getString(2);
				address = rs.getString(3);
				body = rs.getString(4);
				doctor = rs.getString(5);
				date = rs.getString(6);
				price = rs.getString(7);
			}
		}

		rs.close();
		ps.close();
		con.close();

		return hospital + "," + address + "," + body + "," + doctor + "," + date + "," + price;
	}

}