package control;

import java.util.Date;

public class DayTest {
	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();
		
		switch(day) {
		case 7: 
			System.out.println("일요일 : 쉬는날"); break;
		case 1: 
			System.out.println("월요일 : 학원에 가는날"); break;
		case 2: 
			System.out.println("화요일 : 동네 한바퀴도는 날"); break;
		case 3: 
			System.out.println("수요일 : 게임하는 날"); break;
		case 4: 
			System.out.println("목요일 : 목욕하는 날"); break;
		case 5: 
			System.out.println("금요일 : 노는날"); break;
		default : 
			System.out.println("토요일 : 외식하는 날"); 
	
		}
	}

}
