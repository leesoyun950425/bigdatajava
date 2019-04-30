package 생성자;

public class Tour {
	public static void main(String[] args) {
		//new원본복사 -> 멤버변수가 복사가된다. 변수의 초기화. car1변수에 Car의 주소값을 복사.
		Car car1 = new Car();
		car1.color = "검정색";
		car1.convertible = true;
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedUp(100);
		System.out.println(exSpeed+"로 속도를 Up");
		
		System.out.println();
		
		Car car2 = new Car("빨간색", false);
		System.out.println(car2);
		
		Car car3 = new Car("빨강");
		System.out.println(car2);
	
		
	}
}
