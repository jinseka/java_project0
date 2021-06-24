package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_4;

	public static void main(String[] args) {
	//j프레임	
		JFrame f = new JFrame(); 
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(88, 230, 335, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 199, 335, 21);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 163, 335, 21);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setBounds(41, 166, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("날씨");
		lblNewLabel_1.setBounds(41, 202, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("제목");
		lblNewLabel_1_1.setBounds(41, 233, 57, 15);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("내용");
		lblNewLabel_2.setBounds(41, 329, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.inactiveCaption);
		textField_4.setBounds(88, 266, 335, 138);
		f.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저장하였습니다.");
				JOptionPane.showMessageDialog(f, "저장되었습니다");
			}
		});
		btnNewButton.setBounds(104, 428, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("낙서장을 켰습니다.");
				JOptionPane.showMessageDialog(f, "낙서장");
			}
		});
		btnNewButton_1.setBounds(213, 428, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("닫기");
		btnNewButton_1_1.setBounds(322, 428, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("나의 일기장");
		lblNewLabel_3.setBackground(SystemColor.activeCaption);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 55));
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setBounds(32, 10, 391, 117);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("오늘의 일기장성을 시작합니다");
		lblNewLabel_4.setBounds(32, 137, 391, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true); // 가장 밑에 있어야 실행 가능 
		
		
		
	}
}
