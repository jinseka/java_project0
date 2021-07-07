package 그래픽문제;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 미니프로젝트 {

	public static void main(String[] args) {

		JFrame j = new JFrame("5조 티켓");
		JPanel pn = new JPanel();
		JButton []bt = new JButton[9];
		j.setSize(1000,800);
	
	for (int i = 0; i < bt.length; i++) {
		bt[i]=new JButton("bitton"+i);
		pn.add(bt[i]);
	
	
	
	}
	j.setContentPane(pn);
	
	
	
	
	
	j.setVisible(true);
	}

}
