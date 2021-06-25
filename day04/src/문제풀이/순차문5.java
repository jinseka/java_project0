package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문5 {

	public static void main(String[] args) {
		// 
		String food1 = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String food2 = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");

		if (food1.equals(food2) ) {
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");

		} else {
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");

		}

	}

}
