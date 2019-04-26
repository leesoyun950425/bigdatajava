package java09;

import java.util.Scanner;

public class 영화예매프로그램 {
	public static void main(String[] args) {
		int[][] seat = new int[3][10];
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------------------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print("      "+(i+1) + " ");
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i+1 + "열  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "       ");
				}
				System.out.println();
			}
			System.out.print("종료0, 예약 1>> ");
			int end = sc.nextInt();
			if (end == 0) {
				System.out.println("시스템 종료...");
				break;
			}else {
				System.out.print("행 입력 : "); 
				int row = sc.nextInt();
				System.out.print("열 입력 : "); 
				int col = sc.nextInt();
				
				//예약이 되었는지 확인
				//예약가능하면, 예약처리
				if(seat[row-1][col-1]==0) {
					seat[row-1][col-1] = 1;
					System.out.println("예약완료.");
				}else{
					//예약불가능하면, 재입력 요구
					System.out.println("예약이 이미 완료된 자리입니다.");
					System.out.println("좌석을 재입력해주세요.");
				}
			}
			
			
		}
	}
}
