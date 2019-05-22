package 인터페이스;

public interface BbsInterface {
	public abstract void insert(BbsDTO dto);
	public abstract void answer(BbsDTO dto);
	public abstract void ques(BbsDTO dto);
	public abstract BbsDTO select(String id);
}
