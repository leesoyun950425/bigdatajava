package control;

import java.util.Date;


public class DayTest2 {
	public static void main(String[] args) {

		Date date = new Date();
		int year = 1900 + date.getYear();
	
		System.out.println("앞으로 2222년 되려면 몇년이 남았나? ");
		
		int result = 2222-year;
		
		System.out.println(result +"년 남았습니다.");
	}
		
		


}
