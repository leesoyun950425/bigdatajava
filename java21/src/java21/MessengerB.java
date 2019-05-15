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
		list.setFont(new Font("���� ���", Font.BOLD, 25));
		list.setForeground(Color.BLUE);
		list.setBackground(new Color(100, 149, 237));
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();
//				System.out.println("���� �Է��� �� : "+data);
				list.append("���� �Է� >> " +str + "\n");
				input.setText("");
				
				try {
					socket = new DatagramSocket();
					//�������� ��Ŷ�� �����Ѵ�.
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1"); //�ڱ��ڽ��� ��Ÿ���� ���� ip
					DatagramPacket packet = new DatagramPacket(data,data.length,ip,5000);
					
					socket.send(packet);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("�������", Font.BOLD, 20));
		input.setForeground(new Color(255, 255, 255));
		input.setBackground(new Color(25, 25, 112));
		setTitle("�޽���B ä��ȭ��");
		getContentPane().add(list,BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		
		list.setEditable(false);  //�� ���� ���°�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� �������� ���α׷� �����°�
		
		setVisible(true);
	}
	public void process() throws Exception {
		//��Ŷ �޴� �ڵ�(���� ����)
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("�װ� �Է�>>" + new String(data)+"\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB();
		name.process(); //������ ���� �޴� �ڵ尡 ���� ���ư��� ��.
	}
}
