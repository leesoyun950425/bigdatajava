package 인터페이스;

public class BbsUser {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = new BbsDTO("lee","lee","lee","suwon");
		dao.insert(dto);
		dao.answer(dto);
		dao.ques(dto);
		dto = dao.select("lee");
		System.out.println(dto);
	}
}
