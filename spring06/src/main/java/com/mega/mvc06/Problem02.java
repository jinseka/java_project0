package com.mega.mvc06;

public class Problem02 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요 ? ");
		try {
			System.out.println("2. 문제 발생줄 ..  ! ! " + 10 / 0);
		} catch (Exception e) {
		}
		System.out.println("3. 나도 프린트 될까요 ? ");
		
	}

}
