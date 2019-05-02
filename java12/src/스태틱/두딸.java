package 스태틱;

public class 두딸 {
	public static void main(String[] args) {
		아빠지갑 father = new 아빠지갑();
		아빠지갑 m1 = new 아빠지갑("김아무개1",15);
		아빠지갑 m2 = new 아빠지갑("김아무개2",5);
		
		System.out.println("두 딸이 한 번씩 용돈을 총"+아빠지갑.money+"원 가져갔어요.");
		System.out.println("두 딸의 이름은 : " +m1.name+"와 "+m2.name );
		System.out.print("두 딸은 매일 ");
		father.play();
		father.watch();
		System.out.println("아빠 지갑에는 "+(아빠지갑.totalMoney-아빠지갑.money)+"원 남았어요.");
	}
}
