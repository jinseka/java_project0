package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] jumsu = new int[100];
		// 랜덤한 값 하나 만들어서 배열의 하나의공간에 특정한 인덱스에 저장

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(101);  
		}
		for (int x : jumsu) {
			System.out.println(x);
			
		
		
	}
	
	}// main

}// class
