package 인터페이스;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("입력하다");
	}

	@Override
	public void answer(BbsDTO dto) {
		System.out.println("답변하다");
	}

	@Override
	public void ques(BbsDTO dto) {
		System.out.println("질문하다");
	}

	@Override
	public BbsDTO select(String id) {
		BbsDTO dto = new BbsDTO("le","lee","lee","suwon");
		return dto;
	}
}
