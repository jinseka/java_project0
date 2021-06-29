package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); 
		f.getContentPane().setBackground(new Color(0, 0, 153));
		f.setSize(500, 500);	
		//레이아웃을 지정하지 않으면 내가 넣고 싶은곳에 넣을 수 있다.
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		});
		btnNewButton.setBounds(182, 34, 163, 54);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i <5; i++) {
					System.out.print("커피*");
					
				}
				System.out.println(); //엔터 
			}
		});
		btnNewButton_1.setBounds(182, 118, 163, 54);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i <3; i++) {
					
					System.out.println("커피*우유");
				
					
				}
			}
		});
		btnNewButton_2.setBounds(182, 215, 163, 54);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1:짱!");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <4; i++) { //i가 점점 늘어날때 3까지면 <4 or <=3
					System.out.println(i+":짱!");
				
				}
			}
		});
		btnNewButton_3.setBounds(182, 332, 163, 54);
		f.getContentPane().add(btnNewButton_3);
		
		
		
		
		
		f.setVisible(true);
	
	
	
	}
}
//이미지는 프로젝트 이름 밑에넣는다