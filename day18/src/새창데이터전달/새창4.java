package 새창데이터전달;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {
	public void open4(int temp) {
		String t = "";
		if (temp >= 30) {
			t="폭염";
		} else {
			t="견딜만해요";

		}
		JFrame f = new JFrame("세칭4");
		FlowLayout folw = new FlowLayout();
		f.setLayout(folw);
		f.setSize(90, 90);
		JButton b1 = new JButton(t);
		f.add(b1);
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "창닫습니다");
				f.dispose();
			}
		});

		f.setVisible(true);

	}
}
