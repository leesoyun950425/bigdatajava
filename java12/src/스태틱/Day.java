package ����ƽ;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int work;
	
	public Day() {
	}

	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		work = work + time;
	}

	public static int getTotal() {
		return work; 
//		return time; ����
		//static�޼ҵ峻�� ���Ǵ� ��������� �ݵ�� static������ ���� 
		//��ü������ ������� Ŭ�����̸����� ���ٰ����� ����
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
