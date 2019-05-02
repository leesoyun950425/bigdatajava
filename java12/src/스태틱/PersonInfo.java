package 스태틱;
public class PersonInfo {
	public static void main(String[] args) {
		Person p1 = new Person(180,100,"비만","서울시");
		Person p2 = new Person(160,60,"보통");
		
		System.out.println(p1.getSecret()+"\t"+p1.getWeight());
		System.out.println(p2.getSecret()+"\t"+p2.getWeight());
		System.out.println("p2의 적정몸무게는 : "+p2.goodWeight());
	}
}
