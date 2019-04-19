package control;

import java.util.Date;

public class 월별날짜판별 {
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1 ;
		String result = null;	//String result = "";
		
		switch(month) {
		case 2:
			result = "28일까지 있는 달입니다.";
			break;
		case 4: case 6: case 9: case 11:
			result = "30일까지 있는 달입니다.";
			break;
		default :
			result = "31일까지 있는 달입니다.";
		}
	
		
	
		System.out.println("지금은 " + month + "월, " + result);
		
	}
}
