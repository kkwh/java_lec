package edu.java.swing06;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AppMain06 {

	private static JFrame frame;
	private JButton btnMsgDlg;
	private JButton btnConfirmDig;
	private JButton btnOptionDlg;
	private JButton btnInputDlg;
	private JButton btnCustomDlg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnMsgDlg = new JButton("Message Dialog");
		btnMsgDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(frame, "안녕하세요"); // null과 frame의 차이
				JOptionPane.showMessageDialog(
						frame, // 메시지 다이얼로그가 실행될 부모 컴포넌트
						"안녕하세요?", // 다이얼로그에 표시될 메시지
						"메시지", // 다이얼로그 타이틀(제목)
						JOptionPane.QUESTION_MESSAGE); // 메시지 타입
			}
		});
		btnMsgDlg.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnMsgDlg.setBounds(12, 10, 410, 100);
		frame.getContentPane().add(btnMsgDlg);
		
		btnConfirmDig = new JButton("Confirm Dialog");
		btnConfirmDig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(
						frame, // 부모 컴포넌트
						"정말 삭제할까요?", // 메시지
						"삭제 확인", // 타이틀
						JOptionPane.YES_NO_CANCEL_OPTION, // 확인 옵션(yes-no, yes-no-cancel)
						JOptionPane.QUESTION_MESSAGE); // 메시지 타입
				btnConfirmDig.setText("Confirm = " + result);
			}
		});
		btnConfirmDig.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnConfirmDig.setBounds(12, 120, 410, 100);
		frame.getContentPane().add(btnConfirmDig);
		
		btnOptionDlg = new JButton("Option Dialog");
		btnOptionDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] options = {"아니요", "어려워요", "재밌어요", "쉬워요"};
				int result = JOptionPane.showOptionDialog(
						frame, // 부모 컴포넌트
						"Java Swing 재미있나여?", // 메시지
						"옵션 확인", // 타이틀
						JOptionPane.YES_NO_CANCEL_OPTION, // 옵션 타입
						JOptionPane.QUESTION_MESSAGE, // 메시지 타입
						null, // 아이콘
						options, // 옵션들의 배열
						options[2] // 옵션 초기값
						);
				btnOptionDlg.setText("Option result = " + result);
			}
		});
		btnOptionDlg.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnOptionDlg.setBounds(12, 230, 410, 100);
		frame.getContentPane().add(btnOptionDlg);
		
		btnInputDlg = new JButton("Input Dialog");
		btnInputDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				String input = JOptionPane.showInputDialog(frame, "이름?")
				Object[] selectionValues = {"10대", "20대", "30대", "40대"};
				Object input = JOptionPane.showInputDialog(
						frame, // 부모 컴포넌트
						"나이?", // 메시지 
						"나이 확인", // 타이틀
						JOptionPane.QUESTION_MESSAGE, // 메시지 타입
						null, // 아이콘
						selectionValues, // 입력으로 사용할 수 있는 선택지들의 배열
						selectionValues[1] // 선택 초기값
						);
				
				btnInputDlg.setText("Input = " + input);
			}
		});
		btnInputDlg.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnInputDlg.setBounds(12, 339, 410, 100);
		frame.getContentPane().add(btnInputDlg);
		
		btnCustomDlg = new JButton("Custom Dialog");
		btnCustomDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.showMyDialog(null);
			}
		});
		btnCustomDlg.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnCustomDlg.setBounds(12, 449, 410, 100);
		frame.getContentPane().add(btnCustomDlg);
		
		JButton btnNewButton = new JButton("Custom Frame");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyFrame.showMyFrame();
			}
		});
		btnNewButton.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnNewButton.setBounds(12, 559, 410, 100);
		frame.getContentPane().add(btnNewButton);
	}
	
	public static int getX() {	
		return frame.getX();
	}
	
	public static int getY() {
		return frame.getY();
	}
}
