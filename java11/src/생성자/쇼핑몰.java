package 생성자;

import java.util.Scanner;

public class 쇼핑몰 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[3];
		String name,tel,addr = null;
		int age = 0;
		for (int i = 0; i < members.length; i++) {
				System.out.println("가입할 정보를 입력해주세요.");
				System.out.print("가입할 이름 : " );
				name = sc.next();
				System.out.print("가입할 나이 : " );
				age = sc.nextInt();
				System.out.print("가입할 연락처 : " );
				tel = sc.next();
				System.out.print("가입할 주소 : " );
				addr = sc.next();
				members[i] = new Member(name, age, tel, addr);
		}
		
		System.out.println("쇼핑몰 회원가입 명단입니다.");
		System.out.println("========================");
		System.out.println("이름       나이        연락처       주소");
		System.out.println("------------------------------------------");
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
	}
}
