package edu.java.swing04;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AppMain04 {

	private JFrame frame;
	private JLabel lblImage;
	private ImageIcon[] imgs = { new ImageIcon("./images/image1.jpg"),
								 new ImageIcon("./images/image2.jpg"),
								 new ImageIcon("./images/image3.jpg"),
								 new ImageIcon("./images/image4.jpg"),
								 new ImageIcon("./images/image5.jpg"),
								 
								};
	private int count = 0;
	private JLabel lblX;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblImage = new JLabel(imgs[count]);
		lblImage.setBounds(30, 20, 400, 400);
		frame.getContentPane().add(lblImage);
		
		JButton btnLeft = new JButton("<");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblImage.setIcon(imgs[--count]);
//					lblX.setText("");
				} catch (ArrayIndexOutOfBoundsException e1) {
//					lblImage.setIcon(new ImageIcon("./images/x.jpg"));
//					lblX.setText("범위 초과");
//					count++;
					count = imgs.length-1;
					lblImage.setIcon(imgs[count]);
										
					return;
				}
			}
		});
		btnLeft.setFont(new Font("D2Coding", Font.PLAIN, 40));
		btnLeft.setBounds(30, 460, 100, 80);
		frame.getContentPane().add(btnLeft);
		
		JButton btnRight = new JButton(">");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblImage.setIcon(imgs[++count]);
//					lblX.setText("");
				} catch (ArrayIndexOutOfBoundsException e1) {
//					lblImage.setIcon(new ImageIcon("./images/x.jpg"));
//					lblX.setText("범위 초과");
//					count--;
					count = 0;
					lblImage.setIcon(imgs[count]);
					
					return;
				}
			}
		});
		btnRight.setFont(new Font("D2Coding", Font.PLAIN, 40));
		btnRight.setBounds(530, 460, 100, 80);
		frame.getContentPane().add(btnRight);
		
		lblX = new JLabel("");
		lblX.setFont(new Font("D2Coding", Font.PLAIN, 32));
		lblX.setBounds(469, 60, 163, 331);
		frame.getContentPane().add(lblX);
	}

}
