package 배열;

import java.util.Scanner;

public class 콘도예약 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] place = new int[5];
		
		System.out.println("-----------------콘도 예약을 진행합니다.----------------");
		System.out.println();
		while(true) {
			System.out.print("원하는 지역을 신청해주세요(각 지역은 2명까지 신청 가능)");
			System.out.println();
			System.out.println("-------------------------------------------------------");
			System.out.println("1)  강원도  2)  전라도  3)  파주  4)  제주도  5)  충청도  ");
			System.out.println("-------------------------------------------------------");
			for (int i : place) {
				System.out.print(i+"             ");
			}
			System.out.println();
			System.out.println("================================");
			System.out.print("원하시는 지역코드를 입력하세요.(종료는 0)>> ");
			int want = sc.nextInt();
			if(want == 0) {
				System.out.println("신청이 종료 되었습니다.");
				break;
			}
			if(place[want-1]==0) {
				place[want-1] =1;
				System.out.println("신청 가능합니다.");
				System.out.println("신청이 완료되었습니다.");
				System.out.println();
			}else if(place[want-1]==1) {
				place[want-1] = 2;
				System.out.println("신청 가능합니다.");
				System.out.println("신청이 완료되었습니다.");
				System.out.println();
			}else {
				System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
				System.out.println("다른 지역을 신청해 주세요.");
				System.out.println();
			}
		}
	}
}
