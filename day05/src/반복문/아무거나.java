package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {
//new 
//		Random r = new Random();
//		JFrame f = new JFrame()	;
//		JButton b1 = new JButton();
//		JTextField t1 = new JTextField();
//		JLabel v1 = new JLabel();

		Random r = new Random(42);
		//랜덤한 값을 고정 시킬 때 ()안에 숫자를 쓴다.씨앗값(seed값)
		int num = r.nextInt(100); // 0-99
		System.out.println(num);
		// 50보다 작은 임의의 수 생성
		// 5~ 49
		int num1 = r.nextInt(45) + 5;
		System.out.println(num1);

		// 1000보다 작은 임의의 수 생성
		// 100~ 999
		// 최소값은 뒤에 붙혀라
		int num2 = r.nextInt(900) + 100;
		System.out.println(num2);
		
		int num4 = r.nextInt(20)+3;
		System.out.println(num4);
		//3 ~ 22
				

	}

}
