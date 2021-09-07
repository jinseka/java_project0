package com.mega.mvc08.casting;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(300,500);
		
		f.setLayout(new FlowLayout());
		f.add(new Button("나는 버튼이다"));
		f.add(new JLabel("나는 라벨이다"));
		f.setVisible(true);
	}

}
