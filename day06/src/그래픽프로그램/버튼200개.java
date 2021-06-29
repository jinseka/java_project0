package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 800);//사이즈 
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //버튼끼리 붙게 만들어주는거
		
		
		
		for (int i = 0; i < 200; i++) {
			JButton b1 = new JButton((i+1)+"번");
			f.add(b1);
		}
		f.setVisible(true);
	}

}
