package java09;

public class 배열의복사 {
	public static void main(String[] args) {
		int[] num = {1,2,3}; //배열(참조, 주소)
		int num2 = 100; //정수(기본, 값)
		
		//변수의 복사(기본)
		int num3 = num2;
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		num2 = 555;
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);

		System.out.println("----------------");
		//배열의 복사(참조형 변수)
		int[] num4 = num;
		System.out.println("num : "+num[0]);
		System.out.println("num4 : "+num4[0]);
		
		num[0] = 555;
		System.out.println("num : "+num[0]);
		System.out.println("num4 : "+num4[0]);
		
		System.out.println("----------------");
		int[] num5 = num.clone();
		num[0] = 999;
		System.out.println("num : "+num[0]);
		System.out.println("num5 : "+num5[0]);
		
	}
}
