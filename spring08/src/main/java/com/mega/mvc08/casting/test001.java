package com.mega.mvc08.casting;

import java.util.ArrayList;

public class test001 {

	public static void main(String[] args) {
		 ArrayList me = new ArrayList();
		
		me.add(1000);  //int 
		me.add(189.1); //double
		me.add(false); //boolean
		me.add('남'); // char
		
		System.out.println(me.size());
		System.out.println(me);
		//int <---- 오토언박싱 <---- Integer <---- 업캐스팅 <----Object 
		int money = (int)me.get(0);
		System.out.println(money + 2000);
		//double <---- 오토언박싱 <---- Double <---- 다운캐스팅 <----Object
		double cm = (double)me.get(1);
		System.out.println(cm + 10);
		
		boolean bf =(boolean)me.get(2);
		if (bf) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");

		}
		
		char gender = (Character)me.get(3);
		if (gender== '남') {
			System.out.println("주민번호는 1,3 이에요");
			
		} else {

			System.out.println("주민번호는 2,4 이에요");
		}
		
		
		
		
	}//main

}//class
