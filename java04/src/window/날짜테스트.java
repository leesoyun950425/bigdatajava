package window;

import java.util.Date;

public class 날짜테스트 {
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int minutes = date.getMinutes();	
		int seconds = date.getSeconds();
		
		System.out.println("현재 시각은 " + hour + "시 "+minutes + "분 "+seconds + "초 입니다.");
	}
}
