package ����ƽ;
public class ClockResult {
	public static void main(String[] args) {
		Clock c1 = new Clock(30000,"�ո�ð�",1,"aȸ��");
		Clock c2 = new Clock(20000,"���ٱ�ð�",2,"bȸ��");
		Clock c3 = new Clock(10000,"cȸ��");
	
		System.out.println(c1.getCompany()+"\t"+c1.getPrice()+"��");
		System.out.println(c2.getCompany()+"\t"+c2.getPrice()+"��");
		System.out.println(c3.getCompany()+"\t"+c3.getPrice()+"��");
	}
}
