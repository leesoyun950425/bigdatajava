package java09;

import javax.swing.JButton;

public class 버튼100개만들기 {
	public static void main(String[] args) {
		//버튼 들어갈 자리 100개를 만들어 둠.
		JButton[] buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼");
		}
	}
}
