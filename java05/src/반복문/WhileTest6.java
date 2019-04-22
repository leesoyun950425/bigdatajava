package 반복문;

import java.util.Scanner;

public class WhileTest6 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 9;
		
		int gob = 1;
		while(num1 <= num2) {
			gob = gob * num1;
			
			num1 ++;
		}
		
		System.out.println("1부터 "+num2+"까지의 곱은 : " + gob);
	}
}
