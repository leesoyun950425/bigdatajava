package 인터페이스2;

public class Shop implements Circle, Pay {

	@Override
	public void size() {
		System.out.println("가계의 문을 동그랗게 할 예정인데 ..");
	}

	@Override
	public void 계산하다() {
		System.out.println("반지름을 구해 반만 열리게..");
	}

	@Override
	public void 반지름을구하다() {
		System.out.println("구매한 금액을 계산한다.");
	}
}