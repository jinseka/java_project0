package 조건문;

import java.awt.print.PrinterGraphics;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			// 1. 입력
			// 입력을 데이터를 입력을 받아서 처리해보세요.!
			String data = JOptionPane.showInputDialog("당신의 점수는 몇 점인가요?");
			// String -> int변환해서, jumsu 에 넣어주면 된다.
			int jumsu = Integer.parseInt(data);

			// 2. 처리
			String result = null; // 선언 : 타입 쓰고 변수이름 쓴다 , 램에 공간이 할당
			// 처음에 공간을 할당할 때 쓰레기값이 들어있는 공간이 할당이 됨.
			// 쓰레기 값은 프린트도 안되고, 연산도 불가능
			// 공간을 깨끗하게 하는 작업을 처음에 초기에 해두는 것이 좋다.
			// 변수의 초기화
			if (jumsu >= 90) {
				result = " A학점";
			} else if (jumsu >= 80) {
				result = "B학점";

			} else if (jumsu >= 70) {
				result = " C학점";

			} else {
				result = "F학점";

			}

			// 3. 출력
			System.out.println("당신의 학점은" + result);

			// ++, -- ; 증감연산자, RAM의 변수값을 1씩 감소/증가시켜주는 처리
			//for(시작값; 조건식; 조건식;)
			

		} // for

	}// main

}// class
