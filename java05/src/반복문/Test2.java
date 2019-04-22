package 반복문;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		int su = sc.nextInt();
		
		for(int i = 1; i<=su; i++) {
			System.out.print("★");
		}
	}
}
