package 인터페이스_복습;

public interface MemberInterface {
	void insert(MemberDTO dto);
	void update(MemberDTO dto);
	void delete(MemberDTO dto);
	MemberDTO select(String id);
}
