package control;

public class Exam04 {
	public static void main(String[] args) {
		
		System.out.println("====================================");
		int r = 12;
		double pi = 3.14;
		double circle = pi * r * r;
		System.out.println("반지름이 " + r + "인 원의 면적은..."+circle);
		
		int width = 11;
		int height = 22;
		int area = width * height;
		System.out.println("가로가 " + width +", " + "세로가 " + height + "인 사각형의 면적은 "+ area);
		
		System.out.print("가로 세로가 같은가요? ");
		if(width == height) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.print("반지름이 10보다 큰가요? ");
		if(r>10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("====================================");
	}
}
