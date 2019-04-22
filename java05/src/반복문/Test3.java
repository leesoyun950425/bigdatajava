package 반복문;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		System.out.print("세번째 수를 입력하세요 : ");
		int su3 = sc.nextInt();
		
		int sum = su1+su2+su3;
		
		System.out.println("세 개의 수를 더한 값 : " + sum);
	}
}
