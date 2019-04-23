package 배열;

public class 배열연습5 {

	public static void main(String[] args) {
			double[] eye = {1.0,1.5,0.7, -0.1, 2.0};
			for (int i = 0; i < eye.length; i++) {
				System.out.print(eye[i] + " ");
			}
			System.out.println();
			
			char[] gender = {'남','여','여','남','여'};
			for (int i = 0; i < gender.length; i++) {
				System.out.print(gender[i] + " ");
			}
			System.out.println();
			
			char[] score = {'A','B','C','D','F'};
			for (int i = 0; i < score.length; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			
			String[] name = {"김길동","이길동","박길동","최길동","정길동"};
			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i] + " ");
			}
			System.out.println();
			
			int[] result = {100, 90, 80, 70,60};
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]+ " ");
			}
			
	}

}
