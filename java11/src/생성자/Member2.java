package 생성자;

public class Member2 {
	String product,name;
	int money;
	
	public Member2() {
	}

	public Member2(String product, String name, int money) {
		this.product = product;
		this.name = name;
		this.money = money;
	}
	
	public void my() {
		System.out.println(product+" 통장에는 "+money+"만원이 들어있어요.");
	}
	public void park() {
		System.out.println(name+"의 통장에는 "+money+"만원이 들어있어요.");
	}
}
