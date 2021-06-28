package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		// 시작값 :3
		// 종료값 :10
		// 3,4, ~ 10 까지 프린트
		String start = JOptionPane.showInputDialog("시작값을 입력하세요");
		String end = JOptionPane.showInputDialog("종료값을 입력하세요");
		int num1 = Integer.parseInt(start);
		int num2 = Integer.parseInt(end);
		

		int i = num1; // 시작값

		while (i <= num2) { // 조건식
			System.out.println(i);

			i++; // 증감식
		}
	}
}

//1부터 10까지 중 2씩 점프해서 찍어보자.
//1부터 100까지 중 5씩 점프해서 찍어보자.
//100부터 1까지 점프해서
//1000부터 0까지 8씩 점프해서 찍어보자.