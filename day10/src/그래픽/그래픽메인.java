package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class 그래픽메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		JButton b1 = new JButton("나는 왼쪽");
		JButton b2 = new JButton("나는 오른쪽");
		JButton b3 = new JButton("나는 가운데");
		JButton b4 = new JButton("나는 아랫쪽");
		JButton b5 = new JButton("나는 위쪽");
		f.add(b1, BorderLayout.WEST);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				left left = new left();
				left.left();
			}
		});
		f.add(b2, BorderLayout.EAST);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				light light = new light();
				light.light();
			}
		});

		f.add(b3, BorderLayout.CENTER);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				center center = new center();
				center.center();
			}
		});

		f.add(b4, BorderLayout.SOUTH);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				down down = new down();

				down.down();
			}
		});

		f.add(b5, BorderLayout.NORTH);
		b5.addActionListener(new ActionListener() {// 인터페이스

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을때 처리하는 내용을 쓴다.
				up up = new up();
				up.up();

			}
		});

		b1.setBackground(Color.yellow);
		b2.setBackground(Color.PINK);
		b3.setBackground(Color.green);
		b4.setBackground(Color.gray);
		b5.setBackground(Color.CYAN);

		Font font = new Font("궁서", Font.BOLD, 30);
		// 글씨체, 굵기, 크기
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

		f.setVisible(true);

	}

}
