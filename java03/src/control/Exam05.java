package control;

import javax.swing.JOptionPane;

public class Exam05 {
	public static void main(String[] args) {
		
		System.out.println("자동차 성능 테스트");
		System.out.println("===========================");
		String speed = JOptionPane.showInputDialog("자동차 속도는?");
		double speed1 = Integer.parseInt(speed);
		System.out.println("속도 : " + speed);
		
		String save = JOptionPane.showInputDialog("자동차 안정성은?");
		double save1 = Integer.parseInt(save);
		System.out.println("안정성 : " + save);
		
		String oil = JOptionPane.showInputDialog("자동차 연비는?");
		double oil1 = Integer.parseInt(oil);
		System.out.println("연비 : " + oil);
		
		System.out.println("===========================");
		
		double speed2 = speed1 * 0.5;
		System.out.println("속도 점수(50%) : " + speed2);
		
		double save2 = save1 * 0.3;
		System.out.println("안정성 점수(30%) : " + save2);
		
		double oil2 = oil1 * 0.2;
		System.out.println("연비 점수(20%) : " + oil2);
		
		System.out.println("===========================");
		
		double tot = speed2+save2+oil2;
		if(tot>=80) {
			System.out.println(tot + "점 우수입니다.");
		}else {
			System.out.println(tot + "점 미달입니다.");
		}
	}
}
