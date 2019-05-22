package 인터페이스;

public class Caruser1 {

	public static void main(String[] args) {
		Car car = new MelonCar();
		//업캐스팅, 다형성
		//Car라는 인터페이스로 앞을 맞추어 놓고,
		//이것을 구현한 클래스는 다양하게 사용할 수 있다.
		car.start();
		car.speedUp();
		car.speedDown();
	}

}
