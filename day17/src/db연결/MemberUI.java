package db연결;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().setBackground(new Color(255, 204, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(55, 59, 134, 53);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 204));
		t1.setFont(new Font("굴림", Font.BOLD, 16));
		t1.setBounds(212, 59, 204, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(55, 139, 134, 53);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 204));
		t2.setFont(new Font("굴림", Font.BOLD, 16));
		t2.setColumns(10);
		t2.setBounds(212, 139, 204, 39);
		f.getContentPane().add(t2);

		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(55, 221, 134, 53);
		f.getContentPane().add(lblNewLabel_2);

		t3 = new JTextField();
		t3.setBackground(new Color(255, 255, 204));
		t3.setFont(new Font("굴림", Font.BOLD, 16));
		t3.setColumns(10);
		t3.setBounds(212, 221, 204, 39);
		f.getContentPane().add(t3);

		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(55, 311, 134, 53);
		f.getContentPane().add(lblNewLabel_3);

		t4 = new JTextField();
		t4.setBackground(new Color(255, 255, 204));
		t4.setFont(new Font("굴림", Font.BOLD, 16));
		t4.setColumns(10);
		t4.setBounds(212, 311, 204, 39);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// t1~t4에 입력된 값을 가지고 와야함 .
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member 테이블에 저장하려고 함.
				// = > 해결책, 우리가 원하는 기능을 가진 메서드를 가지고 있는
				// 부품을 찾아야함.
				// 램에 가져다 놓으면 됨 .

				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel); 
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				// 가입하고 입력한거 지워버리자!
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");

			}
		});
		btnNewButton.setBackground(new Color(153, 204, 102));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(56, 374, 111, 77);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id 를 입력받아야 함 . 탈퇴조건

				String id = JOptionPane.showInputDialog("탈퇴할 id 입력");
				
				MemberDAO db = new MemberDAO();

				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "아이디를 다시 입력하세요.");
					}

				} catch (Exception e1) {
					e1.printStackTrace();

				}

			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(255, 102, 255));
		btnNewButton_1.setBounds(192, 374, 111, 77);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("수정");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = JOptionPane.showInputDialog("수정할 id 입력");
				String tel = JOptionPane.showInputDialog("수정할 tel 입력");
				MemberDAO db = new MemberDAO();
				int result;
				try {
					result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정하였습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "수정되지 않았습니다.");
					}

				} catch (Exception e1) {
					e1.printStackTrace();

				}

			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(153, 255, 255));
		btnNewButton_1_1.setBounds(327, 374, 111, 77);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);

	}
}
