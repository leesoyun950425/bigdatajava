package control;

import java.util.Random;
import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보 중 선택하세요>>");
		int my = sc.nextInt();
		
		Random random = new Random();
		int com = random.nextInt(3);
		
		
		int result = my - com;
		
		switch(my) {
		case 0:
			if(result == -2 ) {
				System.out.println("이겼습니다.");
			}else if(result == -1){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
		case 1:
			if(result == -1 ) {
				System.out.println("이겼습니다.");
			}else if(result == 2){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
		case 2:
			if(result == 1 ) {
				System.out.println("이겼습니다.");
			}else if(result == -2){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
		}
		
			

	}
}
