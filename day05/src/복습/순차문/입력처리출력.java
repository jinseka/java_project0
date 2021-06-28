package 복습.순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 입력처리출력 {

	// main + 컨트롤 + 스페이스
	public static void main(String[] args) {
		// 1.입력 (데이터를 가져오는 것)
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제 하시나요?");
		String time = JOptionPane.showInputDialog("몇시간이나 하시나요?");

		// 2.처리
		String result = when + "에 " + hobby + "을 하시는군요!";
//		String result  1번 =3번  when + "에 " + hobby + "을 하시는군요!" 2번;
//		String -> int 로 변화해주는 처리
		int time2 = Integer.parseInt(time);
		if (time2 >= 3) {// 비교연산자의 결과는 항상 boolean(논리데이터, true/ false)
			// 조건이 true 일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요");
		} else {
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요");

			// 조건이 false일 때 실행되는 부분

		}

		// 3.출력

		JOptionPane.showMessageDialog(null, result);
		JOptionPane.showMessageDialog(null, time2);
		// void 없다라는 뜻이다. 명령어 실행시 가져올 것이 없으니 컴파일 에러가 나온다.
	}

}
