package control;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("내 나이 : ");
		int my = sc.nextInt();
		System.out.print("동생 나이 : ");
		int you = sc.nextInt();
		
		if(my>=you) {
			System.out.println("내가 떡 2개를 먹어요.");
		}else {
			System.out.println("동생이 떡 2개를 먹어요.");
		}
	}
}
