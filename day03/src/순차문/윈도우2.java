package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
	//j프레임	
		JFrame f = new JFrame(); 
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("저를 누르셨군요");
				JOptionPane.showMessageDialog(f, "저를 누르셨군요");
			}
		});
		btnNewButton.setFont(new Font("HY나무M", Font.ITALIC, 20));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(155, 61, 169, 56);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요");
				JOptionPane.showMessageDialog(f, "저를 또 누르셨군요");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setBounds(155, 142, 169, 56);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("굴림", Font.PLAIN, 13));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(189, 255, 116, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(93, 259, 66, 17);
		f.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(189, 318, 116, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(93, 321, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
	
		
		

		
		
		
		
		
		f.setVisible(true); // 가장 밑에 있어야 실행 가능 
		
		
		
	}
}
