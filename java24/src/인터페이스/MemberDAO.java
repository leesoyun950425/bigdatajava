package �������̽�;

public class MemberDAO implements MemberInterface {

	@Override
	public void insert(MemberDTO dto) {
		System.out.println("ȸ�� ����");
	}

	@Override
	public void delete(String id) {
		System.out.println("ȸ�� Ż��");
	}

	@Override
	public void update(MemberDTO dto) {
		System.out.println("ȸ�� ����");
	}

	@Override
	public MemberDTO select(String id) {
		MemberDTO dto = new MemberDTO("park","park","park","park");
		return dto;
	}
}
