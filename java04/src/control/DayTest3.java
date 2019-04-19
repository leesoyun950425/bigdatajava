package control;

import java.util.Date;
import java.util.Scanner;


public class DayTest3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요 : ");
		String rank = sc.next();
		
		char result = rank.charAt(0);
		
		switch(result) {
		case 'A' :
			System.out.println("최우수입니다.");
			break;
		case 'B' :
			System.out.println("최우수입니다.");
			break;
		case 'C' :
			System.out.println("보통입니다.");
			break;
		default :
			System.out.println("통과하지 못했습니다.");
			
		}
		
	}
		
		


}
