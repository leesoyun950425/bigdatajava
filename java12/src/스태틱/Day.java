package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int work;
	
	public Day() {
	}

	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		work = work + time;
	}

	public static int getTotal() {
		return work; 
//		return time; 에러
		//static메소드내에 사용되는 멤버변수는 반드시 static변수만 가능 
		//객체생성과 상관없이 클래스이름으로 접근가능한 변수
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
