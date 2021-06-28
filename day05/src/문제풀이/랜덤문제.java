package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {
//1.랜덤한 숫자를 2개 발생시켜서
//첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요 ! 
//두번째           더 크면 두번째가 더 커요 !

		Random num1 = new Random(); //새로운 부품을 만들어내어 cpu에 num1으로 변수를 저정한다. 
		int tar1 = num1.nextInt(100); // 랜덤하게 100 안에 정수를 만들어내 tar1에 변수를 저장한다.
		int tar2 = num1.nextInt(100); // 랜덤하게 100 안에 정수를 만들어내 tar2에 변수를 저장한다.

		System.out.println(tar1); //만들어낸 변수(tar1)를 콘솔에 나타낸다
		System.out.println(tar2); //만들어낸 변수(tar2)를 콘솔에 나타낸다 

		if (tar1 > tar2) { //if문을 사용하여 tar1과 tar2를 비교하고
			JOptionPane.showMessageDialog(null, "첫번째가 더 커요! ");
			System.out.println("tar1이 더큼");
		} else {
			JOptionPane.showMessageDialog(null, "두번째가 더 커요!");
			System.out.println("tar2이 더큼");

			//JOptionPane.showMessageDialog 을 사용하여 메세지 창을 띄운다.

		}

	}

}
