package �������̽�;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("�Է��ϴ�");
	}

	@Override
	public void answer(BbsDTO dto) {
		System.out.println("�亯�ϴ�");
	}

	@Override
	public void ques(BbsDTO dto) {
		System.out.println("�����ϴ�");
	}

	@Override
	public BbsDTO select(String id) {
		BbsDTO dto = new BbsDTO("le","lee","lee","suwon");
		return dto;
	}
}
