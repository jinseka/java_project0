package com.mega.mvc05.static1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum; //전역변수 사용하려면 static 붙어야 한다. 
	//main이 static이므로 , 객체를 생성하지 않아도 접근이 가능한 변수여야 한다.
	//main안에서 사용하는 전역변수는 반드시 static으로 만들어 주어야 한다.
	//static은 최소화시킨다 .  아니면 메모리 폭발한다.
	final static int price = 5000;  //상수 
	
	
	public static void main(String[] args) {
		//main이 static인 이유는
		//객체생성하지 않아도 main부터 시작하기 떄문 ..
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(800,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수 :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(483, 10, 68, 53);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		count.setBackground(new Color(204, 204, 255));
		count.setFont(new Font("굴림", Font.BOLD, 12));
		count.setBounds(541, 10, 177, 53);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\K\\Desktop\\5.jpg"));
		img.setBounds(96, 83, 633, 290);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액");
		result.setFont(new Font("굴림", Font.BOLD, 18));
		result.setBounds(96, 392, 448, 35);
		f.getContentPane().add(result);
		
		JButton b1 = new JButton("1집앨범");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sum++;
			count.setText(sum+"개");
			ImageIcon icon = new ImageIcon("2.jpg");
			
			img.setIcon(icon);
			int price2 =sum*price;
			result.setText("결제금액 :  " + price2 +"원");
			
			}
		});
		b1.setBackground(new Color(147, 112, 219));
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		b1.setBounds(101, 15, 106, 48);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("2집앨범");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				
				count.setText(sum+"개");
				ImageIcon icon = new ImageIcon("3.jpg");
				
				img.setIcon(icon);
				int price2 =sum*price;
				result.setText("결제금액 :  " + price2 +"원");
		
			}
		});
		b2.setBackground(new Color(135, 206, 250));
		b2.setFont(new Font("굴림", Font.BOLD, 15));
		b2.setBounds(219, 13, 106, 48);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("3집앨범");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				ImageIcon icon = new ImageIcon("5.jpg");
				img.setIcon(icon);
				int price2 =sum*price;
				result.setText("결제금액 :  " + price2 +"원");
			
		
			}
		});
		b3.setBackground(new Color(240, 230, 140));
		b3.setFont(new Font("굴림", Font.BOLD, 15));
		b3.setBounds(337, 13, 106, 48);
		f.getContentPane().add(b3);
		
		
		
		
		
		
		f.setVisible(true);
	}
}
