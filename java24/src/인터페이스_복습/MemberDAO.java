package �������̽�_����;

public class MemberDAO implements MemberInterface{

	@Override
	public void insert(MemberDTO dto) {
		System.out.println("ȸ������ �Է�");
	}

	@Override
	public void update(MemberDTO dto) {
		System.out.println("ȸ������ ����");
	}

	@Override
	public void delete(MemberDTO dto) {
		System.out.println("ȸ������ ����");
	}

	@Override
	public MemberDTO select(String id) {
		MemberDTO dto = new MemberDTO("lsy","1234","lee","010");
		return dto;
	}
}
