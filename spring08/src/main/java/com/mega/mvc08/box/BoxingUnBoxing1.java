package com.mega.mvc08.box;

import javax.swing.JOptionPane;

public class BoxingUnBoxing1 {

	public static void main(String[] args) {
		//wrapper 클래스  (포장 클래스 )
		String age = JOptionPane.showInputDialog("나이를 입력 " );
		//int기본형을 자기고 정수와 관련된 여러가지 기능 처리가 불가능.
		//기본형과 관련된 여러가지 기능 처리를 하고자 하는 경우 사용하려고 
		//기본형의 특징을 가지고 클래스로 만들어 놓음 .
		//int->Integer, douvle->Double
		int age2= Integer.parseInt(age);
		System.out.println(age2+1);
		
	}

}