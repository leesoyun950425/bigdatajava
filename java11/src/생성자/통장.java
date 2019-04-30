package 생성자;

import java.util.Scanner;

public class 통장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member2[] members = new Member2[3];
		
		String product,name=null;
		int money = 0;
		int sum = 0;
		for (int i = 0; i < members.length; i++) {
			System.out.print("상품명 : ");
			product = sc.next();
			System.out.print("예금주 : ");
			name = sc.next();
			System.out.print("예금액 : ");
			money = sc.nextInt();
			
			members[i] = new Member2(product,name,money);
		}
		
		System.out.println("---------------------------------------------------");
		members[1].my();
		members[2].park();
		System.out.println();
		for (int i = 0; i < members.length; i++) {
			sum = sum + members[i].money;
		}
		System.out.println("우리 집 전체 예금액은 "+sum+"만원 이에요!!");
		System.out.println("---------------------------------------------------");
	}
}
