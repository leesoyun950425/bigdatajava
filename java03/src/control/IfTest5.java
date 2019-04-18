package control;

import java.util.Scanner;

public class IfTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 점수 입력 : ");
		int jumsu = sc.nextInt();
		
		String result;
		if(jumsu >= 90) {
			result = "A";
		}else if( jumsu >=80) {
			result = "B";
		}else if(jumsu >=70) {
			result = "C";
		}else if(jumsu >=60) {
			result = "D";
		}else {
			result = "F";
		}
		
		System.out.println("당신의 점수는 "+result + "입니다.");
		System.out.println(result + "학점의 학생은 이번 학기에 80%입니다.");
	} // main end.
}//class end.
