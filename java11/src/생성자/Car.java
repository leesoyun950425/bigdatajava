package 생성자;

public class Car {
	//정적속성
	 String color;
	 boolean convertible;
	//동적속성
	 //단축기 : 알트 + 쉬프드 + s+o
	 public Car() {
		 System.out.println("객체생성시 초기화할 처리를 실행...");
	 }
	 //this - 이 클래스안에 멤버변수는.
	 public Car(String color) {
		 this.color = color;
	 }
	 //color는 지역변수- 메소드 안에서만 존재함
	 public Car(String color,boolean convertible) {
		 this.color = color;
		 this.convertible = convertible;
	 }

	
	public void change() {
		 System.out.println("기어를 바꾸다.");
	 }
	
	//nowSpeed는 매개변수 . 메소드와 실행사이에 다리연결을 해준다. 파라미터
	 public int speedUp(int nowSpeed) {
		 return nowSpeed + 30;
	 }
	@Override
	public String toString() {
		return "Car [color=" + color + ", convertible=" + convertible + "]";
	}
}
