package cal;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은?");
		String name = sc.next();
		
		System.out.print("당신의 태어난 연도는?");
		int year = sc.nextInt();
		int age = 2019-year+1;
		
		System.out.print("당신의 관심과목은?");
		String menu = sc.next();
		
		System.out.println("---------------------");
		System.out.println(name+"님은 "+age+"살이고, "+menu+"에 관심있습니다.");
		System.out.println("정확한 나이는 "+age);
		
//		잘못된 예
//		System.out.print("당신의 이름은?");
//		System.out.print("당신의 나이는?");
//		System.out.print("당신의 관심과목은?");
//		
//		String a = sc.next();
//		int b = sc.nextInt();
//		String c = sc.next();
//		
//		System.out.println("---------------------");
//		System.out.println(a+"님은 "+b+"살이고, "+c+"에 관심있습니다.");
	}
}
