package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 게임계속문제 {

	public static void main(String[] args) {

//1.무한루프
//2.게임 계속 물어보고
//3. 답변에 다르게 처리
		while (true) { // 무한루프를 만들어낸다.
			String data = JOptionPane.showInputDialog("계속하실래요?(0:계속)(1:끝내기))"); // String을 사용하여
																				// OptionPane.showInputDialog에서 데이터를 받아
																				// 변수를 만들어낸다.
			int data2 = Integer.parseInt(data); // string 으로 만들어낸 변수를 숫자로 변환시킨다.
			if (data2 == 1) { // 조건문을 사용하여 변수에서 받은 답을 가지고 계속 실행시킬것인지 안할것인지 판단한다. 1의 값을 받을경우 중단한다.
				JOptionPane.showMessageDialog(null, "게임을 중지합니다."); // showMessageDialog를 사용하여 ""을 나타냅니다.
				break; // 중단하는 명령어
			} else { // 조건문에 충족하지못할경우 else가 실행된다.
				JOptionPane.showMessageDialog(null, "게임을 계속합니다."); // showMessageDialog를 사용하여 ""을 나타냅니다.
				// 게임 구현해주세요.!
				String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요"); // showMessageDialog으로 답을 받아 String num1으로
																				// 변수를 만든다.
				int sis1 = Integer.parseInt(num1); // 받은변수를 이용하여 정수로 변환한다.
				String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");// showMessageDialog으로 답을 받아 String num2으로
																			// 변수를 만든다.
				int sis2 = Integer.parseInt(num2); // 받은변수를 이용하여 정수로 변환한다.
				if (sis1 > sis2) { // 조건문을 사용하여 두 수를 비교하고 조건문에 맞으면 if문을 사용한다.
					JOptionPane.showMessageDialog(null, "첫번째분이 이겼습니다.");// 받은 값에 충족하면 showMessageDialog을 사용하여 "첫번째 분이
																		// 이겼습니다" 메세지를 띄운다.
					break; // 메세지가 나오고 종료한다.
				} else { // 조건에 충족하지 못하였을 경우 else문을 사용한다.
					JOptionPane.showMessageDialog(null, "두번째분이 이겼습니다."); // 받은 값에 충족하면 showMessageDialog을 사용하여 "두번째 분이
																			// 이겼습니다" 메세지를 띄운다.
					System.exit(0); // 종료한다.

					
					
					
				}

			}

		}

	}

}
