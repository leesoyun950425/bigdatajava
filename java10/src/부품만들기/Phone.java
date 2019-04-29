package 부품만들기;

public class Phone {
//	전화기=> class
//	- 특징을 찾아서 부품을 만들어야 함.
//	- 특징(attribute, property), 특성, 속성
//	- 정적특성 : 모양, 크기, 회사 => 멤버변수
	String shape ;
	int size;
	String company;
	
//	- 동적특성 : 전화하다. 문자보내다. 알람을 맞추다. => 멤버메소드
	public String call() {
		return "친구";
	}
	
	public void text() {
		System.out.println("문자하다.");
	}
	
	public int alarm() {
		return 7;
	}

	@Override
	public String toString() {
		return "[shape=" + shape + ", size=" + size + ", company=" + company + "]";
	}
	
	
}
