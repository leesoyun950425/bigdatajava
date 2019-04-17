package cal;

import java.util.Scanner;

public class Me2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.print("당신의 취미는?");
		String hobby = sc.next();
		
		System.out.print("평소 TV시청 시간은 얼마인가요?");
		int time = sc.nextInt();
		
		System.out.print("봄여행을 다녀왔나요?");
		boolean answer = sc.nextBoolean();
		System.out.println("----------------------------");
		
		System.out.println("내 취미는 "+hobby+"이고, 평소에 TV를 "+time+"시간도 보지 않아요.");
		System.out.println("봄여행은 "+answer+"예요.");
	}

}
