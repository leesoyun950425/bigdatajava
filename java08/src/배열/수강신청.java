package 배열;

import java.util.Scanner;

public class 수강신청 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] object = new int[5];
		
		while(true) {
		System.out.println("수강신청을 진행합니다.");
		System.out.println("원하는 과목을 신청해주세요.");
		
		System.out.println("----------------------------------------------------------");
		System.out.println("1)  자바 2)  스프링  3)  안드로이드  4)  파이선  5)제이쿼리");
		System.out.println("----------------------------------------------------------");
		for (int i : object) {
			System.out.print(i + "             ");
		}
		System.out.println();
		System.out.println("=================================");
		
		
			System.out.print("원하는 과목코드를 입력해주세요.(종료 0)==>");
			int choose = sc.nextInt();
			if(choose == 0) {
				System.out.println("신청을 종료합니다.");
				System.out.println("안녕히가세요.");
				break;
			}
			
			if(object[choose-1] != 1) {
					object[choose-1] = 1;
					System.out.println("신청가능 합니다.");
					System.out.println("신청완료되었습니다.");
					System.out.println("---------------------------------------------------");
			}else {
					System.out.println("신청 불가능 합니다.");
					System.out.println("다른 코드 번호를 입력해주세요.");
					System.out.println("---------------------------------------------------");
			}
				}
		}
	}


