package com.mega.mvc08.generic;

import java.util.ArrayList;

public class Generic01 {

	public static void main(String[] args) {
		//가변적인 데이터 모음 , 변화가 많음 .
		//하나의 데이터 타입만 넣으려고 하는 경우 
//		ArrayList name = new ArrayList();
//		//박싱과 업캐스팅이 일어남.
//		list.add(100);
//		list.add(100);
//		list.add(100);
		//꺼낼때는 언박싱과 다운캐스팅을 해야함 .
		
		ArrayList<Integer> list = new ArrayList<>();
		//내가 넣는 값이 다 Integer로 들어간다.
		//제너릭 프로그램을 사용하면 캐스팅을 사용안하여 된다.
		list.add(100);
		list.add(200);
		list.add(300);
		int i1 = list.get(0);
		//1.8의 특징 제너릭 프로그램
		System.out.println(i1+100);
	
	
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(11.1);
		list2.add(11.2);
		list2.add(11.3);
		//객체생성시 사용할 데이터
		
	
	
	
	}//main

}//class
