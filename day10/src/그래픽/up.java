package 그래픽;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class up {
	// 띄워주는 함수가 필요, 함수 연결
	public void up() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요 ");
		f.add(b);
		f.add(b, BorderLayout.NORTH);
		b.addActionListener(new ActionListener() {// 인터페이스

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을때 처리하는 내용을 쓴다.
				up up = new up();
				up.up();

			}
		});

		f.setVisible(true);
	}
}
