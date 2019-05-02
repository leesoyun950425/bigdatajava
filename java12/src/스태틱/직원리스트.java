package 스태틱;

public class 직원리스트 {
	public static void main(String[] args) {
		WokerTest wk1 = new WokerTest("임아무개",'남',24);
		WokerTest wk2 = new WokerTest("김아무개",'여',23);
		WokerTest wk3 = new WokerTest("박아무개",'남',25);
		
		System.out.println("전체 직원 수? " + WokerTest.woker);
		System.out.println("직원들의 평균 나이? "+WokerTest.ageTotal/WokerTest.woker);
		
		System.out.println("전체 직원 리스트 ");
		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
	}
}
