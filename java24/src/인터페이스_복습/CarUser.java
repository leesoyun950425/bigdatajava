package 인터페이스_복습;

public class CarUser {

	public static void main(String[] args) {
		Car car = new MangoCar();
		car.run();
		car.speedUp();
		car.speedDown();
	}
}
