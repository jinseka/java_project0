package pack04;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test04 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		Scanner sc = new Scanner(System.in);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(41, 150, 106, 56);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(41, 242, 106, 56);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(225, 168, 140, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setColumns(10);
		t2.setBounds(225, 260, 140, 50);
		f.getContentPane().add(t2);
		
		String s1 = t1.getText();
		String s2 = t2.getText();
		
		int x = Integer.parseInt(s1);
		int x2 = Integer.parseInt(s2);

		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "두 수의 합은"+(x + x2));

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(41, 350, 151, 88);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f,  "두수의 뺌은 "+(x-x2));
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(253, 350, 151, 88);
		f.getContentPane().add(btnNewButton_1);

		JButton b = new JButton("");
		b.setBounds(25, 10, 432, 130);
		f.getContentPane().add(b);

		ImageIcon car1 = new ImageIcon("car1.png");
		b.setIcon(car1);

		f.setVisible(true);
	}
}
