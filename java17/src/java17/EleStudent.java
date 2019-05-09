package java17;

public class EleStudent extends Student{
	String play;
	
	@Override  //재정의
	public void study() {
		System.out.println("줄넘기 연습하다.");
	}
	public void noise() {
		System.out.println("시끄럽다.");
	}

}
