package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AWindow {
public static void main(String[] args) {
	AWindow a =new AWindow();
	a.open();
}
//객체 생성시 클래스 이름과 동일한 메서드가 있으면 자동호출됨 .
//생성자 매서드 (생성자)
	public AWindow() {
		System.out.println("A객체가 생성");
		
	}
	public static void open() {
		JFrame f = new JFrame("A");
		f.setSize(300,300);
		JButton b = new JButton("B open");
	
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				BWindow b =new BWindow();
				b.open();
				f.disable();
			}
		});
		
		f.getContentPane().add(b);	
		f.setVisible(true);
	}

}
