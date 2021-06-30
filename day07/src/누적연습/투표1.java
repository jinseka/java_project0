package 누적연습;

import javax.swing.JOptionPane;

public class 투표1 {

	public static void main(String[] args) {

		int ch1 = 0, ch2 = 0, ch3 = 0;

		for (int i = 0; i < 10; i++) { //for 은 반복문
			String reply = JOptionPane.showInputDialog(null, "투표해 주세요(1.IU 2.유재석 3.방탄)숫자로 입력해주세요");
			switch (reply) { //switch 는 조건문 
			case "1":
				ch1++;
				break;
			case "2":
				ch2++;
				break;
			case "3":
				ch3++;
				break;

			default:
				JOptionPane.showMessageDialog(null, "다시 입력해주세요");
				i--;
				break;
			}

		}
		System.out.println("---------투표결과----------");
		System.out.println("1.IU는 " +ch1+ "번 뽑혔습니다.");
		System.out.println("2.유재석은 "+ch2+"번 뽑혔습니다.");
		System.out.println("3.방탄소년단은 " +ch3+"번 뽑혔습니다.");

	}

}
