package 반복문;

import java.util.Scanner;

public class WhileTest4 {
	public static void main(String[] args) {
		//두 개의 입력값을 받아서, 
		//첫번째값부터 두번째값까지 더함.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		System.out.print("첫번째 수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int n2 = sc.nextInt();
		
		int num1 = n1;
		int num2 = n2;
		
		int sum = 0;
		while(num1 <= num2) { //조건식
			//더하는 식.
			sum = sum + num1;
			//증감식
			num1 ++;
		}
		System.out.println("11부터" + num2 + "까지 더한값은 : " + sum);
	}
}
