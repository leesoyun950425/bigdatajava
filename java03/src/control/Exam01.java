package control;

import javax.swing.JOptionPane;

public class Exam01 {
	public static void main(String[] args) {
		String like = JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요.");
		String hate = JOptionPane.showInputDialog("먹기 싫은 음식을 입력하세요.");
		
		System.out.println("먹고 싶은 음식 : "+ like);
		System.out.println("먹기 싫은 음식 : "+ hate);
	}
}
