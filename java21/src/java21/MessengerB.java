package java21;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public MessengerB() throws Exception {
		socket = new DatagramSocket(6000);
		list = new JTextArea(6,20);
		list.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		list.setForeground(Color.BLUE);
		list.setBackground(new Color(100, 149, 237));
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();
//				System.out.println("내가 입력한 값 : "+data);
				list.append("내가 입력 >> " +str + "\n");
				input.setText("");
				
				try {
					socket = new DatagramSocket();
					//소켓으로 패킷을 전송한다.
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1"); //자기자신을 나타내는 가상 ip
					DatagramPacket packet = new DatagramPacket(data,data.length,ip,5000);
					
					socket.send(packet);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("나눔고딕", Font.BOLD, 20));
		input.setForeground(new Color(255, 255, 255));
		input.setBackground(new Color(25, 25, 112));
		setTitle("메신저B 채팅화면");
		getContentPane().add(list,BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		
		list.setEditable(false);  //못 쓰게 막는거
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스 눌렀을때 프로그램 닫히는거
		
		setVisible(true);
	}
	public void process() throws Exception {
		//페킷 받는 코드(무한 루프)
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("네가 입력>>" + new String(data)+"\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB();
		name.process(); //보내기 전에 받는 코드가 먼저 돌아가야 함.
	}
}
