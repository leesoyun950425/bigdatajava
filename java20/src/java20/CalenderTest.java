package java20;

import java.util.Calendar;

	
public class CalenderTest {
	static String dayy;
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
//		System.out.println(today.get(Calendar.YEAR)+"년"); //연도
//		System.out.println(today.get(Calendar.MONTH)+1+"월"); //월
//		System.out.println(today.get(Calendar.DATE)+"일"); //일
//		System.out.println(today.get(Calendar.DAY_OF_WEEK)); //요일
//		System.out.println(today.get(Calendar.HOUR)+"시"); //시
//		System.out.println(today.get(Calendar.MINUTE)+"분"); //분
//		System.out.println(today.get(Calendar.SECOND)+"초"); //초
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		switch(day) {
		case 1 : dayy = "일"; break;
		case 2 : dayy = "월"; break;
		case 3 : dayy = "화"; break;
		case 4 : dayy = "수"; break;
		case 5 : dayy = "목"; break;
		case 6 : dayy = "금"; break;
		case 7 : dayy = "토"; break;
		}
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일 "+dayy+"요일 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
	}
}
