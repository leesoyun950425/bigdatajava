package 인터페이스_복습;

public class MemberUser {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("lsy","1234","lee","010");
		dao.insert(dto);
		dao.update(dto);
		dao.delete(dto);
		dto = dao.select("lsy");
		System.out.println(dto);
	}
}
