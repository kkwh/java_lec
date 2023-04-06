package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {
	// JTable에서 사용할 컬럼 이름들
	private static final String[] COLUMN_NAMES = {"국어", "영어", "수학", "총점", "평균"};
	
	private DefaultTableModel model; // 테이블의 행, 열에 대한 정보를 갖는 객체
	JFrame frame;
	private JLabel lblKorean;
	private JTextField textKorean;
	private JTextField textEnglish;
	private JTextField textMath;
	private JLabel lblEnglish;
	private JLabel lblMath;
	private JButton btnInsert;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	Score score = new Score();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblKorean = new JLabel("국어");
		lblKorean.setFont(new Font("D2Coding", Font.PLAIN, 28));
		lblKorean.setBounds(12, 10, 102, 85);
		frame.getContentPane().add(lblKorean);
		
		textKorean = new JTextField();
		textKorean.setFont(new Font("D2Coding", Font.PLAIN, 28));
		textKorean.setBounds(146, 10, 416, 85);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);
		
		lblEnglish = new JLabel("영어");
		lblEnglish.setFont(new Font("D2Coding", Font.PLAIN, 28));
		lblEnglish.setBounds(12, 105, 102, 85);
		frame.getContentPane().add(lblEnglish);
		
		textEnglish = new JTextField();
		textEnglish.setFont(new Font("D2Coding", Font.PLAIN, 28));
		textEnglish.setColumns(10);
		textEnglish.setBounds(146, 105, 416, 85);
		frame.getContentPane().add(textEnglish);
		
		lblMath = new JLabel("수학");
		lblMath.setFont(new Font("D2Coding", Font.PLAIN, 28));
		lblMath.setBounds(12, 200, 102, 85);
		frame.getContentPane().add(lblMath);
		
		textMath = new JTextField();
		textMath.setFont(new Font("D2Coding", Font.PLAIN, 28));
		textMath.setColumns(10);
		textMath.setBounds(146, 200, 416, 85);
		frame.getContentPane().add(textMath);
		
		btnInsert = new JButton("입력");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				Object[] row = {10, 20, 30, 40, 60, 20};
//				model.addRow(row);
//				model.removeRow(0);				
				insert();
			}
		});
		btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 28));
		btnInsert.setBounds(12, 295, 150, 75);
		frame.getContentPane().add(btnInsert);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
			}
		}
	);
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 28));
		btnDelete.setBounds(229, 295, 150, 75);
		frame.getContentPane().add(btnDelete);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 380, 550, 289);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		Object[][] data = {}; // 테이블에 사용할 데이터
		model = new DefaultTableModel(data, COLUMN_NAMES);

		table.setModel(model);
		
		scrollPane.setViewportView(table);
	}
	
	private void insert() {
			
		try {
			int korean = Integer.parseInt(textKorean.getText());
			int english = Integer.parseInt(textEnglish.getText());
			int math = Integer.parseInt(textMath.getText());
			
			if(!(0 <= korean && korean <= 100)) {
				JOptionPane.showMessageDialog(
						frame, 
						"다시 입력해주세요.",
						"메시지", 
						JOptionPane.ERROR_MESSAGE);
						return;
			}
			else if(!(0 <= english && english <= 100)) {				
				JOptionPane.showMessageDialog(
						frame, 
						"다시 입력해주세요.",
						"메시지", 
						JOptionPane.ERROR_MESSAGE);
						return;
			}
			else if(!(0 <= math && math <= 100)) {
				JOptionPane.showMessageDialog(
						frame, 
						"다시 입력해주세요.",
						"메시지", 
						JOptionPane.ERROR_MESSAGE);
						return;
				
			} 
			score.setKorean(korean);
			score.setEnglish(english);
			score.setMath(math);				
			Object[] rows = { score.getKorean(), score.getEnglish(), score.getMath(), score.getTotal(), score.getMean()};
			model.addRow(rows);
			clearText();

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(
					frame, 
					"다시 입력해주세요: " + e1.getMessage(),
					"메시지", 
					JOptionPane.ERROR_MESSAGE);
			return;
		}
	}
	
	private void delete() {
		int row = table.getSelectedRow();
		try { 
			int confirm = JOptionPane.showConfirmDialog(
					frame,
					"정말로 삭제하시겠습니까?",
					"알림",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if(confirm == JOptionPane.YES_OPTION) model.removeRow(row);
		} catch (Exception e1) {
			try{
				model.removeRow(0);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(
						frame, 
						"더 이상 삭제할 내용이 없습니다.",
						"메시지", 
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private void clearText() {
		textKorean.setText("");
		textEnglish.setText("");
		textMath.setText("");
	}
}
