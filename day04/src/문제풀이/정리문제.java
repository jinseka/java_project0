package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제 {
	private static JLabel lblNewLabel_1;
	private static JLabel lblNewLabel_2;
	private static JLabel lblNewLabel_3;
	private static JLabel lblNewLabel_4;
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.inactiveCaption);
		f.getContentPane().setForeground(Color.WHITE);
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 984, 15);
		f.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("먹고 싶은 음식\r\n");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(40, 59, 120, 45);
		f.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("당신의 나이는\r\n");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(40, 175, 120, 45);
		f.getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("국어점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(40, 325, 120, 45);
		f.getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("수학점수");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(40, 397, 120, 45);
		f.getContentPane().add(lblNewLabel_4);

		t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("굴림", Font.PLAIN, 28));
		t1.setBounds(198, 59, 155, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 28));
		t2.setColumns(10);
		t2.setBackground(Color.GRAY);
		t2.setBounds(198, 188, 155, 32);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 28));
		t3.setColumns(10);
		t3.setBackground(Color.PINK);
		t3.setBounds(198, 325, 155, 34);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 28));
		t4.setColumns(10);
		t4.setBackground(Color.LIGHT_GRAY);
		t4.setBounds(198, 397, 155, 30);
		f.getContentPane().add(t4);

		btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 자동으로 이 함수가 실행
				// 버튼을 클릭했을 때 처리내용을 넣으면 됨.
				String s1 = t1.getText(); // 아메리카노
				if (s1.equals("커피") || s1.equals("홍차") || s1.equals("우유")) {
					JOptionPane.showMessageDialog(lblNewLabel, "카페로 가세요.");

				} else {
					JOptionPane.showMessageDialog(lblNewLabel, "집으로 가세요");

				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 19));
		btnNewButton.setBounds(54, 126, 301, 39);
		f.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();

				int age = Integer.parseInt(s2);

				JOptionPane.showMessageDialog(lblNewLabel, "내년 나이는 " + (age + 1) + "입니다.");

			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_1.setBounds(54, 243, 299, 39);
		f.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("두과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st = t3.getText();
				String sf = t4.getText();

				int plus = Integer.parseInt(st);
				int pluss = Integer.parseInt(sf);

				int sum = plus + pluss;
				int avg1 = sum / 2;

				System.out.println("평균은 " + avg1+ "입니다.");

				JOptionPane.showMessageDialog(lblNewLabel, "두 과목의 평균은 " + avg1 + "입니다.");

			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton_2.setBounds(40, 452, 327, 74);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}
}