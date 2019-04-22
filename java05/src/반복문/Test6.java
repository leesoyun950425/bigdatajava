package 반복문;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계절[1-4]을 입력하세요=>");
			int weather = sc.nextInt();
			if( 1<= weather && weather <= 4) {
				if(weather ==1) {
					System.out.println("계절은 봄입니다.");
				}else if(weather == 2) {
					System.out.println("계절은 여름입니다.");
				}else if(weather == 3) {
					System.out.println("계절은 가을입니다.");
				}else {
					System.out.println("계절은 겨울입니다.");
				}
				break;
			}	
		}
		sc.close();
	}
}
