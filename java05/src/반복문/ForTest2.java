package 반복문;

public class ForTest2 {
	int test; //전역변수(global)
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10 ; j++) {
				System.out.print("★");
			}
		
		System.out.println();
		}
	}
}
