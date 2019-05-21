package java22;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest2 extends JFrame {

    private JLabel label, label2;
    
    public CountDownTest2() {

        setTitle("ī��Ʈ�ٿ�");

        setSize(500, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Start1");
        label2 = new JLabel();

        label.setFont(new Font("Serif", Font.BOLD, 100));
        label2.setFont(new Font("Serif", Font.BOLD, 100));
        label.setForeground(Color.blue);
        label2.setForeground(Color.RED);
        setLayout(new FlowLayout());
        add(label);
        add(label2);

        (new MyThread1()).start();
        (new MyThread2()).start();

        setVisible(true);

    }

    class MyThread1 extends Thread {
        public void run() {
            for (int i = 500; i >= 0; i--) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label.setText(i + "");
            }
        }
    }
        
        class MyThread2 extends Thread {

            public void run() {
                String[] imgs = {"m1.jpg", 
                		"m2.jpg",
                		"m3.jpg",
                		"m4.jpg", 
                		"m5.jpg",
                		"m6.jpg", 
                		"m7.jpg", 
                		"m8.jpg"
                };

                for (int i = 1; i < imgs.length; i++) {
                    
                    try {
                        Thread.sleep(1000);
                        ImageIcon icon = new ImageIcon(imgs[i]);
                        label2.setIcon(icon);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                    
                }
            }
        }

    

    public static void main(String[] args) {

        CountDownTest2 t = new CountDownTest2();

    }

}