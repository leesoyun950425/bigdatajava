package java17;

public class HighStudent extends Student{
	int score;
	
	@Override
	public void study() {
		System.out.println("입시공부하다.");
	}
	
	public void academy() {
		System.out.println("학원을 가다.");
	}
}
