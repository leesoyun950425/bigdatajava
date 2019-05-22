package 인터페이스;

public class MemberDAO implements MemberInterface {

	@Override
	public void insert(MemberDTO dto) {
		System.out.println("회원 가입");
	}

	@Override
	public void delete(String id) {
		System.out.println("회원 탈퇴");
	}

	@Override
	public void update(MemberDTO dto) {
		System.out.println("회원 수정");
	}

	@Override
	public MemberDTO select(String id) {
		MemberDTO dto = new MemberDTO("park","park","park","park");
		return dto;
	}
}
