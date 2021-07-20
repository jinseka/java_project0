package miniproject2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page2UI {
	private static JTextField tf2;

	public void open2() {

		JFrame f = new JFrame("투표하기_p.2민정원");
		f.getContentPane().setBackground(Color.white);
		f.getContentPane().setLayout(null);
		
		JLabel LB1_1 = new JLabel("0000님,");
		LB1_1.setForeground(Color.BLUE);
		LB1_1.setFont(new Font("바탕체", Font.BOLD, 30));
		LB1_1.setBounds(413, 32, 130, 89);
		f.getContentPane().add(LB1_1);
		f.setSize(1000, 800);
		
		JLabel LB1 = new JLabel("앞으로 진행하길 원하는 공연을 골라주세요");
		LB1.setFont(new Font("바탕체", Font.BOLD, 30));
		LB1.setForeground(Color.BLUE);
		LB1.setBounds(188, 113, 730, 89);
		f.getContentPane().add(LB1);
		
		JLabel lb1 = new JLabel("1) 라이온킹");
		lb1.setBounds(151, 245, 192, 291);
		f.getContentPane().add(lb1);
		ImageIcon p1 = new ImageIcon("라이온킹.png");
		lb1.setIcon(p1);
		
		JLabel lb2 = new JLabel("2)위키드");
		lb2.setBounds(413, 245, 192, 291);
		f.getContentPane().add(lb2);
		ImageIcon p2 = new ImageIcon("위키드.jpg");
		lb2.setIcon(p2);
		
		JLabel lb3 = new JLabel("3)투란도트");
		lb3.setBounds(680, 245, 192, 291);
		f.getContentPane().add(lb3);
		ImageIcon p3 = new ImageIcon("투란도트.jpg");
		lb3.setIcon(p3);
		
		JButton b1 = new JButton("라이온킹");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//라이온킹이 +1
				JOptionPane.showMessageDialog(f, "라이온킹에 투표완료!");
				Page2DAO db = new Page2DAO();
				 try {
					db.update(1);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b1.setBounds(173, 546, 150, 51);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("위키드");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "위키드에 투표완료!");
                Page2DAO db = new Page2DAO();
				 try {
					db.update(2);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b2.setBounds(435, 546, 150, 51);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("투란도트");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "투란도트에 투표완료!");

				Page2DAO db = new Page2DAO();
				 try {
					db.update(3);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b3.setBounds(707, 546, 150, 51);
		f.getContentPane().add(b3);
		
		
		
		f.setVisible(true);
	}
}
