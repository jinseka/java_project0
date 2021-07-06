package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;

public class up2 {
	// 띄워주는 함수가 필요, 함수 연결
	public void up() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요 ");
		f.add(b);
		

		f.setVisible(true);
	}
}
