package ����ƽ;

public class �����ϻ� {
	public static void main(String[] args) {
		Day day1 = new Day("�ڹٰ���",10,"����");
		Day day2 = new Day("����",15,"������");
		Day day3 = new Day("�",11,"��Ʈ�Ͻ�");
		
		System.out.println("��ü �ϴ� ���� �ð��� : " +Day.work);
		System.out.println("��ü �ϴ� ���� �ð��� : " +Day.getTotal());
		System.out.println("��� �ϴ����� �ð��� : "+ Day.work/Day.count);
		System.out.println("���� ������ �ߴ��� ? ");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("��ĥ �� �ߴ��� ? :"+Day.count+"��");
		
	}
}
