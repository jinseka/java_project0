package 새창데이터전달;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {
	public void open3(String id, String pw) {
		String m = "";
		if (id.equals("root") && pw.equals("pass")) {
			m = "로그인 성공";

		} else {
			m = "로그인 실패";
		}
		JFrame f = new JFrame("로그인창");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.setSize(500, 500);
		JButton b1 = new JButton(m);
		f.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(f, "창닫습니다");
				f.dispose();
			}
		});
		f.setVisible(true);

	}
}
