package 부품만들기;

public class 거실 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company = "사과";
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1);
		System.out.println("-----------------");
		
		//메소드 사용(call, 부르다.)
		String name = p1.call();
		System.out.println(name + "와 통화를 하다.");
		System.out.println(p1.call());
		
		//void형의 메소드를 호출한 경우에는
		//리턴받은 값이 없으므로
		//변수에 넣어줄 수도 없고,
		//프린드 해줄 수도 없다.
//		System.out.println(p1.text());
		
		int time = p1.alarm();
		System.out.println(time + "시에 울리다.");
	}
}
