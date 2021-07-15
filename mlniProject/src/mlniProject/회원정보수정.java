package mlniProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원정보수정 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	public static void main(String[] args) {
		JFrame j= new JFrame("회원정보수정");
		j.setSize(500,500);
		j.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보 수정");
		lblNewLabel.setBounds(23, 23, 93, 40);
		j.getContentPane().add(lblNewLabel);
		
		JLabel lblID = new JLabel("I D");
		lblID.setBounds(23, 83, 93, 40);
		j.getContentPane().add(lblID);
		
		JLabel lblPWl = new JLabel("P W");
		lblPWl.setBounds(23, 147, 93, 40);
		j.getContentPane().add(lblPWl);
		
		JLabel lblNewLabel_3 = new JLabel("성함");
		lblNewLabel_3.setBounds(23, 205, 93, 40);
		j.getContentPane().add(lblNewLabel_3);
		
		JLabel lblEMail = new JLabel("주소");
		lblEMail.setBounds(23, 266, 93, 40);
		j.getContentPane().add(lblEMail);
		
		textField = new JTextField();
		textField.setBounds(128, 83, 185, 31);
		j.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 147, 185, 31);
		j.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 215, 185, 31);
		j.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 276, 185, 31);
		j.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("수정하기");
		btnNewButton.setBounds(35, 386, 144, 40);
		j.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(249, 386, 144, 40);
		j.getContentPane().add(btnNewButton_1);
	
		
		
		
		
		
		
		
		
		
		j.setVisible(true);

		
		
		
		
		
		
	}
}
