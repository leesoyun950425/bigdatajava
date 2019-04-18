package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exam02 {
	public static void main(String[] args) {
		
		String ch = JOptionPane.showInputDialog("오늘의 치킨 가격은 얼마인가요?");
		int chicken = Integer.parseInt(ch);
		
		if(chicken>=9000) {
			System.out.println("내일 다시 전화할게요.");
		}else {
		System.out.println("주문할게요.");	
		}
	}
}
