package control;

import java.util.Random;
import java.util.Scanner;

public class IfTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);
		int count = 0;
		while(true) {
			count = count +1;
			System.out.print("당신이 생각한 숫자를 입력해보세요>>");
			int guess = sc.nextInt();
			if(target == guess) {
				System.out.println("정답입니다.");
				System.out.println("당신이 시도한 횟수는 "+count);
				break;
			}else {
				System.out.println("정답이 아닙니다.");
				System.out.println("다시 입력해주세요.");
				if(target < guess) {
					System.out.println("정답보다 너무 커요.");
				}else {
					System.out.println("정답보다 너무 작아요.");
				}
			}
		}//while end.
	} // main end.
}//class end.
