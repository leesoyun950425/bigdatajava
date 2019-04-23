package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		int[] score = {44, 66 ,22 ,88}; 
		
	
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println("리스트의 값 개수 : " + score.length);
		
		score[0] = 55;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
