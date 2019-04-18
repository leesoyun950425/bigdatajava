package control;

public class IfTest1 {
	public static void main(String[] args) {
		//if뒤에는 반드시 조건을 쓴다!!
		//조건의 결과는 blooean(논리형, true, false)
		
		int food = 2; //콘솔에서 입력
		if(food ==1) { 
			System.out.println("짜장면을 선택!!!");
		}else if(food ==2){
			System.out.println("짬뽕을 선택!!!");
		}else if(food ==3){
			System.out.println("우동을 선택!!!");
		}else {
			System.out.println("다시 선택해주세요. 없는 메뉴입니다.");
		}
	} // main end.
}//class end.
