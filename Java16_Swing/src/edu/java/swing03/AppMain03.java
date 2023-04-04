package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AppMain03 {

	JFrame frame;
	private JTextField textField;
	private JTextField textField2;
	private JLabel lblNum1;
	private JLabel lblNum2;
	private JTextArea textResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNum1 = new JLabel("num1");
		lblNum1.setBackground(new Color(0, 128, 255));
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setFont(new Font("D2Coding", Font.PLAIN, 24));
		lblNum1.setBounds(12, 23, 200, 50);
		frame.getContentPane().add(lblNum1);
		
		lblNum2 = new JLabel("num2");
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setFont(new Font("D2Coding", Font.PLAIN, 24));
		lblNum2.setBounds(12, 99, 200, 50);
		frame.getContentPane().add(lblNum2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textField.setBounds(275, 23, 309, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textField2.setBounds(275, 99, 309, 50);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(textField.getText());
				double input2 = Double.parseDouble(textField2.getText());
				double result = input1 + input2;
				textResult.setText(String.valueOf(result));
			}
		});
		btnAdd.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnAdd.setBounds(63, 173, 100, 50);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(textField.getText());
				double input2 = Double.parseDouble(textField2.getText());
				double result = input1 - input2;
				textResult.setText(String.valueOf(result));
			}
		});
		btnSubtract.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnSubtract.setBounds(205, 173, 100, 50);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiple = new JButton("x");
		btnMultiple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(textField.getText());
				double input2 = Double.parseDouble(textField2.getText());
				double result = input1 * input2;
				textResult.setText(String.valueOf(result));
			}
		});
		btnMultiple.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnMultiple.setBounds(359, 173, 100, 50);
		frame.getContentPane().add(btnMultiple);
		
		JButton btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(textField.getText());
				double input2 = Double.parseDouble(textField2.getText());
				double result = input1 / input2;
				textResult.setText(String.valueOf(result));
			}
		});
		btnDevide.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnDevide.setBounds(532, 173, 100, 50);
		frame.getContentPane().add(btnDevide);
		
		textResult = new JTextArea();
		textResult.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textResult.setBounds(63, 233, 569, 122);
		frame.getContentPane().add(textResult);
	}
}
