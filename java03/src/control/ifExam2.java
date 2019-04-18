package control;

import java.util.Scanner;

public class ifExam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요:");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요:")	;
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int maina = num1 - num2;
		int gob = num1 * num2;
		double nanu = num1 / num2;
		
		System.out.println(num1 +"+"+ num2+"="+sum);
		System.out.println(num1 +"-"+ num2+"="+maina);
		System.out.println(num1 +"*"+ num2+"="+gob);
		System.out.println(num1 +"/"+ num2+"="+nanu);
	}
}
