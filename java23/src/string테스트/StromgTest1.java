package string�׽�Ʈ;

public class StromgTest1 {

	public static void main(String[] args) {
		String s1 = "winner";
		String s2 = "success";
		String s3 = "winner1";
		String s4 = new String("winner");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode()); //�ּҰ�
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}

}
