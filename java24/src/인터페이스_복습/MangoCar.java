package 인터페이스_복습;

public class MangoCar implements Car{

	@Override
	public void run() {
		System.out.println("망고차가 달려요~~");
	}

	@Override
	public void speedUp() {
		System.out.println("망고차가 100으로 속도를 높여요.");
	}

	@Override
	public void speedDown() {
		System.out.println("망고차가 30으로 속도를 줄여요.");
	}

}
