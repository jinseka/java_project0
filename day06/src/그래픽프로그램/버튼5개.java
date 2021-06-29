package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼5개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개"); // 스윙이라는 기술에 포함되어있다. 스윙전에 그래픽 프로그램이있었다. 프레임이라고 있었는데 그닝을 붙혀 jframe을 만들었다.
		f.setSize(500, 500);	//set, get 반대 의미
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f,"북쪽입니다." );
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("가운데");
		btnNewButton_2.setBackground(new Color(255, 255, 204));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(new Color(102, 204, 255));
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다.");
			}
		});
		btnNewButton_4.setBackground(new Color(153, 255, 153));
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
	
	
	
	}
	

}
