package 문제풀이;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class 순차문3 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("숫자1입력하세요.");
		String num2 = JOptionPane.showInputDialog("숫자2입력하세요");

		int t1 = Integer.parseInt(num1);
		int t2 = Integer.parseInt(num2);

		System.out.println("더하기의 결과 출력" + (t1 + t2));
		System.out.println("빼기의 결과 출력" + (t1 - t2));

	} // main
}// class
