package 자바기본;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class test01 {

	public static void main(String[] args) {
		//스캐너를 사용하여 키보드로 입력 값을 받는다.
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) { // 5번 반복하여 물어본다.
			//아침온도와 저녁온도를 JOptionPane.showInputDialog을 사용하여 물어본다.
			String temp1 = JOptionPane.showInputDialog("오늘 아침 온도는 ?");
			String temt1 = JOptionPane.showInputDialog("오늘 저녁 온도는 ?");
			//JOptionPane.showInputDialog으로 string 으로 입력받은 값을 int 정수로 변환한다. 
			int temp2 = Integer.parseInt(temp1);
			int temt2 = Integer.parseInt(temt1);
			// 조건문을 사용하여 묻고 syso 으로 나타낸다.
			if (temp2 == temt2) {
				System.out.println("아침과 저녁 온도가 같군요 ! ");
			} else {
				System.out.println("아침과 저녁 온도가 다르군요 ! ");

				
				
			} 
		}
	}

}
