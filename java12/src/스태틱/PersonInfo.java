package ����ƽ;
public class PersonInfo {
	public static void main(String[] args) {
		Person p1 = new Person(180,100,"��","�����");
		Person p2 = new Person(160,60,"����");
		
		System.out.println(p1.getSecret()+"\t"+p1.getWeight());
		System.out.println(p2.getSecret()+"\t"+p2.getWeight());
		System.out.println("p2�� ���������Դ� : "+p2.goodWeight());
	}
}
