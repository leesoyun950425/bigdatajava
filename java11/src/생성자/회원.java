package 생성자;

import java.util.Scanner;

public class 회원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member1[] members = new Member1[3];
		String id,pw,rank = null;
		int mil = 0;
		int sum = 0;
		for (int i = 0; i < members.length; i++) {
			
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				pw = sc.next();
				System.out.print("등급 : ");
				rank = sc.next();
				System.out.print("마일리지 : ");
				mil = sc.nextInt();
				
				members[i] = new Member1(id, pw, rank, mil);
		}
		System.out.println(members[0]);
		members[1].call();
		Member1 m1 = new Member1();
		for (int i = 0; i < members.length; i++) {
			sum = sum + members[i].mil;
		}
		
		System.out.println("총 마일리지는 "+sum+"입니다.");
		System.out.println("평균 마일리지는 "+sum/members.length+"입니다.");
			}
}
