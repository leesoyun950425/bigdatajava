package java17;

public class StudentUser {
	public static void main(String[] args) {
		EleStudent el = new EleStudent();
		MidStudent mi = new MidStudent();
		HighStudent hi = new HighStudent();
		el.noise();
		mi.height();
		hi.academy();
		hi.brain = "똑똑하다";
		System.out.println(hi.brain);
		hi.study();
		mi.study();
		el.study();
	}
}
