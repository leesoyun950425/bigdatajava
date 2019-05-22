package 인터페이스_복습;

public class MemberDAO implements MemberInterface{

	@Override
	public void insert(MemberDTO dto) {
		System.out.println("회원정보 입력");
	}

	@Override
	public void update(MemberDTO dto) {
		System.out.println("회원정보 수정");
	}

	@Override
	public void delete(MemberDTO dto) {
		System.out.println("회원정보 삭제");
	}

	@Override
	public MemberDTO select(String id) {
		MemberDTO dto = new MemberDTO("lsy","1234","lee","010");
		return dto;
	}
}
