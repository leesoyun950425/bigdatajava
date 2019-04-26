package 배열;

import java.util.Scanner;

public class 파티참석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("파티에 참석한 사람의 명단(이름+나이)을 입력하세요>>");
			String names = sc.next();
			int ages = sc.nextInt();
			name[i] = names;
			age[i] = ages;
		}
		System.out.println("전체 인원수는 " + name.length);
		
		System.out.println("파티 참석자 전체 명단입니다.");
		System.out.println("이름은 : "+name[0]+", "+"나이는 : "+age[0]);
		System.out.println("이름은 : "+name[1]+", "+"나이는 : "+age[1]);
		System.out.println("이름은 : "+name[2]+", "+"나이는 : "+age[2]);
		System.out.println("이름은 : "+name[3]+", "+"나이는 : "+age[3]);
		System.out.println("이름은 : "+name[4]+", "+"나이는 : "+age[4]);
		
		double result = 0;
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			int sum1 = age[i];
			sum = sum1+sum;
			result = sum / age.length;
		}
		System.out.println("파티 참석자 나이의 평균은 "+result+"세");
	}
}
