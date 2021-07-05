package 문제풀이;

import java.util.Scanner;


public class 정수5개입력 {

	public static void main(String[] args) {
		int [] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력");
			
			
			num[i] = sc.nextInt();
		}
		System.out.println(num[0]+num[2]);
		sc.close(); //스트림 (연결 통로)를 닫아라 !
		
		
		
//		int[] num = { 10, 20, 30, 40, 50 };
//
//		int num1 = num[0];
//		int num2 = num[2];
//		System.out.println(num1 + num2);

	}



	
//	String [] tex = {자바, 스프링, }
//	
	
	
}
