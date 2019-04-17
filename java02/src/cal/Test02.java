package cal;

public class Test02 {
	public static void main(String[] args) {
		int a = 400;
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		System.out.println("----삼항연산자로 출력");
		
		System.out.println(a == 0 ? "짝수" : "홀수");
	}
}
