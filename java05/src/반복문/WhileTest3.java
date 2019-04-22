package 반복문;

public class WhileTest3 {
	public static void main(String[] args) {
		//두 개의 입력값을 받아서, 
		//첫번째값부터 두번째값까지 더함.
		int num1 = 11; //초기값(시작값)
		int num2 = 20;
		
		int sum = 0;
		while(num1 <= num2) { //조건식
			//더하는 식.
			sum = sum + num1;
			//증감식
			num1 ++;
		}
		System.out.println("11부터" + num2 + "까지 더한값은 : " + sum);
	}
}
