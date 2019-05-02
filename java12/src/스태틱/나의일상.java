package 스태틱;

public class 나의일상 {
	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"강남");
		Day day2 = new Day("여행",15,"강원도");
		Day day3 = new Day("운동",11,"피트니스");
		
		System.out.println("전체 하는 일의 시간은 : " +Day.work);
		System.out.println("전체 하는 일의 시간은 : " +Day.getTotal());
		System.out.println("평균 하는일의 시간은 : "+ Day.work/Day.count);
		System.out.println("매일 무엇을 했는지 ? ");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("며칠 간 했는지 ? :"+Day.count+"일");
		
	}
}
