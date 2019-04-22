package 반복문;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
	
		int mul = 0;
		for (int i = 1; i <=9 ; i++) {
			for (int j = 1; j <= 9; j++) {
				mul = i * j;
				System.out.print(i +"x"+j + "=" + mul + " ");
			}
			System.out.println(" ");
		}
	}
}
