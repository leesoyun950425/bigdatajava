package java20;

import java.util.Calendar;

	
public class CalenderTest {
	static String dayy;
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
//		System.out.println(today.get(Calendar.YEAR)+"��"); //����
//		System.out.println(today.get(Calendar.MONTH)+1+"��"); //��
//		System.out.println(today.get(Calendar.DATE)+"��"); //��
//		System.out.println(today.get(Calendar.DAY_OF_WEEK)); //����
//		System.out.println(today.get(Calendar.HOUR)+"��"); //��
//		System.out.println(today.get(Calendar.MINUTE)+"��"); //��
//		System.out.println(today.get(Calendar.SECOND)+"��"); //��
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		switch(day) {
		case 1 : dayy = "��"; break;
		case 2 : dayy = "��"; break;
		case 3 : dayy = "ȭ"; break;
		case 4 : dayy = "��"; break;
		case 5 : dayy = "��"; break;
		case 6 : dayy = "��"; break;
		case 7 : dayy = "��"; break;
		}
		System.out.println("������ "+year+"�� "+month+"�� "+date+"�� "+dayy+"���� "+hour+"�� "+minute+"�� "+second+"�� �Դϴ�.");
	}
}
