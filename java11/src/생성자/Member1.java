package 생성자;

public class Member1 {
	String id;
	String pw;
	String rank;
	int mil;
	
	public Member1() {
	}
	public Member1(String id,String pw) {
		this.id = id;
		this.pw = pw;
	}
	public Member1(String id, String pw, String rank, int mil) {
		this.id = id;
		this.pw = pw;
		this.rank = rank;
		this.mil = mil;
	}
	@Override
	public String toString() {
		return  id +"의 비밀번호는 " + pw + "입니다.";
	}
	public void call() {
		System.out.println(id + "는 "+rank+"이고, 마일리지는 "+mil+"입니다.");
	}
}
