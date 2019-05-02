package 스태틱;
public class ClockResult {
	public static void main(String[] args) {
		Clock c1 = new Clock(30000,"손목시계",1,"a회사");
		Clock c2 = new Clock(20000,"뻐꾸기시계",2,"b회사");
		Clock c3 = new Clock(10000,"c회사");
	
		System.out.println(c1.getCompany()+"\t"+c1.getPrice()+"원");
		System.out.println(c2.getCompany()+"\t"+c2.getPrice()+"원");
		System.out.println(c3.getCompany()+"\t"+c3.getPrice()+"원");
	}
}
