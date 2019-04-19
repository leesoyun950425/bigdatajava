package control;

import java.util.Date;

public class 계절판별 {
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1 ;
		
		String result = null;	//String result = "";
		
		if(3 <= month && month <= 5 ) {
			result = "봄";
		}else if (6 <= month && month <= 8 ) {
			result = "여름";
		}else if(9 <= month && month <= 11) {
			result = "가을";
		}else {
			result = "겨울";
		}
	
		

		System.out.println("지금은 " + month + "월, "  + result + "입니다.");
		
	}
}
