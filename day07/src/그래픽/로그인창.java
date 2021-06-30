package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.soap.Text;
import java.awt.Font;
import java.awt.Color;

public class 로그인창 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 처리 화면");
		f.getContentPane().setBackground(new Color(204, 204, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel result = new JLabel("결과보이는 곳 ");
		result.setForeground(new Color(255, 0, 0));
		result.setFont(new Font("굴림", Font.BOLD, 18));
		result.setBounds(59, 368, 268, 46);
		f.getContentPane().add(result);

		JLabel i1 = new JLabel("아이디 : ");
		i1.setFont(new Font("굴림", Font.BOLD, 21));
		i1.setBounds(45, 96, 105, 46);
		f.getContentPane().add(i1);

		JLabel i2 = new JLabel("비밀번호 : ");
		i2.setFont(new Font("굴림", Font.BOLD, 18));
		i2.setBounds(45, 209, 105, 46);
		f.getContentPane().add(i2);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 12));
		t1.setBounds(218, 109, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 12));
		t2.setColumns(10);
		t2.setBounds(218, 222, 116, 21);
		f.getContentPane().add(t2);

		// 기능별로 테스트 : 단위테스트

		JButton b1 = new JButton("로그인 확인");
		b1.setFont(new Font("굴림", Font.BOLD, 17));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인 버튼을 누를때 실행된다.
				// 로그인 확인 버튼을 눌렀을때 아이디 패스워드를 가져와야한다.

				String s1 = t1.getText(); 
				String s2 = t2.getText(); 
				if (s1.equals("apple") && s2.equals("pass")) {
					result.setText("로그인 성공");

				} else {
					result.setText("로그인 실패");
				}

			}
		});
		b1.setBounds(53, 290, 154, 68);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("지우기");
		b2.setFont(new Font("굴림", Font.BOLD, 17));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");

			}
		});
		b2.setBounds(249, 290, 154, 68);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
