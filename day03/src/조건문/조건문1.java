package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {
		int temp = 25;
		if (temp > 27) {
			//조건이 true이면 실행시키고 싶은 부분 코드
			JOptionPane.showMessageDialog(null, "에어컨ON");
		}else {JOptionPane.showMessageDialog(null,"에어컨OFF");
				//조건이 false이면 실행시키고 싶은 부분 코드
			}
			//if 뒤에 항상조건 () 이 들어간다.
	}

}
