package 문제풀이;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 만든문제1 {

	public static void main(String[] args) {
//1.
//버튼을 누르면 랜덤숫자 나오게하기
//미리 정해놓은 숫자 뽑으면 당첨
	
		Random ran = new Random();
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(153, 255, 255));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("뽑기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int r = ran.nextInt(10);
				System.out.println(r);
				if (r==4) {
					JOptionPane.showMessageDialog(f, "당첨!!!");
					
				} else {
					JOptionPane.showMessageDialog(f, "틀렸습니다 !");
					

				}
			
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(120, 57, 239, 127);
		f.getContentPane().add(btnNewButton);

		f.setVisible(true);
		
		
		
		
	}
}
