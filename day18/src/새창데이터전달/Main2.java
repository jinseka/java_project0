package 새창데이터전달;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창 ... ! 여기서 시작.");
		f.setSize(468, 595);
		Font font = new Font("궁서", Font.BOLD, 30);
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(111, 183, 221, 43);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창3 w3 = new 새창3();
				w3.open3(t1.getText(), t2.getText());

			}

		});

		JButton b2 = new JButton("결정 ! ");
		b2.setBounds(111, 445, 221, 43);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String no =t3.getText();
//				int no2 =Integer.parseInt(no);

				새창4 w4 = new 새창4();

				w4.open4(Integer.parseInt(t3.getText()));

			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);

		t1 = new JTextField();
		t1.setBackground(new Color(255, 204, 255));
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(111, 10, 221, 59);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBackground(new Color(255, 204, 255));
		t2.setBounds(111, 90, 221, 59);
		f.getContentPane().add(t2);

		JLabel t1ttt = new JLabel("I D :");
		t1ttt.setFont(new Font("굴림", Font.BOLD, 15));
		t1ttt.setBounds(12, 10, 68, 59);
		f.getContentPane().add(t1ttt);

		JLabel t2ttt = new JLabel("P W :");
		t2ttt.setFont(new Font("굴림", Font.BOLD, 15));
		t2ttt.setBounds(12, 90, 68, 59);
		f.getContentPane().add(t2ttt);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setBackground(new Color(255, 204, 255));
		t3.setBounds(170, 318, 221, 59);
		f.getContentPane().add(t3);

		JLabel ttt = new JLabel("오늘의 온도");
		ttt.setFont(new Font("굴림", Font.BOLD, 15));
		ttt.setBounds(12, 320, 125, 59);
		f.getContentPane().add(ttt);

		f.setVisible(true);

	}

}
