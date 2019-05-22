package 인터페이스;

public interface MemberInterface {
	//강제성있는 기능을 추상메소드로 정의
	//일반 변수 사용 불가, 일반 메소드로 사용 불가
	//상수 사용 가능.
	//추상적<->구체적
	//추상 : 불완전하다.
	//인터페이스는 객체를 생성하여 쓸 수 없다.
	public abstract void insert(MemberDTO dto);
	void delete(String id);
	void update(MemberDTO dto);
	MemberDTO select(String id);
	//기능을 구현하지 않는다.
}
