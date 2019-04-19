package control;

import java.util.Random;
import java.util.Scanner;

public class GameTestWith {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보 중 선택하세요>>");
		int my = sc.nextInt();
		
		Random random = new Random();
		int com = random.nextInt(3);
		
		
		if(my == 0) {
			if(com == 2 ) {
				System.out.println("이겼습니다.");
			}else if(com == 1){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
		if(my == 1) {
			if(com == 0 ) {
				System.out.println("이겼습니다.");
			}else if(com == 2){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
		if(my == 2) {
			if(com == 1 ) {
				System.out.println("이겼습니다.");
			}else if(com == 0){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
	
		
			

	}
}
