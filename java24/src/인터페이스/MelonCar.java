package 인터페이스;

public class MelonCar implements Car {

	@Override
	public void start() {
		System.out.println("메론 카 순간 가속 빨라짐.");
	}

	@Override
	public void speedUp() {
		System.out.println("메론 카 300달림.");
	}

	@Override
	public void speedDown() {
		System.out.println("메론 카 감속 빨라짐.");
	}

}
