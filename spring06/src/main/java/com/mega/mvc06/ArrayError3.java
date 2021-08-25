package com.mega.mvc06;

public class ArrayError3 {

	public static void main(String[] args) {
			ArrayError2 arr = new ArrayError2();
			try {
				arr.array();
			} catch (Exception e) {
					System.out.println("호툴된 곳에서 예외처리");
			}
	}

}
