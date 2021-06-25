package 문제풀이;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 36));
		lblNewLabel.setBounds(56, 229, 131, 94);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(56, 369, 131, 94);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBounds(199, 259, 197, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(199, 398, 197, 39);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton(" =");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String num1 = t1.getText();
				String num2 = t2.getText();

				int intnum1 = Integer.parseInt(num1);
				int intnum2 = Integer.parseInt(num2);
				int sum = intnum1 + intnum2;
				System.out.println("답은" + sum + "입니다.");

				JOptionPane.showMessageDialog(btnNewButton, "답은" + sum + "입니다.");

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setBounds(147, 473, 167, 50);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);

	}

}
