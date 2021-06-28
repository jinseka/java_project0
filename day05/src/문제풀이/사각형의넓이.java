package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String garo = JOptionPane.showInputDialog("가로의 크기는?");
		String sero = JOptionPane.showInputDialog("세로의 크기는?");

		double garo2 = Double.parseDouble(garo);
		double sero2 = Double.parseDouble(sero);
//		String result = "넓이는 "+(garo2*sero2)+" 입니다.";
		String result = "넓이는 " + (garo2 * sero2) + " 입니다.";

		JOptionPane.showMessageDialog(null, result);

		
	}

}
