package control;

import java.util.Scanner;

public class IfTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요!!!");
		System.out.println("-----------");
		System.out.println("메뉴를 고르세요.");

		System.out.println("-----------");
		System.out.println("1)짜장면, 2) 짬뽕, 3) 우동");
		System.out.println("-----------");
		System.out.print("당신의 선택은? ");
		// 콘솔에서 입력class
		int food = sc.nextInt(); // 메소드==함수, 명령어
		if (food == 1) {
			System.out.println("짜장면을 선택 주문!!!");
		}
		
		if (food == 2) {
			System.out.println("짬뽕을 선택 주문!!!");
		} 
		
		if (food == 3) {
			System.out.println("우동을 선택 주문!!!");
		}  // else end.
		
		if (food != 1 && food != 2 && food != 3) {
			System.out.println("다른 음식 선택하세요.메뉴에 없어요.!!!");
			
		}
	} // main end.
}// class end.